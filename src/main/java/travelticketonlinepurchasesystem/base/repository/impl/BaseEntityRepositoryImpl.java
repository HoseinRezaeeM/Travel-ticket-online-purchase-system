package travelticketonlinepurchasesystem.base.repository.impl;



import travelticketonlinepurchasesystem.base.domin.BaseEntity;
import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;

public abstract class BaseEntityRepositoryImpl<ID extends Serializable, T extends BaseEntity<ID>> implements BaseEntityRepository<ID, T> {

    protected EntityManager entityManager;

    public BaseEntityRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public T save(T entity) {
        beginTransaction();
        entity = saveWithoutTransaction(entity);
        commitTransaction();
        return entity;
    }
    @Override
    public T update(T entity) {
        beginTransaction();
        T merge = entityManager.merge(entity);
        commitTransaction();
        entityManager.clear();
        return merge;
    }

    private T saveWithoutTransaction(T entity) {
        if (entity.getId() == null)
            entityManager.persist(entity);
        else
            entity = entityManager.merge(entity);
        return entity;
    }

    @Override
    public void deleteById(ID id) {  // By Optional
        beginTransaction();
        Optional<T> optional = findById(id);
        optional.ifPresent(entityManager::remove);
        commitTransaction();
    }

    @Override
    public Collection<T> findAll() {  // By Criteria
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<T> criteriaQuery =criteriaBuilder.createQuery(getEntityClass());
        Root<T> from = criteriaQuery.from(getEntityClass());
        CriteriaQuery<T> select =criteriaQuery.select(from);
        return entityManager.createQuery(select).getResultList();
    }

    @Override
    public Optional<T> findById(ID id) {
        return Optional.ofNullable(entityManager.find(getEntityClass(),id));
    }

    public abstract Class<T> getEntityClass();

    @Override
    public void beginTransaction() {
        if (!entityManager.getTransaction().isActive())
            entityManager.getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        if (entityManager.getTransaction().isActive())
            entityManager.getTransaction().commit();

    }

    @Override
    public void rollBack() {
        if (entityManager.getTransaction().isActive())
            entityManager.getTransaction().rollback();
    }
}

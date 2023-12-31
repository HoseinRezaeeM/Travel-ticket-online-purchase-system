package travelticketonlinepurchasesystem.base.repository;


import travelticketonlinepurchasesystem.base.domin.BaseEntity;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;

public interface BaseEntityRepository<ID extends Serializable,T extends BaseEntity<ID>> {

    T save(T entity);

    public T update(T entity);

    void deleteById(ID id);

    Collection<T> findAll();

    Optional<T> findById(ID id);

    void beginTransaction();

    void commitTransaction();

    void rollBack();
}

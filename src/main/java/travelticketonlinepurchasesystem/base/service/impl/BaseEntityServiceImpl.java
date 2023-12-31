package travelticketonlinepurchasesystem.base.service.impl;

import travelticketonlinepurchasesystem.base.domin.BaseEntity;
import travelticketonlinepurchasesystem.base.repository.BaseEntityRepository;
import travelticketonlinepurchasesystem.base.service.BaseEntityService;

import java.io.Serializable;
import java.util.Collection;
import java.util.Optional;

public class BaseEntityServiceImpl<ID extends Serializable, T extends BaseEntity<ID>, R extends BaseEntityRepository<ID, T>>
        implements BaseEntityService<ID, T> {
    protected final R baseRepository;

    public BaseEntityServiceImpl(R baseRepository) {
        this.baseRepository = baseRepository;
    }

    @Override
    public T save(T entity) {
        return baseRepository.save(entity);
    }

    @Override
    public void deleteById(ID id) {
        baseRepository.deleteById(id);
    }

    @Override
    public T update(T entity) {
        return baseRepository.update(entity);
    }

    @Override
    public Collection<T> findAll() {
        return baseRepository.findAll();
    }

    @Override
    public Optional<T> findById(ID id) {
        return baseRepository.findById(id);
    }

    @Override
    public void beginTransaction() {
        baseRepository.beginTransaction();
    }

    @Override
    public void commitTransaction() {
        baseRepository.commitTransaction();
    }

    @Override
    public void rollBack() {
        baseRepository.rollBack();
    }
}

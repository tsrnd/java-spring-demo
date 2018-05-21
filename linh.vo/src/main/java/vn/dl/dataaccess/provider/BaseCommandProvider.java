package vn.dl.dataaccess.provider;

import vn.dl.domain.ExecutionResult;

public interface BaseCommandProvider<T> {
	ExecutionResult insert(T entity);
    ExecutionResult update(T entity);
    ExecutionResult delete(T entity);
    T getById(Long Id);
}

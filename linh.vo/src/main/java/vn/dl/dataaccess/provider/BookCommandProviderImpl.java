package vn.dl.dataaccess.provider;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import vn.dl.dataaccess.repository.BookCommandRepository;
import vn.dl.domain.ExecutionResult;
import vn.dl.domain.entity.BookEntity;

@Component
public class BookCommandProviderImpl implements BookCommandProvider {
	
	private static final Logger logger = LoggerFactory.getLogger(UserCommandProviderImpl.class);
	
	@Autowired
	private BookCommandRepository bookCommandRepository;
	
	@Override
	public ExecutionResult insert(BookEntity entity) {
		ExecutionResult result = new ExecutionResult();
		try {
			bookCommandRepository.save(entity);
		} catch (Exception e) {
			logger.error(e.getMessage());
			result.setError(e);
			throw e;
		}
		return result;
	}

	@Override
	public ExecutionResult update(BookEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ExecutionResult delete(BookEntity entity) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public BookEntity getById(Long Id) {
		// TODO Auto-generated method stub
		return null;
	}

}

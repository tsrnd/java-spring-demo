package main.dataaccess.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import main.domain.entity.UserSubscriber;

public interface UserSubscriberRepository extends JpaRepository<UserSubscriber, Long>, UserSubscriberRepositoryExtension {

	@Query("SELECT s FROM UserSubscriber s WHERE s.userId = ?1")
	public List<UserSubscriber> getSubscribers(long userId);
}

package main.dataaccess.provider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.repository.UserRepository;
import main.dataaccess.repository.UserSubscriberRepository;
import main.domain.UserSubscriber;

@Component
public class UserSubscriberQueryProviderImpl implements UserSubscriberQueryProvider {

	@Autowired
	UserSubscriberRepository repository;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<UserSubscriber> getSubscribers(long userId) {
		List<UserSubscriber> result = repository.getSubscribers(userId);
		for (UserSubscriber subscriber : result) {
			subscriber.setSubscriber(userRepository.findOne(subscriber.getSubscriberId()));
		}
		return repository.getSubscribers(userId);
	}
}

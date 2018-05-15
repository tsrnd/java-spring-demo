package main.business.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.UserSubscriberQueryProvider;
import main.domain.UserSubscriber;

@Component
public class UserSubcriberQueryManager {

	@Autowired
	private UserSubscriberQueryProvider provider;

	public List<UserSubscriber> getSubscriber(long userId) {
		return provider.getSubscribers(userId);
	}

}

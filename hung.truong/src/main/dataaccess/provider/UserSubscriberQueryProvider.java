package main.dataaccess.provider;

import java.util.List;

import main.domain.UserSubscriber;

public interface UserSubscriberQueryProvider {

	public List<UserSubscriber> getSubscribers(long userId);
}

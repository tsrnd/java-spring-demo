package main.dataaccess.provider;

import java.util.List;

import main.domain.entity.UserSubscriber;

public interface UserSubscriberQueryProvider {

	public List<UserSubscriber> getSubscribers(long userId);
}

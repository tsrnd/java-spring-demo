package main.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import main.business.services.UserSubcriberQueryManager;
import main.domain.ResponseData;

@Component
public class UserSubscriberManager {

	@Autowired
	private UserSubcriberQueryManager queryManager;
	
	public ResponseEntity<ResponseData> getSubscribers(long userId) {
		return ResponseEntity.ok(ResponseData.builder().data(queryManager.getSubscriber(userId)).build());
	}
}

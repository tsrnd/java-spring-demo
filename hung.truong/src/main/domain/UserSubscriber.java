package main.domain;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import main.constant.Constant;

@Entity
@Table(name = Constant.SUBSCRIBER_USER_TABLE_NAME)
public class UserSubscriber {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "user_id")
	private Long userId;
	@Column(name = "subscriber_id")
	private Long subscriberId;
	@Column(name = "subscribe_at")
	private Date subscribeAt;
	@Column(name = "subscribe_duration")
	private long subscribeDuration;

	@Transient
	private User subscriber;	
	
	public User getSubscriber() {
		return subscriber;
	}

	public void setSubscriber(User subscriber) {
		this.subscriber = subscriber;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getSubscribeAt() {
		return subscribeAt;
	}

	public void setSubscribeAt(Date subscribeAt) {
		this.subscribeAt = subscribeAt;
	}

	public long getSubscribeDuration() {
		return subscribeDuration;
	}

	public void setSubscribeDuration(long subscribeDuration) {
		this.subscribeDuration = subscribeDuration;
	}
}

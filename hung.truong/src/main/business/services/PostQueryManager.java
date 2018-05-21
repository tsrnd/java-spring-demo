package main.business.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import main.dataaccess.provider.PostQueryProvider;
import main.dataaccess.provider.UserQueryProvider;
import main.domain.ResponseData;

@Component
public class PostQueryManager {

	@Autowired
	private UserQueryProvider userQuery;

	@Autowired
	private PostQueryProvider queryProvider;

	public ResponseData getUserPosts(long userId) {
		ResponseData.Builder builder = ResponseData.builder();
		if (userQuery.getUserById(userId) == null) {
			return builder.success(false).status(HttpStatus.BAD_REQUEST).build();
		}
		return builder.data(queryProvider.getUserPost(userId)).status(HttpStatus.OK).build();
	}
}

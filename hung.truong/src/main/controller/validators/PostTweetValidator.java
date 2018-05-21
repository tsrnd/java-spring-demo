package main.controller.validators;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import main.domain.PostTweetRequest;

@Component
public class PostTweetValidator implements Validator {

	@Override
	public boolean supports(Class<?> clazz) {
		return clazz.equals(PostTweetRequest.class);
	}

	@Override
	public void validate(Object object, Errors errors) {
		if (object instanceof PostTweetRequest) {
			PostTweetRequest request = (PostTweetRequest) object;
			if (request.getContent().length() <= 10) {
				errors.reject("content", "Content lenght must be > 10");
			}
		}
	}

}

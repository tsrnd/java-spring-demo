package com.tsrnd.javax.suho.training.service.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import com.tsrnd.javax.suho.training.domain.domain.PostParams;
import com.tsrnd.javax.suho.training.utils.StringUtils;

@Component
public class PostValidator implements Validator {

    @Override
    public boolean supports(Class<?> arg0) {
        return PostParams.class.equals(arg0);
    }

    @Override
    public void validate(Object arg0, Errors arg1) {
        PostParams params = (PostParams) arg0;
        if (!StringUtils.isValid(params.getTitle())) {
            arg1.rejectValue("title", "title", "title not empty");
        }
        if (!StringUtils.isValid(params.getContent())) {
            arg1.rejectValue("content", "content", "content not empty");
        }
        if (!StringUtils.isValid(params.getUserId())) {
            arg1.rejectValue("userId", "userId", "author not empty");
        }
    }
}

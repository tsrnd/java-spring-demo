package com.tsrnd.javax.suho.training.utils;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.Errors;
import org.springframework.validation.ObjectError;

public class ErrorUtils {
    public static List<String> toStringError(Errors e) {
        List<ObjectError> errors = e.getAllErrors();
        List<String> strings = new ArrayList<>();
        for (ObjectError error : errors) {
            strings.add(error.getCode());
        }
        return strings;
    }

    public static List<ErrorMessage> toMessages(Errors e) {
        List<ObjectError> errors = e.getAllErrors();
        List<ErrorMessage> messages = new ArrayList<>();
        for (ObjectError error : errors) {
            ErrorMessage message = new ErrorMessage();
            message.setKey(error.getCode());
            message.setMessage(error.getDefaultMessage());
            messages.add(message);
        }
        return messages;
    }

    static class ErrorMessage {
        private String key;
        private String message;

        public ErrorMessage() {
            super();
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }
}

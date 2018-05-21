package com.tsrnd.javax.suho.training.utils;

public class StringUtils {
    public static Boolean isValid(Object obj) {
        if (obj == null || obj.toString().trim().equals("")) {
            return false;
        }
        return true;
    }
}

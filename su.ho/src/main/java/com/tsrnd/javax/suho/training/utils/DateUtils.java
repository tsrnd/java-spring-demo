package com.tsrnd.javax.suho.training.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    public static Date toDateFromString(String date) {
        String pattern = "yyyy-MM-dd HH:mm:ss";
        String temp = date;
        SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
        try {
            return dateFormat.parse(temp);
        } catch (ParseException e) {
            System.err.println("Date ParseException, string value:" + date);
            return null;
        }
    }
}

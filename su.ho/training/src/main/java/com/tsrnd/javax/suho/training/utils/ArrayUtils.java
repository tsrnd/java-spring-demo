package com.tsrnd.javax.suho.training.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayUtils {
    public static List<String> toStringList(Object[] objs) {
        return Arrays.asList(objs).stream().map(x -> x == null ? null : x.toString()).collect(Collectors.toList());
    }
}

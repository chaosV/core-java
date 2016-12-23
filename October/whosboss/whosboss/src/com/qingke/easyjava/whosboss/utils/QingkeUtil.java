package com.qingke.easyjava.whosboss.utils;

import java.util.Arrays;

/**
 * The utility class.
 * @author Qingke.me
 *
 */
public class QingkeUtil {

    public static boolean isNullorEmpty(String str) {
        return str == null || "".equalsIgnoreCase(str.trim());
    }
    
    public static boolean isNullorEmpty(Object[] objects) {
        return objects == null || objects.length == 0;
    }
    
    public static boolean isValidValue(String value, String[] validValues) {
        return Arrays.asList(validValues).contains(value);
    }
}

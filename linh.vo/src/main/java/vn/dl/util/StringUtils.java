package vn.dl.util;

public final class StringUtils {
	
	public static String convertObjectToString(Object input) {
		return input == null ? null : input.toString();
	}
	
	public static boolean isValidString(Object temp) {
		if (temp == null || temp.toString().trim().equals("")) {
			return false;
		}
		return true;
	}
}

package com.weisean.util;

public class VerifyUtil {
	
	public static boolean isDecimal(String... vals) {
		for (String val : vals) {
			try {
				Double.parseDouble(val);
			} catch (Exception e) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNumeric(String... str) {
        if (str == null) {
            return false;
        }
		for (String s : str) {
			int sz = s.length();
			for (int j = 0; j < sz; j++) {
				if (!Character.isDigit(s.charAt(j))) {
					return false;
				}
			}
		}
        return true;
    }
	
	public static boolean isMobileNumber(String str) {
		if (str == null) {
            return false;
        }
		if (str.length() != 11) {
			return false;
		}
		if (!isNumeric(str)) {
			return false;
		}
		return "1".equals(str.substring(0, 1));
	}
    
    public static boolean isLetterOrDigit(String s){
        boolean b = true;
        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            if(!(Character.isDigit(c) || Character.isLetter(c))){
                b = false;
                break;
            }
        }
        return b;
    }

	public static boolean isEmpty(String str) {
		return str == null || str.length() == 0;
	}

	public static boolean isAllEmpty(String... strs) {
		if (strs != null) {
			for (String str : strs) {
				if (!isEmpty(str)) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean hasEmpty(String... strs) {
		if (strs != null) {
			for (String str : strs) {
				if (isEmpty(str))
					return true;
			}
			return false;
		}
		return true;
	}
	
}

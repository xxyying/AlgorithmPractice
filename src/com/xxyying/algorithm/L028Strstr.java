package com.xxyying.algorithm;

public class L028Strstr {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null || haystack.length() < needle.length()) {
        	return -1;
        }
		if(needle.length()==haystack.length()) return needle.equals(haystack) ?  0:-1;
		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {
			int cnt = 0;
			while(cnt < needle.length() && haystack.charAt(i + cnt) == needle.charAt(cnt)) {
				cnt++;
				if (cnt == needle.length()) {
					return i;
				}
			}
		}
		return -1;
		
	}
// 	SOLUTION 2 --- Using substring	
// 	public int strStr(String haystack, String needle) {
//        if (haystack == null || needle == null || haystack.length() < needle.length()) {
//        	return -1;
//        }
//        
//        for (int i = 0; i < (haystack.length() - needle.length() + 1); i++) {
//        	if (haystack.substring(i, i + needle.length()).equals(needle)) {
//        		return i;
//        	}
//        }
//        return -1;
//    }
	
	
	public static void main(String[] args) {
		L028Strstr test = new L028Strstr();
		String haystack = "hello";
		String needle = "llo";
		System.out.println(test.strStr(haystack, needle));
		
		haystack = "apple";
		needle = "banana";
		System.out.println(test.strStr(haystack, needle));
		
		haystack = "apple";
		needle = "app";
		System.out.println(test.strStr(haystack, needle));
	}

}

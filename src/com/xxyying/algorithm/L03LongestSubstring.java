package com.xxyying.algorithm;

import java.util.HashMap;

public class L03LongestSubstring {
	public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
        	return 0;
        }
        if (s.length() == 1) {
        	return 1;
        }
        
        int[] table = new int[256];
        for(int i = 0; i < 256; i++) {
        	table[i] = -1;
        }
        
        int max = 0;
        int cur = 0;
        int start = 0;
        int bestStart = 0;
        
        for(int i = 0; i < s.length(); i++) {
        	char c = s.charAt(i);
        	if (table[c] < start) {
        		table[c] = i; // using table to note down the index
        		cur++;
        	} else {
        		int idx = table[c];
        		start = idx + 1;
        		cur = i - start + 1;
        		table[c] = i;
        	}
        	if (max < cur) {
        		max = cur;
        		bestStart = start;
        	}
        }
        return max;
		
// SOLUTION 2 --- Hashmap
//
//		 if (s.length()==0) return 0;
//	        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
//	        int max=0;
//	        for (int i=0, j=0; i<s.length(); ++i){
//	            if (map.containsKey(s.charAt(i))){
//	                j = Math.max(j,map.get(s.charAt(i))+1);
//	            }
//	            map.put(s.charAt(i),i);
//	            max = Math.max(max,i-j+1);
//	        }
//	        return max;
    }
	
	public static void main(String[] args) {
		L03LongestSubstring test = new L03LongestSubstring();
		String input = "abcabcbb";
		System.out.println(input + ": " + test.lengthOfLongestSubstring(input));
		
		input = "bbbbb";
		System.out.println(input + ": " + test.lengthOfLongestSubstring(input));
		
		input = "pwwkew";
		System.out.println(input + ": " + test.lengthOfLongestSubstring(input));
	}

}

package com.xxyying.algorithm;

public class L009PalindromeNumber {
	public boolean isPalindrome(int x) {
       if (x < 0) {
    	   return false;
       }
       
       int result = 0;
       int y = x;
       while (y != 0) {
    	   result = result * 10 + y % 10;
    	   y = y / 10;
       }
       return result == x;
       
       
    }
	
	public static void main(String[] args) {
		L009PalindromeNumber test = new L009PalindromeNumber();
		int x = 12321;
		System.out.println(test.isPalindrome(x));
	}

}

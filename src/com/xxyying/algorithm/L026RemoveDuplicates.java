package com.xxyying.algorithm;

public class L026RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return 1;
        }
        
        int slow = 0;
        for(int fast = 0; fast < nums.length; fast++) {
            if (nums[fast] != nums[slow]) {
                nums[++slow] = nums[fast];
            }
        }
        return ++slow;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

package com.xxyying.algorithm;

public class L027RemoveElement {
	public int removeElement(int[] nums, int val) {
		int idx = 0;
        for(int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
	
	public static void main(String[] args) {
		
	}

}

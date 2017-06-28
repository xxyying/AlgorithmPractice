package com.xxyying.algorithm;

import java.util.Arrays;
import java.util.HashMap;

public class L001TwoSum {
	public int[] twoSum(int[] nums, int target) {
		if (nums == null || nums.length == 0) {
            return new int[2];
        }
        int[] result = new int[2];
        int tar = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            tar = target - nums[i];
            if (map.containsKey(tar)) {
                result[0] = map.get(tar);
                result[1] = i;
                return result;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
	
	public static void main(String[] args) {
		L001TwoSum test = new L001TwoSum();
		int[] nums = new int[]{2, 7, 11, 12};
		int target = 9;
		int[] result = test.twoSum(nums, target);
		System.out.println(Arrays.toString(result));
	}

}

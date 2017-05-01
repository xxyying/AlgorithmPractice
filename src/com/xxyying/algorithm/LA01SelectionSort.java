package com.xxyying.algorithm;

/* Given an array of integers, sort the elements in the array in ascending order. 
 * The selection sort algorithm should be used to solve this problem.

Examples

{1} is sorted to {1}
{1, 2, 3} is sorted to {1, 2, 3}
{3, 2, 1} is sorted to {1, 2, 3}
{4, 2, -3, 6, 1} is sorted to {-3, 1, 2, 4, 6}
Corner Cases

What if the given array is null? In this case, we do not need to do anything.
What if the given array is of length zero? In this case, we do not need to do anything.
*/



import java.util.Arrays;

public class LA01SelectionSort {
	
	public int[] selectionSort(int[] input) {
		
		if (input == null || input.length <= 1) {
			return input;
		}
		
		int min = 0;
		for (int i = 0; i < input.length; i++) {
			min = i;
			for (int j = i + 1; j < input.length; j++) {
				if (input[j] < input[min]) {
					min = j;	
				}
			}
			swap(input, min, i);
		}
		
		return input;
		
	}
	
	private void swap(int[] array, int left, int right) {
		int tmp = array[left];
		array[left] = array[right];
		array[right] = tmp;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LA01SelectionSort test = new LA01SelectionSort();
		int[] input = new int[] {0, 3, 5, 9, 8, 7, 2, 1, 4};
		int[] result = test.selectionSort(input);
		System.out.println(Arrays.toString(result));
		
	}

}

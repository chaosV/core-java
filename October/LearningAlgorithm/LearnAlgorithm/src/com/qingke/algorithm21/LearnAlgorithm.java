package com.qingke.algorithm21;

import java.util.Arrays;

import com.qingke.util.Util;

public class LearnAlgorithm {
	
	public static void main(String[] args) {
		int[] nums1 = {3,7,9,9,12,38,38,38,38,88};
		int[] nums2 = {6,7,8,38,67};
		
		int[] result = mergeSortedArray(nums1, nums2);
		Util.print(result);

		result = removeDuplicate(nums1);
		for(int num:result) {
			System.out.println(num);
		}	
		Util.print(result);
	}
	
	//合并已经排序好的数组
	public static int[] mergeSortedArray(int[] nums, int[] nums2) {
		
		
		return nums;
	}

	//去除有序数组中的重复
	public static int[] removeDuplicate(int[] nums) {
		
		int i=0,j=1;
		for(;i<nums.length;i++){
			if(nums[i]!=nums[j]){
				j++;
				nums[j]=nums[i];
			}
		}
		int[] nums2=Arrays.copyOf(nums, j+1);
		
		
		return nums2;
	}



}

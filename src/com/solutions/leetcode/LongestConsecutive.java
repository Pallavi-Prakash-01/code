package com.solutions.leetcode;

import java.util.Arrays;

public class LongestConsecutive {
	
	public int longestConsecutive(int[] nums) {
        if(nums.length==0)
            return 0;
        Arrays.sort(nums);
        int longStreak =1;
        int curStreak =1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                if(nums[i] == nums[i-1]+1)
                    curStreak++;
                else{
                    longStreak = Math.max(longStreak,curStreak);
                    curStreak=1;
                }
            }
        }
        return Math.max(longStreak,curStreak);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutive lc = new LongestConsecutive();
		int[] arr = {0,3,7,2,5,8,4,6,0,1};
		int res = lc.longestConsecutive(arr);
		System.out.println(res);
	}

}

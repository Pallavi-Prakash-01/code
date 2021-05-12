package com.solutions.leetcode;

public class SmallerThanCurrent {
//Approach 1: BruteForce	
	public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] count = new int[nums.length];
        int sum=0;
        int index=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length;j++){
                if(nums[i]>nums[j])
                    sum++;
            }
            count[index]=sum;
            index++;
            sum=0;
        }
        return count;
    }

  //Approach 2 : using Treemap
  public int[] smallerNumbersThanCurrent1(int[] nums) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i : nums) map.put(i, map.getOrDefault(i, 0) + 1);
        int count1 = 0;
        for (int key : map.keySet()) {
            int temp = map.get(key);
            map.put(key, count);
            count1 += temp;
        }
        for (int i = 0; i < nums.length; i++) nums[i] = map.get(nums[i]);
        return nums;
    }
  //approach2 ends (use any one approach)
	public static void main(String[] args) {
		SmallerThanCurrent stc = new SmallerThanCurrent();
		int[] nums = {8,1,2,2,3};
		System.out.println("Count of elements smaller than indexed elements of nums[] are : ");
		int[] res = new int[nums.length];
		res = stc.smallerNumbersThanCurrent(nums);
		for(int i=0;i<res.length;i++)
			System.out.print(res[i]+" ");

	}

}

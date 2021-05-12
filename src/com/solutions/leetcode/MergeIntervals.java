package com.solutions.leetcode;

import java.util.Arrays;
import java.util.LinkedList;

public class MergeIntervals {
	
	 public int[][] merge(int[][] intervals) {
	        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));
	        LinkedList<int[]> mergeInterval = new LinkedList<>();
	        for(int[] interval : intervals){
	            if(mergeInterval.isEmpty()||mergeInterval.getLast()[1]<interval[0]){
	                mergeInterval.add(interval);
	            }
	            else
	                mergeInterval.getLast()[1] = Math.max(mergeInterval.getLast()[1],interval[1]);
	        }
	        return mergeInterval.toArray(new int[mergeInterval.size()][]);
	    }

	public static void main(String[] args) {
		MergeIntervals mi = new MergeIntervals();
		int[][]input = {{1,3},{2,6},{8,10},{15,18}};
		int[][] res = mi.merge(input);
		for(int i=0;i<res.length;i++) {
			for(int j=0;j<res[i].length;j++)
		System.out.println(res[i][j]);
		}
	}

}

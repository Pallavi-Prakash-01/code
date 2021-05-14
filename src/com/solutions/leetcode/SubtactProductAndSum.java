package com.solutions.leetcode;

import java.util.Scanner;

public class SubtactProductAndSum {
	
	public int differenceProductAndSum(int n) {
        int sum=0,prod=1,diff=0;
        while(n != 0){
           sum = sum + (n%10); 
           prod = prod * (n%10);
            n=n/10;
        }
        diff=prod-sum;
        return diff;
    }

	public static void main(String[] args) {
		SubtactProductAndSum sps = new SubtactProductAndSum();
		System.out.println("Enter an Integer: ");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println("The Difference Between product and sum of digits in an interger is : "+sps.differenceProductAndSum(n));

	}

}

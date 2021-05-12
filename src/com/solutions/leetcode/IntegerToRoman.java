package com.solutions.leetcode;

public class IntegerToRoman {
	public static final int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    public static final String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    
    public String intToRoman(int num) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<value.length && num>0;i++){
            while(value[i]<=num){
                num = num-value[i];
                sb.append(symbols[i]);
            }
        }
        return sb.toString();
    }
    
	public static void main(String[] args) {
		IntegerToRoman itr = new IntegerToRoman();
		int input = 3888;
		String result = itr.intToRoman(input);
		System.out.println("Equivalent Roman number is : "+result);
	}

}

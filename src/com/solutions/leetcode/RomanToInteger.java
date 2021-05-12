package com.solutions.leetcode;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
	
	static Map<String,Integer> valueMap = new HashMap<>();
    static{
       valueMap.put("I",1);
        valueMap.put("V",5);
        valueMap.put("X",10);
        valueMap.put("L",50);
        valueMap.put("C",100);
        valueMap.put("D",500);
        valueMap.put("M",1000);
    }
    public int romanToInt(String s) {
        if(s.length()<=0 || s==null)
            return 0;
        int sum =0;
        int i=0;
        while(i<s.length()){
            String symbol1 = s.substring(i,i+1);
            int value1 = valueMap.get(symbol1);
            int value2=0;
            if(i+1 <s.length()){
                String symbol2 = s.substring(i+1,i+2);
                value2 = valueMap.get(symbol2);
            }
            if(value2>value1){
                sum = sum+(value2-value1);
                i+=2;
            }
            else{
                sum = sum+value1;
                i++;
            }
        }
        return sum;
    }

	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();
		String s = "MMMDCCCLXXXVIII";
		int result = rti.romanToInt(s);
		System.out.println(result);
		
	}

}

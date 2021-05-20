package com.solutions.leetcode;

import java.util.Scanner;

public class SingleRowKeyboard {
	
	public int calculateTime(String keyboard, String word) {
        int[] arr = new int[26];
      for (int i = 0; i < keyboard.length(); ++i) {
          arr[keyboard.charAt(i) - 'a'] = i;
      }
     
      int ans = 0, pos = 0;
      for (int i = 0; i < word.length(); ++i) {
          ans += Math.abs(arr[word.charAt(i) - 'a'] - pos);
          pos = arr[word.charAt(i) - 'a'];
      }
     
      return ans;
  }

	public static void main(String[] args) {
		SingleRowKeyboard srk = new SingleRowKeyboard();
		System.out.println("Enter the keyboard of all letter as String indicating the keyborad layout");
		Scanner input = new Scanner(System.in);
		String keyboard = input.nextLine();
		System.out.println("Enter a word");
		String word = input.nextLine();
		System.out.println("Time taken to type the word "+word+" in one finger : "+srk.calculateTime(keyboard, word));
	}

}

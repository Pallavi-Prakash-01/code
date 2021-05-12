package com.solutions.leetcode;

import java.util.HashSet;
import java.util.Set;

public class ValidSudokuTest {
	
	final int SIZE =9;
    Set<Integer>[] row = new HashSet[SIZE];
    Set<Integer>[] col = new HashSet[SIZE];
    Set<Integer>[] box = new HashSet[SIZE];

public boolean isValidSudoku(char[][] board) {
    for(int i=0;i<SIZE;i++){
        row[i] = new HashSet<>();
        col[i] = new HashSet<>();
        box[i] = new HashSet<>();
    }
    return parseCurrentBoard(board);
}

private boolean parseCurrentBoard(char[][] board){
    for(int r=0;r<SIZE;r++){
        for(int c=0;c<SIZE;c++){
            if(board[r][c]!='.'){
                int cur = Integer.valueOf(board[r][c]);
                if(!row[r].add(cur) || !col[c].add(cur) || !box[(r/3)*3 + (c/3)].add(cur))
                    return false;
            }
        }
    }
    return true;
}

	public static void main(String[] args) {
		ValidSudokuTest vst = new ValidSudokuTest();
		char[][] board = {{'5','3','.','.','7','.','.','.','.'}
						 ,{'6','.','.','1','9','5','.','.','.'}
						 ,{'.','9','8','.','.','.','.','6','.'}
						 ,{'8','.','.','.','6','.','.','.','3'}
						 ,{'4','.','.','8','.','3','.','.','1'}
						 ,{'7','.','.','.','2','.','.','.','6'}
						 ,{'.','6','.','.','.','.','2','8','.'}
						 ,{'.','.','.','4','1','9','.','.','5'}
						 ,{'.','.','.','.','8','.','.','7','9'}};
		boolean res = vst.isValidSudoku(board);
		System.out.println(res);

	}
}

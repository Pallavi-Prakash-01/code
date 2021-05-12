package com.solutions.leetcode;

public class ParkingSystem {
	private int big;
    private int medium;
    private int small;
    
    public ParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    
    public boolean addCar(int carType) {
       if (carType == 1 && big > 0) {
           big--;
           return true;
       } else if (carType == 2 && medium > 0) {
           medium--;
           return true;
       } else if (carType == 3 && small > 0) {
           small--;
           return true;
       }
        return false;
    }
	
// Approach 2 starts
	private int[] space = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        space[0] = big;
        space[1] = medium;
        space[2] = small;
    }
    
    public boolean addCar(int carType) {
        if(space[carType-1] - 1 < 0){
            return false;
        }
        space[carType-1]--;
        return true;
        }
//Approach 2 ends

	public static void main(String[] args) {
		ParkingSystem ps = new ParkingSystem(1,2,0);
		System.out.println(ps.addCar(1));
		System.out.println(ps.addCar(2));
		System.out.println(ps.addCar(3));
		System.out.println(ps.addCar(1));
		System.out.println(ps.addCar(2));
		
	}

}

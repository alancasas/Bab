package com.java;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean isEqualSum = hasEqualSum(1,1,2);
		System.out.println("El valor es: "+isEqualSum);
			
	}
	
	public static boolean hasEqualSum(int a, int b, int c) {
		
		if(a+b == c) {
			return true;
		}else {
			return false;
		}
	}

}

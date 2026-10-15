package com.kodnest.runningsum;

import java.util.Scanner;

public class EquilibriumSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println(equilibriumSumIndex(n, arr));
	}
	public static int equilibriumSumIndex(int n, int [] arr) {
		int total = 0;
		for(int val : arr) {
			total += val;
		}
		
		int leftSum = 0;
		
		for(int i = 0; i < n; i++) {
			int rightSum = total - arr[i] -leftSum;
			if(leftSum == rightSum)
				return i;
			leftSum += arr[i];
		}
		return -1;
	}

}

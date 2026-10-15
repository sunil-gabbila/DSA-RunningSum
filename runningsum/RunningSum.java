package com.kodnest.runningsum;

import java.util.Scanner;

public class RunningSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] result = buildRunningSum(n, arr);
		
		for(int val : result) {
			System.out.print(val + " ");
		}
	}
	
	public static int [] buildRunningSum(int n, int [] arr) {
		int res [] = new int[n];
		
		int runSum = 0; 
		int i = 0;
		for(int val : arr) {
			runSum += val;
			res[i] = runSum;
			i++;
		}
		return res;
	}

}

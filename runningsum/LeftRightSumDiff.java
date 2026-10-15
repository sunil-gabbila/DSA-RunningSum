package com.kodnest.runningsum;

import java.util.Iterator;
import java.util.Scanner;

public class LeftRightSumDiff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		int [] res = leftRightDiff(n, arr);
		
		for(int val : res) {
			System.out.print(val + " ");
		}
	}
	
	public static int[] leftRightDiff(int n, int [] arr) {
		int total = 0;
		for(int val : arr) {
			total += val;
		}
		
		int [] varition = new int[n];
		int leftSum = 0;
		
		for(int i = 0; i < n; i++) {
			int rightSum = total -leftSum - arr[i];
			int diff = Math.abs(rightSum - leftSum);
			varition[i] = diff;
			leftSum += arr[i];
		}
		return varition;
	}

}

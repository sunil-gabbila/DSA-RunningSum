package com.kodnest.runningsum;

import java.util.Scanner;

public class PrefixKGreater {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int k = sc.nextInt();
		
		System.out.println(prefixSumGreaterThanK(n, arr, k));
	}
	
	public static int prefixSumGreaterThanK(int n, int [] arr, int K) {
		int total = 0;
		
		for(int i = 0; i < n;i++) {
			total += arr[i];
			if(total >= K) {
				return (n-1)-i;
			}
			if(n==1 && arr[i] >= K)
				return 1;
		}
		return 0;
		
	}

}

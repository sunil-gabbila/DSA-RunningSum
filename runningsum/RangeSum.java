package com.kodnest.runningsum;

import java.util.ArrayList;
import java.util.Scanner;

public class RangeSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int m = sc.nextInt();
		
		int [][] range = new int[m][2];
		for(int i = 0; i < m; i++) {
			range[i][0] = sc.nextInt();
			range[i][1] = sc.nextInt();
		}
		
		ArrayList<Integer> result = rangeSum(n, arr, range);
		
		for(int val : result)
			System.out.print(val + " ");
	}
	
	public static ArrayList<Integer> rangeSum(int n, int [] arr, int [][] range) {
		int[] prefix = new int[n];
		prefix[0] = arr[0];
		for(int i = 1; i < n; i++) {
			prefix[i] = prefix[i-1] + arr[i];
		}
		
		for(int val : prefix) {
			System.out.print(val + " ");
		}
		
		System.out.println();
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i = 0; i < range.length; i++) {
			int left = range[i][0];
			int right = range[i][1];
			
			if(left == 0) {
				list.add(prefix[right]);
			} else {
				list.add(prefix[right]- prefix[left-1]);
			}
		}
		return list;
	}

}

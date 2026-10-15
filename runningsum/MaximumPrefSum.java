
package com.kodnest.runningsum;

import java.util.Scanner;

public class MaximumPrefSum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        int n = sc.nextInt();

        // Create an array of size n
        int[] arr = new int[n];

        // Read array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Calculate and print the maximum prefix sum
        System.out.println(maxPrefSum(n, arr));

        sc.close();
    }

    /**
     * Finds the maximum prefix sum of the array.
     *
     * A prefix sum is the sum of elements from index 0
     * up to the current index.
     *
     * @param n   Size of the array
     * @param arr Input array
     * @return    Maximum prefix sum
     */
    public static int maxPrefSum(int n, int[] arr) {

        int curSum = 0;

        // Initialize with the smallest possible integer
        int maxSum = Integer.MIN_VALUE;

        // Calculate each prefix sum
        for (int i = 0; i < n; i++) {

            // Add the current element to the running sum
            curSum += arr[i];

            // Update maximum whenever a larger prefix sum is found
            if (curSum > maxSum) {
                maxSum = curSum;
            }
        }

        return maxSum;
    }
}

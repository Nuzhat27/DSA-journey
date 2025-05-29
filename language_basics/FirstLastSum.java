package language_basics;

import java.util.Scanner;

/*
 Given an integer array nums, return the sum of the 1st and last element of the array.
Examples:
Input: nums = [2, 3, 4, 5, 6]
Output: 8
Explanation: 1st element = 2, last element = 6, sum = 2 + 6 = 8.
 */
import java.util.*;
public class FirstLastSum {
    public static int sumOfFirstAndLast(int[] nums) {
        return nums[0]+nums[nums.length-1];
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the size of array:-");
        int length = sc.nextInt();
        int arr[] = new int[length];
        System.out.println("Enter the elements of the array:-");
        for (int i=0;i<length;i++){
            arr[i] = sc.nextInt();
        }
        int sum = sumOfFirstAndLast(arr);
        System.out.println("Sum of first and last element of array:-" + sum);
        sc.close();
    }
}

package org.challenge.firstWeek;

public class DaySix {

//    ✅ Day 6 Challenge: Find the Second Largest Number
//    📘 Problem:
//    Write a method that finds the second largest number in an array of integers.
//
//            ✍️ Method signature:
//    java
//            Copy
//    Edit
//    public static int findSecondLargest(int[] nums)
//    🧾 Examples:
//    java
//            Copy
//    Edit
//    Input: [4, 7, 1, 9, 2]       → Output: 7
//    Input: [10, 10, 9, 8]        → Output: 9
//    Input: [5, 5, 5]             → Output: ?? (Up to you: maybe return same value or throw an error)
//    Input: [3, -2, -1]           → Output: -1
//            ✅ Rules:
//    The array may contain duplicates
//
//    The array can have negative numbers
//
//    You can assume the array has at least 2 numbers
//
//    Don’t sort the array unless you want to challenge yourself less 😉

    public static void main(String[] args) {

        int result = findSecondLargest(new int[]{3,-2,-1});
        System.out.println(result);

    }

    //Chat code, a had a problem with negative numbers
    public static int findSecondLargest(int[] nums) {
        int largest = nums[0];
        int second = Integer.MIN_VALUE;

        for (int i : nums) {
            if (i > largest) {
                second = largest;
                largest = i;
            } else if (i > second && i < largest) {
                second = i;
            }
        }

        return second;
    }


}


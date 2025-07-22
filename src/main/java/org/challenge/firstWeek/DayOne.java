package org.challenge.firstWeek;

import java.util.Arrays;

public class DayOne {
//    ✅ Day 1 Challenge: Two Sum
//    📘 Problem
//    Given an integer array nums and an integer target, return the indices of the two numbers such that they add up to the target.
//
//    Use 0-based indexing
//
//    Assume only one valid solution
//
//    Don’t reuse the same element
//
//    🧾 Example:
//
//    Input: nums = [2, 7, 11, 15], target = 9
//    Output: [0, 1]  // because 2 + 7 = 9
//
//    🔍 Constraints:
//    You can use:
//
//    Brute force (nested loops) for now
//
//    Or optimize with HashMap if you’re comfortable with it

    public static void main(String[] args) {
       int[] result = twoSum(new int[]{2,7,11,15},13);
        System.out.println(Arrays.toString(result));

    }

    public static int[] twoSum ( int[]nums,int target){
        for (int i = 0; i < nums.length; i++){
            for (int j = i + 1; j < nums.length; j++)
                if(nums[j] + nums[i] == target){
                    return new int[]{i,j};
            }
        }
        return null;
    }

}

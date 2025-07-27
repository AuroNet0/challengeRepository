package org.challenge.firstWeek;

public class DayFour {
//
//    ✅ Day 4 Challenge: Find the Maximum Number in an Array (Easy)
//    📘 Problem:
//    Write a method that takes an array of integers and returns the largest number in that array.
//
//    🧾 Examples:
//    java
//            Copy
//    Edit
//    Input: [1, 5, 3, 9, 2]      → Output: 9
//    Input: [-10, -3, -1, -7]    → Output: -1
//    Input: [100]                → Output: 100
//            ✍️ Java Signature:
//    java
//            Copy
//    Edit
//    public static int findMax(int[] nums) {
//        // your code
//    }
//    📌 Constraints:
//    The array will always have at least one number.
//
//    You can't use built-in Java functions like Arrays.stream().max() or Collections.max() — this is manual logic time 🧠
    public static void main(String[] args) {

        int result = findMax(new int[]{-10, -3, -1, -7});
        System.out.println(result);

    }

    public static int findMax(int[] nums) {
        int b = nums[0];

        for(int i: nums){
            if(i > b){
                b = i;
            }
        }
        return b;
    }



}

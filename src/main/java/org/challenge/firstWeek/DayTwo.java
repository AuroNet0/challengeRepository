package org.challenge.firstWeek;

public class DayTwo {
//
//    ✅ Day 2 Challenge: Palindrome Check (Easy)
//    📘 Problem:
//    Write a method that takes a string as input and returns true if the string is a palindrome, and false otherwise.
//
//    A palindrome is a word or phrase that reads the same forwards and backwards (e.g., "radar", "level").
//
//            🧾 Examples:
//    java
//            Copy
//    Edit
//    Input: "level"      → Output: true
//    Input: "java"       → Output: false
//    Input: "radar"      → Output: true
//    Input: "RaceCar"    → Output: true (ignore case)
//    Input: "step on no pets" → Output: true (ignore spaces & case)
//
//        🔍 Requirements:
//    Ignore case (so "RaceCar" is valid)
//
//        (Bonus) Ignore spaces (so "step on no pets" is valid)
//
//
    public static void main(String[] args) {

        Boolean result = isPalindrome("step on no pets");
        System.out.println(result);

    }

    public static boolean isPalindrome(String str) {

        String b = new StringBuilder(str).reverse().toString().toLowerCase().replaceAll(" ","" );

        return str.toLowerCase().replaceAll(" ", "").equals(b);
    }


}

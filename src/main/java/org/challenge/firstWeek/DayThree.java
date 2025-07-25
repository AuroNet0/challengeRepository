package org.challenge.firstWeek;

public class DayThree {

//    ✅ Day 3 Challenge: Fibonacci Number (Easy)
//    📘 Problem:
//    Write a method that takes an integer n and returns the n-th Fibonacci number.
//
//    The Fibonacci sequence is:
//
//    Copy
//            Edit
//    0, 1, 1, 2, 3, 5, 8, 13, ...
//    Where:
//
//    fib(0) = 0
//
//    fib(1) = 1
//
//    fib(n) = fib(n-1) + fib(n-2)
//
//    🧾 Examples:
//    java
//            Copy
//    Edit
//    Input: 0 → Output: 0
//    Input: 1 → Output: 1
//    Input: 4 → Output: 3
//    Input: 6 → Output: 8
//    Input: 10 → Output: 55
//            🧠 Bonus (Optional):
//    Try both versions:
//
//    Recursive version
//
//    Iterative version (faster)

    public static void main(String[] args) {

        int result = fibonacci(6);
        System.out.println(result);

    };

    public static int fibonacci(int n) {
        if(n == 0) return 0;
        if (n == 1) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }




}

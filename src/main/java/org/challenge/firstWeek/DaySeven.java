package org.challenge.firstWeek;

public class DaySeven {

//    ✅ Day 7 Challenge: FizzBuzz
//    📘 Problem:
//    Write a method that prints the numbers from 1 to n.
//    But for multiples of 3, print "Fizz" instead of the number,
//    for multiples of 5, print "Buzz",
//    and for numbers that are multiples of both 3 and 5, print "FizzBuzz".

    public static void main(String[] args) {
        fizzBuzz(15);
    }

    public static void fizzBuzz(int n){

        for (int i=1; i<=n ; i++){
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0){
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            }
            else{
                System.out.println(i);
            }
        }

    }


}

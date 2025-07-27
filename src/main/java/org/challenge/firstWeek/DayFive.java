package org.challenge.firstWeek;

public class DayFive {

    public static void main(String[] args) {

        int result = countVowels("bcdfg");
        System.out.println(result);
    }
    public static int countVowels(String input){

       int q = 0;
       String[] letters = input.toLowerCase().split("");
       for (String l: letters){
           if (l.contains("a") ||l.contains("e") ||l.contains("i") ||l.contains("o") ||l.contains("u")){
               q += 1;
           }
       }

        return q;
    }


}

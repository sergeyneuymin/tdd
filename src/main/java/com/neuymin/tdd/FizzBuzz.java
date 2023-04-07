package com.neuymin.tdd;

public class FizzBuzz {


    public static String compute(int i) {

        StringBuilder stringBuilder = new StringBuilder();

        if(i % 3 ==0 && i % 5 == 0) stringBuilder.append("FizzBuzz");
        else if (i % 3 == 0) stringBuilder.append("Fizz");
        else if(i % 5 == 0) stringBuilder.append("Buzz");
        else stringBuilder.append(i);

        return stringBuilder.toString();
    }

//    public static String computer(int i) {
//        if(i % 3 ==0 && i % 5 == 0) return "FizzBuzz";
//        else if (i % 3 == 0) return "Fizz";
//        else if(i % 5 == 0) return "Buzz";
//        else return Integer.toString(i);
//    }
}

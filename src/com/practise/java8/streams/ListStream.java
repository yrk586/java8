package com.practise.java8.streams;


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ListStream {

    public static void main(String[] args) {

        List<Integer> numbersList = Arrays.asList(1,2,3,4,5,6,7,8);


        System.out.println( numbersList.stream()
                .filter(i -> i%2==0)
                .mapToInt(i -> i* 2)
                .sum());

        //factorial of a number

        int findFactor = 6;

        System.out.println(IntStream.rangeClosed(2,findFactor).reduce(1,(x,y)-> x * y));





    }

}



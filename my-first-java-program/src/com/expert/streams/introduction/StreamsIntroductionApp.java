package com.expert.streams.introduction;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsIntroductionApp {

    public static void main(String[] args) {
        List<Integer> temperatures = List.of(20, 21, 21, 22, 19, 22, 20);
        List<Integer> tempHigherThanTwenty = temperatures.stream()
                .filter(temperature -> temperature > 20)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        System.out.println(tempHigherThanTwenty);


        System.out.println("Number of days with temperature higher than 20: " +
                temperatures.stream()
                .filter(temperature -> temperature > 20)
                .count());


    }
}

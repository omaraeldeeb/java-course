package com.expert.streams.howtocreate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class StreamCreationApp {

    public static void main(String[] args) {
        List<String> musicGenres = List.of("Rock", "Pop", "Hip Hop", "Rap", "Classic", "Heavy Metal");

        musicGenres.stream()
                .sorted()
                .forEach(musicGenre -> System.out.println(". " + musicGenre));


        musicGenres.stream()
                .sorted()
                .forEach(System.out::println);



        System.out.println(Stream.of("Rock", "Pop", "Hip Hop", "Rap", "Classic", "Heavy Metal")
                .collect(Collectors.toList()));


        System.out.println("Number of elements in the array: "
                + Arrays.stream(new double[] {5.5, 9.5, 8.5, 99.99, 28.2}).count());


        LongStream.range(1, 11)
                .forEach(number -> System.out.println(number + ". Being Right Sucks"));



    }
}

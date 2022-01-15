package com.company;


import java.util.Optional;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Integer []array = new Integer[]{1,3,8,6,7,24};
        Optional<Integer>amount=Stream.of(array)
                .filter(a->a%2==0)
                .map(a->a*a).max(Integer::compareTo);
        amount.stream().forEach(System.out::println);



    }
}

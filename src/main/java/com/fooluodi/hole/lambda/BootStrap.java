package com.fooluodi.hole.lambda;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by di on 12/1/2017.
 */
public class BootStrap {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            list.add(i);
        }

        for (Integer integer : list) {

        }


        list.parallelStream().map(integer ->
                integer * 100
        ).filter(integer ->
                integer > 5000
        )
                .forEach(System.out::println);


    }
}

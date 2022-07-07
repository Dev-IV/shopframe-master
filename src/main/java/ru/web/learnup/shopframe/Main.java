package ru.web.learnup.shopframe;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Good secondGood = new Good("05147895", "Butter");
        Good newGood = new Good("01285263", "Potato");

        TreeSet<Good> simpleStorage = new TreeSet<>();

        simpleStorage.add(secondGood);
        simpleStorage.add(newGood);

        simpleStorage.forEach(x -> System.out.println(x.getName()));

    }
}

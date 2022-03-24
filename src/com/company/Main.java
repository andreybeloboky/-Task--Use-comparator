package com.company;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Cat> cat = new ArrayList<>();
        cat.add(new Cat("AYYA", 2, 13));
        cat.add(new Cat("Katya", 14, 8));
        cat.add(new Cat("Andrew", 1, 3));
        cat.add(new Cat("Sergey", 1, 1));
        cat.add(new Cat("Inna", 1, 2));
        for (Cat value : cat) {
            System.out.println(value);
        }
        System.out.println(" ");
        Collections.sort(cat, new AgeComparator());
        for (Cat value : cat) {
            System.out.println(value);
        }

        System.out.println(" ");
        cat.sort(new NameComparator());
        for (Cat value : cat) {
            System.out.println(value);
        }
    }
}

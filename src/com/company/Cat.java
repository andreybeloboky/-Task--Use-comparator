package com.company;

import java.util.Comparator;

public class Cat {
    private String Name;
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
        Name = name;
        this.age = age;
        this.weight = weight;
    }

    public String getName() {
        return Name;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                '}';
    }
}

class AgeComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        } else if (o1.getAge() < o2.getAge()) {
            return -1;
        } else {
            return 0;
        }
    }
}

class NameComparator implements Comparator<Cat> {
    @Override
    public int compare(Cat o1, Cat o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

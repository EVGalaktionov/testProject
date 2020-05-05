package com.javalesson.oop;

import com.javalesson.oop.Dog;

public class Main {
    public static void main(String[] args) {

        System.out.println("Count of dogs: " + Dog.getDogsCount());

        Dog lab = new Dog();

        lab.setName("Charlie");
        lab.setBreed("Lab");
        lab.setSize(Size.AVERAGE);
        lab.bite();

        Dog sheppard = new Dog();

        sheppard.setName("Mike");
        sheppard.setBreed("Shepard");
        sheppard.setSize(Size.BIG);
        sheppard.bite();

        Dog doberman = new Dog();

        doberman.setName("Jack");
        doberman.setBreed("Doberman");
        doberman.setSize(Size.BIG);
        doberman.bite();


        Size s = Size.SMALL;
        System.out.println(s);
        Size s1 = Size.valueOf("BIG");
        System.out.println(s1);

        Size[] values = Size.values();
        for(int i = 0; i < values.length; i++){
            System.out.println(values[i]);
        }


    }

}

package com.javalesson.oop;

public class Dog {

    private static int dogsCount;

    private static final int PAWS = 4; //поле класса
    private static final int TAIL = 1;
    private String name;
    private String breed;
    private Size size = Size.UNDEFINED;

    public Dog() {
        dogsCount++;
        System.out.println("Dog's count: " + dogsCount);
    }

    public static int getDogsCount() {
        return dogsCount;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getPaws() {
        return PAWS;
    }

    public int getTail() {
        return TAIL;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        switch (size) {
            case BIG:
            case VERY_BIG:
                System.out.println("Wof-Wof!");
                break;
            case AVERAGE:
                System.out.println("Raf-Raf!");
                break;
            case SMALL:
            case VERY_SMALL:
                System.out.println("Tiaf-Tiaf!");
                break;
            default:
                System.out.println("The size is undefined.");
        }
    }

    public void bite() {
        if (dogsCount > 2) {
            System.out.println("dogs are biting you.");
        } else {
            bark();
        }
    }
}

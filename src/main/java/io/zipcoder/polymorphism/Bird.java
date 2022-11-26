package io.zipcoder.polymorphism;

public class Bird extends Pet{

    public Bird(String name) {
        super(name);
    }

    public Bird() {
    }

    @Override
    public String speak() {
        return "Tweet!";
    }
}

package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Dog_Test {
    @Test
    public void dogConstructorTest() {
        Dog doggy = new Dog();
        doggy.setName("Fred");
        String expected = "Fred";
        String actual = doggy.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void dogSpeakTest() {
        Dog dog = new Dog();
        String expected = "Bark!";
        String actual = dog.speak();

        Assert.assertEquals(expected, actual);
    }
}

package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Pet_Test {

    @Test
    public void petConstructorTest() {
       Pet pet = new Pet("Fred");
       String expected = "Fred";
       String actual = pet.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void petSpeakTest() {
        Pet pet = new Pet();
        String expected = "I'm a pet";
        String actual = pet.speak();

        Assert.assertEquals(expected, actual);
    }

}

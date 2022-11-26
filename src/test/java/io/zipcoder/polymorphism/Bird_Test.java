package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Bird_Test {
    @Test
    public void birdConstructorTest() {
        Bird bird = new Bird();
        bird.setName("Pepper");
        String expected = "Pepper";
        String actual = bird.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void birdSpeakTest() {
        Bird bird = new Bird();
        String expected = "Tweet!";
        String actual = bird.speak();

        Assert.assertEquals(expected, actual);
    }
}

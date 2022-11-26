package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class Cat_Test {
    @Test
    public void catConstructorTest() {
        Cat cat = new Cat();
        cat.setName("Pickle");
        String expected = "Pickle";
        String actual = cat.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void catSpeakTest() {
        Cat cat = new Cat();
        String expected = "Meow!";
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
    }
}

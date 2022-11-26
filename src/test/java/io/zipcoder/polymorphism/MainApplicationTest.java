package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MainApplicationTest {
    @Test
    public void createPetTest_Name(){
        MainApplication main = new MainApplication();
        Pet create = main.createPet("cat", "Red");
        String expected = "Red";
        String actual = create.getName();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void createPetTest_Speak(){
        MainApplication main = new MainApplication();
        Pet create = main.createPet("cat", "Red");
        String expected = "Meow!";
        String actual = create.speak();

        Assert.assertEquals(expected, actual);
    }
}

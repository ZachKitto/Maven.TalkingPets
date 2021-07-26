package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void inheritanceTest() {
        // Given
        Pet aDog = new Dog();

        // When
        Boolean isInherited = aDog instanceof Pet;

        // Then
        Assert.assertTrue(isInherited);
    }

    @Test
    public void setNameTest() {
        // Given
        Pet aDog = new Dog();
        String expectedName = "BillyBob";

        // When
        aDog.setName(expectedName);
        String actualName = aDog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void constructorTest() {
        // Given
        String expectedName = "BillyBob";
        Pet aDog = new Dog(expectedName);

        // When
        String actualName = aDog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}

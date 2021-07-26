package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void speakTest() {
        // Given
        Pet dog = new Dog();
        String expectedSpeakOutput = "Bark!";

        // When
        String actualSpeakOutput = dog.speak();

        // Then
        Assert.assertEquals(expectedSpeakOutput, actualSpeakOutput);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "BillyBob";
        Pet dog = new Dog(expectedName);

        // When
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nullaryConstructorTest() {
        // Given
        String expectedName = "";
        Pet dog = new Dog();

        // When
        String actualName = dog.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}

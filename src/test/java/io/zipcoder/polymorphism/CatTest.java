package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void speakTest() {
        // Given
        Pet cat = new Cat();
        String expectedSpeakOutput = "Meow!";

        // When
        String actualSpeakOutput = cat.speak();

        // Then
        Assert.assertEquals(expectedSpeakOutput, actualSpeakOutput);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Jim";
        Pet cat = new Cat(expectedName);

        // When
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nullaryConstructorTest() {
        // Given
        String expectedName = "";
        Pet cat = new Cat();

        // When
        String actualName = cat.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}

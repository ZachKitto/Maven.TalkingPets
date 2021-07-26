package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class MoleTest {

    @Test
    public void speakTest() {
        // Given
        Pet mole = new Mole();
        String expectedSpeakOutput = "Skwee!";

        // When
        String actualSpeakOutput = mole.speak();

        // Then
        Assert.assertEquals(expectedSpeakOutput, actualSpeakOutput);
    }

    @Test
    public void constructorWithNameTest() {
        // Given
        String expectedName = "Sean";
        Pet mole = new Mole(expectedName);

        // When
        String actualName = mole.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void nullaryConstructorTest() {
        // Given
        String expectedName = "";
        Pet mole = new Mole();

        // When
        String actualName = mole.getName();

        // Then
        Assert.assertEquals(expectedName, actualName);
    }
}

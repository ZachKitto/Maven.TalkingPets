package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.*;


public class PetInfoTest {

        PetInfo petInfo = new PetInfo();

    @Test
    public void askHowManyPetsTest() {
        // Given
        String expectedOutput = "How many pets do you have?";

        // When
        String actualOutput = petInfo.askHowManyPets();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void askTypeOfPetTest() {
        // Given
        String expectedOutput = "Input the type of pet";

        // When
        String actualOutput = petInfo.askTypeOfPet();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void askNameOfPetTest() {
        // Given
        String expectedOutput = "Input the name of the pet";

        // When
        String actualOutput = petInfo.askNameOfPet();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printNamesAndSpeakTest() {
        // Given
        Pet dog = new Dog("George");
        String expectedOutput = "";

        // When
        String actualOutput = petInfo.printNamesAndSpeak();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }
}

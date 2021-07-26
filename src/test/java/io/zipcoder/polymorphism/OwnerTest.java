package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

public class OwnerTest {

    Owner owner = new Owner();

    @Test
    public void askHowManyPetsTest() {
        // Given
        String expectedOutput = "How many pets do you have?";

        // When
        String actualOutput = owner.askHowManyPets();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void askTypeOfPetTest() {
        // Given
        String expectedOutput = "Input the type of pet";

        // When
        String actualOutput = owner.askTypeOfPet();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void askNameOfPetTest() {
        // Given
        String expectedOutput = "Input the name of the pet";

        // When
        String actualOutput = owner.askNameOfPet();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void printNamesAndSpeakTest() {
        // Given
        Pet dog = new Dog("George");
        Pet cat = new Cat("Bill");
        Pet mole = new Mole("Greg");
        String expectedOutput = "George says Bark! when he speaks\nBill says Meow! when he speaks\nGreg says Skwee! when he speaks";

        // When
        String actualOutput = owner.printNamesAndSpeak();

        // Then
        Assert.assertEquals(expectedOutput, actualOutput);
    }

    @Test
    public void recordNumberOfPets() {
        // Given
        int expectedNumberOfPets = 5;
        int userInput = 5;

        // When
        owner.recordNumberOfPets(userInput);
        int actualNumberOfPets = owner.getNumberOfPets();

        // Then
        Assert.assertEquals(expectedNumberOfPets, actualNumberOfPets);
    }

    @Test
    public void recordEachPet() {
        // Given
        List<Pet> expectedPets = new ArrayList<>(Arrays.asList(new Dog("harold"), new Cat("george"), new Mole("bill")));
        String userInputName1 = "harold"; String userInputName2 = "george"; String userInputName3 = "bill";
        String userInputType1 = "dog"; String userInputType2 = "cat"; String userInputType3 = "mole";

        // When
        owner.recordEachPet(userInputName1, userInputType1);
        owner.recordEachPet(userInputName2, userInputType2);
        owner.recordEachPet(userInputName3, userInputType3);
        List<Pet> actualPets = owner.getListOfPets();

        // Then
        Assert.assertEquals(expectedPets, actualPets);
    }
}

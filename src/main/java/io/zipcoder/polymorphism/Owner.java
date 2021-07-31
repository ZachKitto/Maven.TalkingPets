package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Owner {

    int numberOfPets;
    List<Pet> pets = new ArrayList<>();

    public void recordNumberOfPets(int userInput) {
    }

    public Integer getNumberOfPets() {
        return pets.size();
    }

    public void recordEachPet(String userInputName, String userInputType) {

    }

    public List<Pet> getListOfPets() {
        return this.pets;
    }

    public String askHowManyPets() {
        return "How many pets do you have?";
    }

    public String askTypeOfPet() {
        return "Input the type of pet";
    }

    public String askNameOfPet() {
        return "Input the name of the pet";
    }

    public String printNamesAndSpeak() {
        return null;
    }
}

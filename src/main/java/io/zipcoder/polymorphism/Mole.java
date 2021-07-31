package io.zipcoder.polymorphism;

public class Mole extends Pet {

    public Mole(String name) {
        super();
        this.name=name;
    }

    public Mole() {
        this.name="";
    }

    @Override
    public String speak() {
        return "Skwee!";
    }
}

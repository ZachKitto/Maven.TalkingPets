package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog(String name) {
        super();
        this.name=name;
    }

    public Dog() {
        this.name="";

    }


    @Override
    public String speak() {
        return "Bark!";
    }
}

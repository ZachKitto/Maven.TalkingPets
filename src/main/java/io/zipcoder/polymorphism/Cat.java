package io.zipcoder.polymorphism;

public class Cat extends Pet {

    public Cat(String name) {
        super();
        this.name=name;
    }

    public Cat() {
        this.name="";
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}

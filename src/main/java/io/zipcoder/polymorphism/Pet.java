package io.zipcoder.polymorphism;

public abstract class Pet {

    String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {this.name=name;
    }

    public abstract String speak();
}

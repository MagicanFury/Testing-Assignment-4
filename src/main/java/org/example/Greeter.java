package org.example;

public class Greeter {

    private final String name;

    public Greeter() {
        name = "Anonymous";
    }

    public Greeter(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello";
    }

    public String sayIntroduction() {
        return "Hello, my name is " + name;
    }

    public String getName() {
        return name;
    }

}

package com.kodilla.stream;

public class Mirror {
    private String input;

    public Mirror(String input) {
        this.input = input;
    }

    public String mirrorReflection() {
        StringBuilder object = new StringBuilder(input);
        object.reverse();
        return object.toString();
    }
}




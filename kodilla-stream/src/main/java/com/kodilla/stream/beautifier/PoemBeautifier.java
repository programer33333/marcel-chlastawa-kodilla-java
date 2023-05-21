package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beautify(String a, PoemDecorator poemDecorator) {
        String textResult = poemDecorator.decorate(a);
        System.out.println("New text: " + textResult);
    }
}

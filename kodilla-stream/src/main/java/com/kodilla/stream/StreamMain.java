package com.kodilla.stream;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {

        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("abcdefg", (a) -> a.toUpperCase());
        poemBeautifier.beautify("ABCDEFG", (a) -> a.toLowerCase());
        poemBeautifier.beautify("QWERTY", (a) -> "ABC" + a + "ABC");
        poemBeautifier.beautify("BIKE", (a) -> a.repeat(3));

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);
    }
}

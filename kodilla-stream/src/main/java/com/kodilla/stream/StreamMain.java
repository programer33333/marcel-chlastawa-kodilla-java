package com.kodilla.stream;
import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.lambda.ExpressionExecutor;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();

        poemBeautifier.beautify("abcdefg", (a) -> a.toUpperCase());
        poemBeautifier.beautify("ABCDEFG", (a) -> a.toLowerCase());
        poemBeautifier.beautify("QWERTY", (a) -> "ABC" + a + "ABC");
        poemBeautifier.beautify("BIKE", (a) -> a.repeat(3));
    }
}

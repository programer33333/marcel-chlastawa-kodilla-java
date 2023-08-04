package com.kodilla.patterns.strategy.social;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class UserTestSuite {

    @BeforeEach
    void spaceBefore() {
        System.out.println("");
    }

    @AfterAll
    static void spaceAfter() {
        System.out.println("");
    }

    @Test
    void testDefaultSharingStrategies() {
        //Given
        User kamil = new Millenials("Kamil Nowak");
        User jacek = new YGeneration("Jacek Kowalski");
        User krzysztof = new ZGeneration("Krzysztof Mocny");

        //When
        String kamilShouldShare = kamil.sharePost();
        System.out.println("Kamil should use: " + kamilShouldShare);
        String jacekShouldShare = jacek.sharePost();
        System.out.println("Jacek should use: " + jacekShouldShare);
        String krzysztofShouldShare = krzysztof.sharePost();
        System.out.println("Krzysztof should use: " + krzysztofShouldShare);

        //Then
        assertEquals("Snapchat", kamilShouldShare);
        assertEquals("Twitter", jacekShouldShare);
        assertEquals("Facebook", krzysztofShouldShare);
    }

    @Test
    void testIndividualSharingStrategy() {
        //Given
        User kamil = new Millenials("Kamil Nowak");

        //When
        String kamilShouldShare = kamil.sharePost();
        System.out.println("Kamil should use: " + kamilShouldShare);
        kamil.setSocialPublisher(new TwitterPublisher());
        kamilShouldShare = kamil.sharePost();
        System.out.println("Kamil now should use: " + kamilShouldShare);

        //Then
        assertEquals("Twitter", kamilShouldShare);
    }
}

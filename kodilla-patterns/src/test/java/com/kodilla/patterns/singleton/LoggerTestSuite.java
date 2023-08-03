package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class LoggerTestSuite {

    @Test
    void testGetLastLog() {
        //Given
        Logger logger = Logger.INSTANCE;
        //When
        String txt = "Example test";
        logger.log(txt);
        //Then
        Assertions.assertEquals(logger.getLastLog(), txt);
    }



}

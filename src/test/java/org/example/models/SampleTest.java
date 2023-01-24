package org.example.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @Test
    void exempleTest(){
        final int CHOSEN_NUMBER = 5;
        Sample sample = new Sample(CHOSEN_NUMBER);
        assertEquals(CHOSEN_NUMBER, sample.getNumber());
    }

}
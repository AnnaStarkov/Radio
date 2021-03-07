package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void shouldNext() {
        for (int i = 0; i < 10; i++) {
            Radio radio = new Radio();
            radio.setCurrentNumber(i);
            radio.nextStation();
            int actual = radio.getCurrentNumber();
            int expected = (i + 1) % 10;
            System.out.println("expected: " + expected + ", actual: " + actual);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldPrev() {
        for (int i = 0; i < 10; i++) {
            Radio radio = new Radio();
            radio.setCurrentNumber(i);
            radio.prevStation();
            int actual = radio.getCurrentNumber();
            int expected = (i + 9) % 10;
            System.out.println("expected: " + expected + ", actual: " + actual);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldPlusVolume() {
        int expected = 0;
        for (int i = 0; i <= 10; i++) {
            Radio radio = new Radio();
            radio.setCurrentVolume(i);
            if (radio.getCurrentVolume() < 10){
                expected = i+1;
            }
            radio.plusVolume();
            int actual = radio.getCurrentVolume();
            System.out.println("expected: " + expected + ", actual: " + actual);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void shouldMinusVolume() {
        int expected = 0;
        for (int i = 0; i <= 10; i++) {
            Radio radio = new Radio();
            radio.setCurrentVolume(i);
            if (radio.getCurrentVolume() > 0){
                expected = i-1;
            }
            radio.minusVolume();
            int actual = radio.getCurrentVolume();
            System.out.println("expected: " + expected + ", actual: " + actual);
            assertEquals(expected, actual);
        }
    }
}
package ru.netology;

public class Radio {
    private int currentNumber;
    private int currentVolume;

    public int getCurrentNumber() {
        return this.currentNumber;
    }
    public void setCurrentNumber(int newNumber) {this.currentNumber = newNumber;}

    public int getCurrentVolume() {
        return this.currentVolume;
    }
    public void setCurrentVolume(int newVolume) {
        this.currentVolume = newVolume;
    }

    public void nextStation() { this.currentNumber = (this.currentNumber + 1) % 10; }
    public void prevStation() {
        this.currentNumber = (this.currentNumber + 9) % 10;
    }

    public void plusVolume() {
        if (this.currentVolume < 10){
            this.currentVolume++;
        }
    }

    public void minusVolume() {
        if (this.currentVolume > 0){
            this.currentVolume--;
        }
    }
}
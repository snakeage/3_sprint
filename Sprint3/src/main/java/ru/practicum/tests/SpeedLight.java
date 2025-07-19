package ru.practicum.tests;

public class SpeedLight {
    public String showLight(int currentSpeed) {
        if (currentSpeed < 60) {
            return "green";

        } else if (currentSpeed < 80) {
            return "yellow";
        } else {
            return "red";
        }
    }
}

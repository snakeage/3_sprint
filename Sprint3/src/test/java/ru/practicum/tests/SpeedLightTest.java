package ru.practicum.tests;

import org.junit.Assert;
import org.junit.Test;

public class SpeedLightTest {

    @Test
    public void checkLightGreen() {
        checkLight("green", 50);
    }


    @Test
    public void checkLightYellow() {
        checkLight("yellow", 70);
    }

    @Test
    public void checkLightRed() {
        checkLight("red", 90);
    }

    private static void checkLight(String expectedLight, int currentSpeed) {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals(expectedLight, speedLight.showLight(currentSpeed));
    }
}

package ru.practicum.tests;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class SpeedLightTest {

    private final String expectedColour;
    private final int speed;

    public SpeedLightTest(String expectedColour, int speed) {
        this.expectedColour = expectedColour;
        this.speed = speed;
    }

    @Parameterized.Parameters(name = "expected Light  = {0}, speed = {1}")
    public static Object[] data() {
        return new Object[][] {
                {"green", 50},
                {"yellow", 70},
                {"red", 90}
        };
    }

    @Test
    public void shouldReturnCorrectLightForGivenSpeed() {
        checkLight(expectedColour, speed);
    }

    private static void checkLight(String expectedLight, int currentSpeed) {
        SpeedLight speedLight = new SpeedLight();
        Assert.assertEquals(expectedLight, speedLight.showLight(currentSpeed));
    }
}

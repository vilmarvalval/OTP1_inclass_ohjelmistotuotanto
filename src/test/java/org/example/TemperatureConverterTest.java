package org.example;

import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConverterTest {

    @org.junit.jupiter.api.Test
    void fahrenheitToCelsius() {
        TemperatureConverter tempF = new TemperatureConverter();
        double testF = tempF.fahrenheitToCelsius(5);
        Assertions.assertEquals(-15, testF);

        testF = tempF.fahrenheitToCelsius(-40);
        Assertions.assertEquals(-40, testF);

        testF = tempF.fahrenheitToCelsius(212);
        Assertions.assertEquals(100, testF);
    }

    @org.junit.jupiter.api.Test
    void celsiusToFahrenheit() {
        TemperatureConverter tempC = new TemperatureConverter();
        double testC = tempC.celsiusToFahrenheit(-20);
        Assertions.assertEquals(-4, testC);

        testC = tempC.celsiusToFahrenheit(-40);
        Assertions.assertEquals(-40, testC);

        testC = tempC.celsiusToFahrenheit(37);
        Assertions.assertEquals(98.6, testC);
    }

    @org.junit.jupiter.api.Test
    void isExtremeTemperature() {
        TemperatureConverter tempE = new TemperatureConverter();
        boolean testE = tempE.isExtremeTemperature(-40);
        Assertions.assertFalse(testE);

        testE =tempE.isExtremeTemperature(-41);
        Assertions.assertTrue(testE);

        testE=tempE.isExtremeTemperature(51);
        Assertions.assertTrue(testE);

        testE=tempE.isExtremeTemperature(50);
        Assertions.assertFalse(testE);
    }
}
package org.example;

public class TemperatureConverter {
    public double fahrenheitToCelsius(double frheit){
        return (frheit-32)*5/9;
    }
    public double celsiusToFahrenheit(double clsius){
        return (clsius*9/5)+32;
    }
    public boolean isExtremeTemperature(double clsius){
        return clsius<-40 || clsius>50;
    }
}

package edu.ucsd.cs110.temperature;
public class Fahrenheit extends Temperature
{
    public Fahrenheit(float t)
    {
        super(t);
    }

    @Override
    public Temperature toCelsius() {
        float value = ((this.getValue() - 32) * 5)/9;
//        return new Celsius(value);
        return null;
    }


    @Override
    public Temperature toFahrenheit() {
//        return this;
        return null;
    }

    public String toString()
    {
        return this.getValue() + " F";
    }
}
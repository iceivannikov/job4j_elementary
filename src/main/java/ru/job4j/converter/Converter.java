package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void passed(float expected, float output, String currency) {
        boolean passed = expected == output;
        System.out.println("420 rubles are 2 " + currency + ". Test result : " + passed);
    }

    public static void main(String[] args) {
        float input = 420;

        float outputEuro = Converter.rubleToEuro(input);
        passed(6, outputEuro, "euro");

        float outputDollar = Converter.rubleToDollar(input);
        passed(7, outputDollar, "dollars");
    }
}

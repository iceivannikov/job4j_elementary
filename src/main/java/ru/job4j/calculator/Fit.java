package ru.job4j.calculator;

public class Fit {
    private static final short BASE_HEIGHT_MAN = 100;
    private static final short BASE_HEIGHT_WOMAN = 110;
    private static final double WEIGHT_COEFFICIENT = 1.15;

    /**
     * Вычисляет идеальный вес для мужчины на основе его роста.
     *
     * @param height рост мужчины в сантиметрах.
     * @return идеальный вес в килограммах.
     */
    public static double manWeight(int height) {
        if (height < BASE_HEIGHT_MAN) {
            throw new IllegalArgumentException("Рост должен быть больше базового роста для мужчин.");
        }
        return (height - BASE_HEIGHT_MAN) * WEIGHT_COEFFICIENT;
    }

    /**
     * Вычисляет идеальный вес для женщины на основе её роста.
     *
     * @param height рост женщины в сантиметрах.
     * @return идеальный вес в килограммах.
     */
    public static double womanWeight(int height) {
        if (height < BASE_HEIGHT_WOMAN) {
            throw new IllegalArgumentException("Рост должен быть больше базового роста для женщин.");
        }
        return (height - BASE_HEIGHT_WOMAN) * WEIGHT_COEFFICIENT;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = manWeight(height);
        System.out.printf("Man %d is %.2f%n", height, man);
        double woman = womanWeight(height);
        System.out.printf("Woman %d is %.2f%n", height, woman);
    }
}

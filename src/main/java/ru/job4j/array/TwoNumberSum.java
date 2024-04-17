package ru.job4j.array;

public class TwoNumberSum {

    public static final String MSG = "Массив не должен быть null и должен содержать как минимум два элемента.";

    public static int[] getIndexes(int[] array, int target) {
        if (array == null || array.length < 2) {
            throw new IllegalArgumentException(MSG);
        }
        int i = 0;
        int j = array.length - 1;
        int sum;
        while (i < j) {
            sum = array[i] + array[j];
            if (sum == target) {
                return new int[]{i, j};
            } else if (sum < target) {
                i++;
            } else {
                j--;
            }
        }
        return new int[0];
    }
}

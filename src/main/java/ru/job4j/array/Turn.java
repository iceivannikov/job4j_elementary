package ru.job4j.array;

public class Turn {
    public static int[] back(int[] array) {
        int length = array.length - 1;
        for (int i = 0; i < length; i++) {
            int temp = array[length];
            array[length] = array[i];
            array[i] = temp;
            length--;
        }
        return array;
    }
}

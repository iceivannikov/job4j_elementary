package ru.job4j.array;

import java.util.Arrays;

public class UniqueValues {
    public static int[] findUniqueValues(int[] arr) {
        Arrays.sort(arr);
        int[] uniqueValues = new int[arr.length];
        int left = 0;
        int right = 0;
        int size = 0;
        while (left < arr.length) {
            while (right < arr.length && arr[left] == arr[right]) {
                right++;
            }
            uniqueValues[size++] = arr[left];
            left = right;
        }
        return Arrays.copyOf(uniqueValues, size);
    }
}

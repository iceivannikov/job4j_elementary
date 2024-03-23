package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class UniqueValuesTest {

    @Test
    void findUniqueValuesTest() {
        int[] input = new int[]{1, 2, 3, 4, 5, 1, 2, 3, 6};
        int[] result = UniqueValues.findUniqueValues(input);
        int[] expected = new int[]{1, 2, 3, 4, 5, 6};
        assertThat(result).containsExactly(expected);
    }
}
package ru.job4j.loop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CounterTest {

    @Test
    void whenStart0Finish10Then55() {
        int start = 0;
        int finish = 10;
        int actual = Counter.sum(start, finish);
        int expected = 55;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart3Finish8Then33() {
        int start = 3;
        int finish = 8;
        int actual = Counter.sum(start, finish);
        int expected = 33;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart1Finish1Then1() {
        int start = 1;
        int finish = 1;
        int actual = Counter.sum(start, finish);
        int expected = 1;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenStart5Finish3Then0() {
        int start = 5;
        int finish = 3;
        int actual = Counter.sum(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int actual = Counter.sumByEven(start, finish);
        int expected = 30;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromThreeToEightThenEighteen() {
        int start = 3;
        int finish = 8;
        int actual = Counter.sumByEven(start, finish);
        int expected = 18;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromOneToOneThenZero() {
        int start = 1;
        int finish = 1;
        int actual = Counter.sumByEven(start, finish);
        int expected = 0;
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    void whenSumEvenNumbersFromMinusTenToTwentyFiveThenOneHundredTwentySix() {
        int start = -10;
        int finish = 25;
        int actual = Counter.sumByEven(start, finish);
        int expected = 126;
        assertThat(actual).isEqualTo(expected);
    }
}
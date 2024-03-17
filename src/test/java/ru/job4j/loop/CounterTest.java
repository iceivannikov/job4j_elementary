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
}
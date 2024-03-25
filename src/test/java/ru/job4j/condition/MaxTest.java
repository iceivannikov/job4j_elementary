package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To3Then6() {
        int a = 6;
        int b = 3;
        int result = Max.max(a, b);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To13Then13() {
        int a = 6;
        int b = 13;
        int result = Max.max(a, b);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax5To5Then5() {
        int a = 5;
        int b = 5;
        int result = Max.max(a, b);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax6To5To5Then6() {
        int a = 6;
        int b = 5;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To20To5Then20() {
        int a = 10;
        int b = 20;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 20;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax10To20To5To40Then40() {
        int a = 10;
        int b = 20;
        int c = 5;
        int d = 40;
        int result = Max.max(a, b, c, d);
        int expected = 40;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenMax50To60To70To30Then70() {
        int a = 50;
        int b = 60;
        int c = 70;
        int d = 30;
        int result = Max.max(a, b, c, d);
        int expected = 70;
        assertThat(result).isEqualTo(expected);
    }
}
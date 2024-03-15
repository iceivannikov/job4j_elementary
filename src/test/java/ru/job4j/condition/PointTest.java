package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when06to68then6Dot32() {
        double expected = 6.32;
        int x1 = 0;
        int y1 = 6;
        int x2 = 6;
        int y2 = 8;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus3Minus6to77then16Dot4() {
        double expected = 16.4;
        int x1 = -3;
        int y1 = -6;
        int x2 = 7;
        int y2 = 7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3Minus6to7Minus7then4Dot12() {
        double expected = 4.12;
        int x1 = 3;
        int y1 = -6;
        int x2 = 7;
        int y2 = -7;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
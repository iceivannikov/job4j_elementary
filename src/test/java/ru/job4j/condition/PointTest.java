package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.withPrecision;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PointTest {

    @Test
    void when00to20then2() {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(2, 0);
        double expected = 2;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when06to68then6Dot32() {
        Point point1 = new Point(0, 6);
        Point point2 = new Point(6, 8);
        double expected = 6.32;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenMinus3Minus6to77then16Dot4() {
        Point point1 = new Point(-3, -6);
        Point point2 = new Point(7, 7);
        double expected = 16.4;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3Minus6to7Minus7then4Dot12() {
        Point point1 = new Point(3, -6);
        Point point2 = new Point(7, -7);
        double expected = 4.12;
        double output = point1.distance(point2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when3Minus6to7Minus7toMinus77then4Dot12() {
        Point point1 = new Point(3, -6);
        Point point2 = new Point(7, -7);
        Point point3 = new Point(-7, 7);
        double expected = 16.4;
        double output = point1.distance3d(point3);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void when68to06to4Minus5then13Dot15() {
        Point point1 = new Point(6, 8);
        Point point2 = new Point(0, 6);
        Point point3 = new Point(4, -5);
        double expected = 13.15;
        double output = point1.distance3d(point3);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}
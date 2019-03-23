package ru.avalon.java.dev.j10.labs.shapes;

import static java.lang.Math.PI;

/**
 * Представление об окружности.
 * <p>
 * Окру́жность — замкнутая плоская кривая, которая состоит из
 * всех точек на плоскости, равноудалённых от заданной точки.
 *
 * @see <a href="https://ru.wikipedia.org/wiki/%D0%9E%D0%BA%D1%80%D1%83%D0%B6%D0%BD%D0%BE%D1%81%D1%82%D1%8C">Окружность</a>
 */
public final class Circle implements Ellipse {
    private final float r; // радиус окружности
    private final float x2;
    private final float y2;


    public Circle() {
        r = (float) (100 * Math.random());
        x2 = (float) (100 * Math.random());
        y2 = (float) (100 * Math.random());
    }


    @Override
    public float getLength() {
        return (float) (2 * PI * r);
    }

    @Override
    public float getX() {
        return x2;
    }

    @Override
    public float getY() {
        return y2;
    }

    @Override
    public float getArea() {
        return (float) (PI * r * r);
    }

    @Override
    public int getRotation() {
        return 0;
    }

    /*
     * TODO: Реализовать класс 'Circle'
     * 1. Используйте наследование.
     * 2. Реализуйте все абстрактные методы.
     */

    @Override
    public String toString() {
        return "Circle (" +
                " r = " + r +
                ')';
    }
}

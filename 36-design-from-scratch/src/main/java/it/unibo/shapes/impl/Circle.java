package it.unibo.shapes.impl;

import it.unibo.shapes.api.Shapes;

public class Circle implements Shapes {

    private final double radius;

    public Circle(final int radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius) * java.lang.Math.PI; // area = πr²
    }

    @Override
    public double getPerimeter() {
        return 2 * this.radius * java.lang.Math.PI; // perimeter = 2πr
    }

    @Override
    public String toString() {
        return "Circle [radius=" + radius + ", Area=" + getArea() + ", Perimeter=" + getPerimeter() + "]";
    }

}

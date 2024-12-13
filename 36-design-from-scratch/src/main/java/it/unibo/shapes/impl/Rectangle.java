package it.unibo.shapes.impl;

import it.unibo.shapes.api.Poligoni;

public class Rectangle implements Poligoni {

    private final int N_SHORT_EDGES = 2;
    private final int N_LONG_EDGES = 2;
    private final double shortEdgesLength;
    private final double longEdgesLength;

    public Rectangle(final double shortEdgesLength, final double longEdgesLength) {
        this.shortEdgesLength = shortEdgesLength;
        this.longEdgesLength = longEdgesLength;
    }

    @Override
    public double getPerimeter() {
        return (N_SHORT_EDGES * shortEdgesLength) + (N_LONG_EDGES * longEdgesLength);
    }

    @Override
    public double getArea() {
        return shortEdgesLength * longEdgesLength;
    }

    @Override
    public int getEdgeCount() {
        return N_LONG_EDGES + N_SHORT_EDGES;
    }

    @Override
    public String toString() {
        return "Rectangle [shortEdgesLength=" + shortEdgesLength + ", longEdgesLength=" + longEdgesLength
                + ", Perimeter=" + getPerimeter() + ", Area=" + getArea() + ", EdgeCount="
                + getEdgeCount() + "]";
    }

}

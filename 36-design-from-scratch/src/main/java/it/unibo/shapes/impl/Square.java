package it.unibo.shapes.impl;

import it.unibo.shapes.api.Poligoni;

public class Square implements Poligoni {

    private static int N_EDGES = 4;
    private final double edgeLength;

    public Square(final double edgeLength) {
        this.edgeLength = edgeLength;
    }

    @Override
    public double getPerimeter() {
        return N_EDGES * this.edgeLength;
    }

    @Override
    public double getArea() {
        return this.edgeLength * this.edgeLength;
    }

    @Override
    public int getEdgeCount() {
        return N_EDGES;
    }

    @Override
    public String toString() {
        return "Square [edgeLength=" + edgeLength + ", Perimeter=" + getPerimeter() + ", Area=" + getArea()
                + ", EdgeCount=" + getEdgeCount() + "]";
    }

}

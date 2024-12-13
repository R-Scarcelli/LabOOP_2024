package it.unibo.shapes.impl;

import it.unibo.shapes.api.Poligoni;

public class Triangle implements Poligoni {

    private final int N_EDGES = 3;
    private final double l1;
    private final double l2;
    private final double l3;

    public Triangle(final double l1, final double l2, final double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }

    @Override
    public double getPerimeter() {
        return this.l1 + this.l2 + this.l3;
    }

    @Override
    public double getArea() {
        final double semiPerimeter = this.getPerimeter() / 2;
        return Math.sqrt(
                semiPerimeter * (semiPerimeter - this.l1) * (semiPerimeter - this.l2) * (semiPerimeter - this.l3));
    }

    @Override
    public int getEdgeCount() {
        return N_EDGES;
    }

    @Override
    public String toString() {
        return "Triangle [l1=" + l1 + ", l2=" + l2 + ", l3=" + l3 + ", Perimeter=" + getPerimeter()
                + ", Area=" + getArea() + ", EdgeCount=" + getEdgeCount() + "]";
    }

}

package it.unibo.shapes.test;

import it.unibo.shapes.api.Poligoni;
import it.unibo.shapes.api.Shapes;
import it.unibo.shapes.impl.Circle;
import it.unibo.shapes.impl.Rectangle;
import it.unibo.shapes.impl.Square;
import it.unibo.shapes.impl.Triangle;

public class WorkWithShapes {
    private static int C_RADIUS = 2;
    private static double Q_EDGE_LENGTH = 4;
    private static double R_SHORT_EDGES_LENGTH = 6;
    private static double R_LONG_EDGES_LENGTH = 8;
    private static double T_EDGES_LENGTH = 10;

    public static void main(String[] argv) {

        Circle c = new Circle(C_RADIUS);
        System.out.println(c.toString());

        Square q = new Square(Q_EDGE_LENGTH);
        System.out.println(q.toString());

        Rectangle r = new Rectangle(R_SHORT_EDGES_LENGTH, R_LONG_EDGES_LENGTH);
        System.out.println(r.toString());

        Triangle t = new Triangle(T_EDGES_LENGTH, T_EDGES_LENGTH, T_EDGES_LENGTH);
        System.out.println(t.toString());

        Poligoni p = new Triangle(T_EDGES_LENGTH, T_EDGES_LENGTH, T_EDGES_LENGTH);
        System.out.println("Area=" + p.getArea() + ", Perimeter=" + p.getPerimeter() + ", Edges=" + p.getEdgeCount());

        Shapes c1 = new Circle(C_RADIUS);
        System.out.println("Area=" + c1.getArea() + ", Perimeter=" + c1.getPerimeter());
    }
}

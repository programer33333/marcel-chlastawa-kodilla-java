package com.kodilla.testing.shape;

import java.lang.Math;
public class Square implements Shape {

    private double edge;

    public Square(double edge) {
        this.edge = edge;
    }

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return Math.pow(edge, 2);
    }

    public double getEdge() {
        return edge;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        return Double.compare(square.edge, edge) == 0;
    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(edge);
        return (int) (temp ^ (temp >>> 32));
    }
}

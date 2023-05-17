package com.kodilla.testing.shape;

public class Triangle implements Shape {

    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public String getShapeName() {
        return "Triangle";
    }

    public double getField() {
        return base * height / 2;
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Triangle triangle = (Triangle) o;

        if (Double.compare(triangle.height, height) != 0) return false;
        return Double.compare(triangle.base, base) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(height);
        result = (int) (temp ^ (temp >>> 32));
        temp = Double.doubleToLongBits(base);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}

package org.example.task2;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }

    private void setLength(double length) {
        this.length = (length > 0) ? length : 1;
    }

    private void setWidth(double width) {
        this.width = (width > 0) ? width : 1;
    }

    private void setHeight(double height) {
        this.height = (height > 0) ? height : 1;
    }

    public double surfaceArea() {
        return 2 * (length * width + length * height + width * height);
    }

    public double lateralSurfaceArea() {
        return 2 * height * (length + width);
    }

    public double volume() {
        return length * width * height;
    }
}

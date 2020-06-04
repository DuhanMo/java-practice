package com.hw2.model.vo;

public class Point {
    protected int x;
    protected int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.printf("(x, y) : (%d, %d)\n", x, y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

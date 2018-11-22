package com.skaari;

public abstract class Box<K extends Number, L extends Number, F extends Number> {
    private K width;
    private L depth;
    private F heigth;

    public Box() {
    }

    public Box(K width, L depth, F heigth) {
        this.width = width;
        this.depth = depth;
        this.heigth = heigth;
    }

    public K getWidth() {
        return width;
    }

    public void setWidth(K width) {
        this.width = width;
    }

    public L getDepth() {
        return depth;
    }

    public void setDepth(L depth) {
        this.depth = depth;
    }

    public F getHeigth() {
        return heigth;
    }

    public void setHeigth(F heigth) {
        this.heigth = heigth;
    }

    abstract K volume();
}

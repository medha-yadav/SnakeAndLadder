package com.machinecoding.model;

public class Ladder {

    int bottom;
    int head;

    public Ladder(int bottom, int head) {
        this.bottom = bottom;
        this.head = head;
    }

    public int getBottom() {
        return bottom;
    }

    public void setBottom(int bottom) {
        this.bottom = bottom;
    }

    public int getHead() {
        return head;
    }

    public void setHead(int head) {
        this.head = head;
    }
}

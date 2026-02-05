package com.markerInterface;
class Prototype implements Cloneable {

    int value = 10;

    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

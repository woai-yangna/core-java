package com.coder.homework.homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/12
 */
public class Poker {
    private int index;
    private String value;

    public Poker() {
    }

    public Poker(int index, String value) {
        this.index = index;
        this.value = value;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

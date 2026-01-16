package com.coder.homework3;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Car {
    private String type;
    private int inHour;
    private int outHour;
    private int inMinute;
    private int outMinute;
    private String num;
    public Car() {
    }

    public Car(String num,String type, int inHour, int outHour, int inMinute, int outMinute) {
        this.num=num;
        this.type = type;
        this.inHour = inHour;
        this.outHour = outHour;
        this.inMinute = inMinute;
        this.outMinute = outMinute;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getInHour() {
        return inHour;
    }

    public void setInHour(int inHour) {
        this.inHour = inHour;
    }

    public int getOutHour() {
        return outHour;
    }

    public void setOutHour(int outHour) {
        this.outHour = outHour;
    }

    public int getInMinute() {
        return inMinute;
    }

    public void setInMinute(int inMinute) {
        this.inMinute = inMinute;
    }

    public int getOutMinute() {
        return outMinute;
    }

    public void setOutMinute(int outMinute) {
        this.outMinute = outMinute;
    }
}

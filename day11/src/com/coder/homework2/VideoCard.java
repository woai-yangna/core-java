package com.coder.homework2;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class VideoCard {
    private String type;
    private int rem;

    public VideoCard() {
    }

    public VideoCard(String type, int rem) {
        this.type = type;
        this.rem = rem;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRem() {
        return rem;
    }

    public void setRem(int rem) {
        this.rem = rem;
    }
}

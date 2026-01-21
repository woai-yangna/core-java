package com.coder.homework2;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Computer {
    private String brand;
    private VideoCard videoCard;

    public Computer() {
    }

    public Computer(String brand, VideoCard videoCard) {
        this.brand = brand;
        this.videoCard = videoCard;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public VideoCard getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard) {
        this.videoCard = videoCard;
    }
}

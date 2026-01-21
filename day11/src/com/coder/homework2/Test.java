package com.coder.homework2;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {
        VideoCard card=new VideoCard("独立显卡",4);
        Computer computer=new Computer("惠普",card);
        Player player=new Player();
        player.setName("李白");
        player.playGame(computer);
    }
}

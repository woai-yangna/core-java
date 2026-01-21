package com.coder.homework2;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Player {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void playGame(Computer computer){
        VideoCard card=computer.getVideoCard();
        if ("独立显卡".equals(card.getType()) && card.getRem()>=4){
            System.out.println(name+"可以玩游戏");
        }else{
            System.out.println(name+"不可以玩游戏");
        }
    }
}

package com.coder.homework.homework1;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/12
 */
public class Player {
    private String name;
    private List<Poker> pokers;

    public Player() {
    }

    public Player(String name, List<Poker> pokers) {
        this.name = name;
        this.pokers = pokers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Poker> getPokers() {
        return pokers;
    }

    public void setPokers(List<Poker> pokers) {
        this.pokers = pokers;
    }
}

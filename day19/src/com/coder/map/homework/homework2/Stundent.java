package com.coder.map.homework.homework2;

import java.util.Map;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/17
 */
public class Stundent {
    private String name;
    private Map<String,Double> scores;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Double> getScores() {
        return scores;
    }

    public void setScores(Map<String, Double> scores) {
        this.scores = scores;
    }
}

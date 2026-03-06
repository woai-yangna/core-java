package com.coder.homework;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class buyer {
    private String name;
    private LocalDate date1;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDate1() {
        return date1;
    }

    public void setDate1(LocalDate date1) {
        this.date1 = date1;
    }

    public buyer(String name, LocalDate date1) {
        this.name = name;
        this.date1 = date1;
    }

    public buyer() {
    }
}


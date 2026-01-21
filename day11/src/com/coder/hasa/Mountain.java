package com.coder.hasa;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Mountain {
    private String name;
    private Temple temple;//组合关系

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Temple getTemple() {
        return temple;
    }

    public void setTemple(Temple temple) {
        this.temple = temple;
    }
}

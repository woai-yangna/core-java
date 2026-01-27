package com.coder.math.Enum;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class Goods {
    private Integer id;
    private String name;
    private StatusEnum status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public Goods(Integer id, String name, StatusEnum status) {
        this.id = id;
        this.name = name;
        this.status = status;
    }

    public Goods() {
    }
}

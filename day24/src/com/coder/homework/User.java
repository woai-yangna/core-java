package com.coder.homework;

import java.io.Serializable;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/23
 */
public class User implements Serializable {
    private static final long serialVersionUID = -8536119158917721744L;
    private String name;
    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String wwwwtoString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

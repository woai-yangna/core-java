package com.coder.homework.homework2.homework1;

import java.util.Objects;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/23
 */
public class Tiger implements Cloneable {
    private double bodylength;
    private double weight;

    public Tiger(double bodylength, double weight) {
        this.bodylength = bodylength;
        this.weight = weight;
    }

    public Tiger() {
    }

    public double getBodylength() {
        return bodylength;
    }

    public void setBodylength(double bodylength) {
        this.bodylength = bodylength;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tiger tiger = (Tiger) o;
        return Double.compare(tiger.bodylength, bodylength) == 0 && Double.compare(tiger.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bodylength, weight);
    }

    @Override
    public String toString() {
        return "Tiger{" +
                "bodylength=" + bodylength +
                ", weight=" + weight +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

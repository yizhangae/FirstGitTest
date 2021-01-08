package com.test.thread.callable;

import java.io.Serializable;
import java.util.Objects;

public class Demo<T> implements Serializable {

    private static final long serialVersionUID = 4419042680834106563L;
   public Integer integer;
   public T t;
    public void show(){
        System.out.println("master Update");
    }
    public Demo() {
    }

    public Demo(Integer integer, T t) {
        this.integer = integer;
        this.t = t;
    }

    public Integer getInteger() {
        return integer;
    }

    public void setInteger(Integer integer) {
        this.integer = integer;
    }

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Demo<?> demo = (Demo<?>) o;
        return Objects.equals(integer, demo.integer) && Objects.equals(t, demo.t);
    }

    @Override
    public int hashCode() {
        return Objects.hash(integer, t);
    }

    @Override
    public String toString() {
        return "Demo{" +
                "integer=" + integer +
                ", t=" + t +
                '}';
    }
}

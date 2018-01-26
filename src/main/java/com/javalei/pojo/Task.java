package com.javalei.pojo;

public class Task {

    private int id;
    private String text;
    private boolean complete;


    public Task() {
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", complete=" + complete +
                '}';
    }



}

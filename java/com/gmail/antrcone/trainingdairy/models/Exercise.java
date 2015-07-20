package com.gmail.antrcone.trainingdairy.models;

public class Exercise {
    private int id_exc;
    private String name;
    private String group;
    private boolean deleted = false;

    public int getId_exc() {
        return id_exc;
    }

    public void setId_exc(int id_exc) {
        this.id_exc = id_exc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id_exc=" + id_exc +
                ", name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}

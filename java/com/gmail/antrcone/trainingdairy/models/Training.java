package com.gmail.antrcone.trainingdairy.models;

public class Training {
    private int id_tren_template;
    private String name;
    private boolean deleted = false;

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public int getId_tren_template() {
        return id_tren_template;
    }

    public void setId_tren_template(int id_tren_template) {
        this.id_tren_template = id_tren_template;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Training{" +
                "id_tren_template=" + id_tren_template +
                ", name='" + name + '\'' +
                ", deleted=" + deleted +
                '}';
    }
}

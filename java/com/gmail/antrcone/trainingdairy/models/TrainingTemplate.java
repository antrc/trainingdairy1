package com.gmail.antrcone.trainingdairy.models;

/**
 * Created by AMostovich on 15.07.2015.
 */
public class TrainingTemplate {
    private int _id;
    private int id_tren_template;
    private int id_exc;
    private int rounds_cnt;
    private int round_time;
    private int rest_time;

    public int getRest_time() {
        return rest_time;
    }

    public void setRest_time(int rest_time) {
        this.rest_time = rest_time;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public int getId_tren_template() {
        return id_tren_template;
    }

    public void setId_tren_template(int id_tren_template) {
        this.id_tren_template = id_tren_template;
    }

    public int getId_exc() {
        return id_exc;
    }

    public void setId_exc(int id_exc) {
        this.id_exc = id_exc;
    }

    public int getRounds_cnt() {
        return rounds_cnt;
    }

    public void setRounds_cnt(int rounds_cnt) {
        this.rounds_cnt = rounds_cnt;
    }

    public int getRound_time() {
        return round_time;
    }

    public void setRound_time(int round_time) {
        this.round_time = round_time;
    }

    @Override
    public String toString() {
        return "TrainingTemplate{" +
                "_id=" + _id +
                ", id_tren_template=" + id_tren_template +
                ", id_exc=" + id_exc +
                ", rounds_cnt=" + rounds_cnt +
                ", round_time=" + round_time +
                ", rest_time=" + rest_time +
                '}';
    }
}

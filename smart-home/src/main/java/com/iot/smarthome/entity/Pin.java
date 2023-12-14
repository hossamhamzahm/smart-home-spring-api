package com.iot.smarthome.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.Check;


@Entity
@Table(name="pin", uniqueConstraints = @UniqueConstraint(columnNames = {"board", "pin_number"}))
public class Pin {
    @Id
//    @GeneratedValue(strategy= GenerationType.UUID)
    @Column(name="id")
    private String id;

    @Column(name="type")
    @Check(constraints = "type = 'control' OR type = 'consumption'")
    private String type;

    @Column(name="pin_number")
    private int pin_number;


    @Column(name="consumption")
    private Double consumption;


    @Column(name="state")
    private Boolean state;

    @Column(name="board")
    private String board;

    public Pin() {
    }


    public Pin(String type, int pin_number, Double consumption, Boolean state, String board) {
        this.type = type;
        this.pin_number = pin_number;
        this.consumption = consumption;
        this.state = state;
        this.board = board;
    }

    public Pin(String id, String type, int pin_number, Double consumption, Boolean state, String board) {
        this.id = id;
        this.type = type;
        this.pin_number = pin_number;
        this.consumption = consumption;
        this.state = state;
        this.board = board;
    }

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPin_number() {
        return pin_number;
    }

    public void setPin_number(int pin_number) {
        this.pin_number = pin_number;
    }

    public Double getConsumption() {
        return consumption;
    }

    public void setConsumption(Double consumption) {
        this.consumption = consumption;
    }

    public Boolean isState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public String getBoard() {
        return board;
    }

    public void setBoard(String board) {
        this.board = board;
    }
}

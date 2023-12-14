package com.iot.smarthome.entity;


import jakarta.persistence.*;

@Entity
@Table(name="socket")
public class Socket {
    @Id
    @GeneratedValue(strategy=GenerationType.UUID)
    @Column(name="id")
    private String id;


    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="control_pin_id")
    private Pin control_pin;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="consumption_pin_id")
    private Pin consumption_pin;

    @ManyToOne(cascade={CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    @JoinColumn(name="room_id")
    private Room room;

    @Column(name="name")
    private String name;


    public Socket() {
    }

    public Socket(Room room, Pin control_pin, Pin consumption_pin, String name) {
        this.room = room;
        this.consumption_pin = consumption_pin;
        this.control_pin = control_pin;
        this.name = name;
    }

    public Socket(Pin control_pin, Room room, String name) {
        this.control_pin = control_pin;
        this.room = room;
        this.name = name;
    }

    public Pin getControl_pin() {
        return control_pin;
    }

    public void setControl_pin(Pin control_pin) {
        this.control_pin = control_pin;
    }

    public Pin getConsumption_pin() {
        return consumption_pin;
    }

    public void setConsumption_pin(Pin consumption_pin) {
        this.consumption_pin = consumption_pin;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

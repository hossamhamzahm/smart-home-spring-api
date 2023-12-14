package com.iot.smarthome.entity;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name="id")
    private String id;

    @Column(name="name")
    private String name;


    @Column(name="counter")
    private Integer counter = 1;

    @OneToMany(/*fetch=FetchType.LAZY,*/ mappedBy="room", cascade={CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
    private List<Socket> sockets;

    public Room() {
    }

    public Room(String name, Integer counter) {
        if(counter != null) this.counter = counter;
        this.name = name;
    }

    public List<Socket> getSockets() {
        return sockets;
    }

    public void setSockets(List<Socket> sockets) {
        this.sockets = sockets;
    }

    public void addSocket(Socket socket){
        if(this.sockets == null) this.sockets = new ArrayList<>();

        this.sockets.add(socket);
        socket.setRoom(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCounter() {
        return counter;
    }

    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}

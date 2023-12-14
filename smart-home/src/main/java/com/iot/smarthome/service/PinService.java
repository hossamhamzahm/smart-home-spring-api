package com.iot.smarthome.service;

import com.iot.smarthome.entity.Pin;

import java.util.List;

public interface PinService {
    public List<Pin> findAll();
    public Pin findById(String id);

    public void deleteById(String id);
    public Pin save(Pin pin);


    // specific:
    public List<Pin> findByBoard(String board);
    public List<Pin> findByType(String type);

    public List<Pin> findByPinNumber(int pin_number);

    public Pin findByBoard_PinNumber(String board, int pin_number);
}

package com.iot.smarthome.service;

import com.iot.smarthome.entity.Pin;
import com.iot.smarthome.repository.PinRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PinServiceImpl implements PinService {
    private final PinRepository pinRepository;

    @Autowired
    public PinServiceImpl(PinRepository pinRepository) {
        this.pinRepository = pinRepository;
    }

    @Override
    @Transactional
    public List<Pin> findAll(){
        return pinRepository.findAll();
    }

    @Override
    @Transactional
    public Pin findById(String id) {
        Optional<Pin> result = pinRepository.findById(id);
        if(result.isEmpty()){
            throw new RuntimeException("No pin with id: " + id);
        }
        return result.get();
    }

    @Override
    @Transactional
    public void deleteById(String id) {
        pinRepository.deleteById(id);
    }

    @Override
    @Transactional
    public Pin save(Pin pin) {
        return pinRepository.save(pin);
    }


    @Override
    @Transactional
    public List<Pin> findByBoard(String board) {
        return pinRepository.findByBoard(board);
    }
    @Override
    @Transactional
    public List<Pin> findByType(String type) {
        return pinRepository.findByType(type);
    }

    @Override
    @Transactional
    public List<Pin> findByPinNumber(int pin_number) {
        return pinRepository.findByPinNumber(pin_number);
    }

    @Override
    @Transactional
    public Pin findByBoard_PinNumber(String board, int pin_number) {
        return pinRepository.findByBoard_PinNumber(board, pin_number);
    }
}

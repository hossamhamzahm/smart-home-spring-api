package com.iot.smarthome.repository;

import com.iot.smarthome.entity.Pin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Repository
@CrossOrigin("*")
public interface PinRepository extends JpaRepository<Pin, String> {
    @Query("SELECT p FROM Pin p WHERE p.board = ?1")
    public List<Pin> findByBoard(String board);

    @Query("SELECT p FROM Pin p WHERE p.type = ?1")
    public List<Pin> findByType(String type);

    @Query("SELECT p FROM Pin p WHERE p.pin_number = ?1")
    public List<Pin> findByPinNumber(int pin_number);

    @Query("SELECT p FROM Pin p WHERE p.board = ?1 AND p.pin_number = ?2")
    public Pin findByBoard_PinNumber(String board, int pin_number);
}

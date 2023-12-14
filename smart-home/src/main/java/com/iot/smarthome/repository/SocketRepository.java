package com.iot.smarthome.repository;

import com.iot.smarthome.entity.Socket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocketRepository extends JpaRepository<Socket, String> {
}

package com.iot.smarthome.controller;

import com.iot.smarthome.dto.ConsumptionRequestDTO;
import com.iot.smarthome.entity.Pin;
import com.iot.smarthome.service.PinService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/pins")
public class PinController {

    private final PinService pinService;

    @Autowired
    public PinController(PinService pinService) {
        this.pinService = pinService;
    }

//    @GetMapping
//    public List<Pin> index(@RequestParam Optional<String> board, @RequestParam Optional<String> type, @RequestParam Optional<Integer> pin_number){
//        if(pin_number.isPresent()) return pinService.findByPinNumber(pin_number.get());
//        if(type.isPresent()) return pinService.findByType(type.get());
//        if(board.isPresent()) return pinService.findByBoard(board.get());
//        return pinService.findAll();
//    }
//
//
//    @GetMapping("/{id}")
//    public Pin index(@PathVariable String id){
//        return pinService.findById(id);
//    }
//
//    @DeleteMapping("/{id}")
//    public void delete(@PathVariable String id){
//        pinService.deleteById(id);
//    }

    @PatchMapping("/{id}/consumption")
    @CrossOrigin
    public void update_consumption(@PathVariable String id, @RequestBody ConsumptionRequestDTO consumption_body){
        Pin pin = pinService.findById(id);
        Double total = pin.getConsumption();

        if(consumption_body.getDelta() != null)
            total += consumption_body.getConsumption()/consumption_body.getDelta();
        else
            total += consumption_body.getConsumption();

        pin.setConsumption(total);
        pinService.save(pin);
    }
}

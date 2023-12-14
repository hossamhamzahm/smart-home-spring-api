package com.iot.smarthome.seed;

import com.iot.smarthome.entity.Pin;
import com.iot.smarthome.repository.PinRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;


//@Component
public class PinSeeder implements CommandLineRunner {
    private PinRepository pinRepository;

    public PinSeeder() {
    }

    @Autowired
    public PinSeeder(PinRepository pinRepository) {
        this.pinRepository = pinRepository;
    }

    @Override
	public void run(String... args) throws Exception {
		seedPins();
	}

    private void seedPins(){
        String board = "pi";
        ArrayList<Pin> pins = new ArrayList<Pin>();

        for(int pin_num = 0; pin_num < 32; pin_num++){
            Pin pin = new Pin(board+pin_num, "control", pin_num, 0.0, false, board);
            pins.add(pin);
        }

        pinRepository.saveAll(pins);
    }
}

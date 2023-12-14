package com.iot.smarthome.dto;

public class ConsumptionRequestDTO {
        Double consumption;
        Double delta;

        public Double getConsumption() {
            return consumption;
        }

        public void setConsumption(Double consumption) {
            this.consumption = consumption;
        }

        public Double getDelta() {
            return delta;
        }

        public void setDelta(Double delta) {
            this.delta = delta;
        }

        public ConsumptionRequestDTO() {
        }


        public ConsumptionRequestDTO(Double consumption, Double delta) {
            this.consumption = consumption;
            this.delta = delta;
        }
    }
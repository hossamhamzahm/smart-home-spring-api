# [Smart Home](https://hossamhamzahm.github.io/Smart-Home-React/)

[Smart Home](https://hossamhamzahm.github.io/Smart-Home-React/) is a full-stack web app that gives full control to all home lights, outlets, and appliances from any device connected to the internet.

The home is controlled through a Raspberry Pi microcontroller. The Raspberry pi sends requests to the web app to update the status of the sensors (temperature, light, people counters, etc...) and get requests from the app to update the state of lights, devices, and outlets (by controlling Raspberry Pi pins).
<br>

<br>

> [React Frontend Repo](https://github.com/hossamhamzahm/Smart-Home-React)


## Smart Home Features
- Display Home temperature from temperature sensor
- Fetch city weather from real time API
- Count people inside each room and turn off lights automatically if there is no people inside
- Control each room's light, outlets and devices from any device that has internet access
- Control all doors
- Control garage's gate
- Monitor the parking slot availability 
- Irrigate all home plants automatically and show if plants are moisture or not.
- Calculate power consumption (under construction)
- Image processing to turn off the tv automatically if the user fall asleep

<br>

**Technologies used in this project**

- Raspberry Pi:
  - Python
  - Raspy-os (linux distribution from Raspberry Pi)
  - SSH (secure shell was used to control the Raspberry Pi without connecting it to a monitor

- Front-end:
  - HTML
  - CSS
  - Bootstrap
  - React
  
- Back-end:
  - Java
  - Spring Boot
  - PostgresSQL
  - AWS EC2
  - CircleCI


- Hardware:
  - Raspberry Pi 3 B+
  - IR sensor (x2)
  - Servo motor (x2)
  - Water pump
  - Soil moisture Sensor
  - Relay
  - Buzzer
  - Push button
  - Breadboard
  - Temperature sensor

<br>

### Hardware Connection

![image info](https://raw.githubusercontent.com/hossamhamzahm/smart_home/main/Smart%20home%20frtzing%20diagram.png)

<br>

### To be done next
- Implement users model
- Add authentication and authorization
- Refactor python code
- Implement image processing feature
- Implement power consumption feature

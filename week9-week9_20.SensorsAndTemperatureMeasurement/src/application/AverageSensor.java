
package application;

import java.util.ArrayList;
import java.util.List;

public class AverageSensor implements Sensor {

    private List<Sensor> sensors;
    private List<Integer> readings;

    public AverageSensor() {
        this.sensors = new ArrayList<>();
        this.readings = new ArrayList<>();
    }

    public void addSensor(Sensor additional){
        sensors.add(additional);
    }

    public List<Integer> readings(){
        return this.readings;
    }

    @Override
    public boolean isOn() {
        for (Sensor sensor : sensors){
            if (!sensor.isOn()){
                return false;
            }
        }
        return true;
    }

    @Override
    public void on() {
        for (Sensor sensor : sensors){
            sensor.on();
        }
    }

    @Override
    public void off() {
        for (Sensor sensor : sensors){
            sensor.off();
        }
    }

    @Override
    public int measure() {
        if ( !this.isOn() || sensors.isEmpty() ){
            throw new IllegalStateException("Average sensor is off");
        }
        int reading = 0;
        for (Sensor sensor : sensors){
            reading += sensor.measure();
        }
        reading = reading / this.sensors.size();
        readings.add(reading);

        return reading;
    }
}

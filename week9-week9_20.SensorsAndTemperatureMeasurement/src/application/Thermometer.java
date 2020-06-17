
package application;

import java.util.Random;

public class Thermometer implements Sensor {

    private boolean power;
    private Random random;

    public Thermometer() {
        this.power = false;
        this.random = new Random();
    }

    @Override
    public boolean isOn() {
        return power;
    }

    @Override
    public void on() {
        this.power = true;
    }

    @Override
    public void off() {
        this.power = false;
    }

    @Override
    public int measure() {
        if (power){
            return random.nextInt(61) - 30;
        }
        throw new IllegalStateException();
    }
}

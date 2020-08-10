
package farmsimulator;

import javax.print.attribute.standard.MediaSize;
import java.util.Random;

public class Cow implements Milkable, Alive {

    private final int UDDER_MIN = 15;
    private final int UDDER_MAX = 40;
    private final String cowName;
    private final double udderCapacity;
    private double milkAmount;

    private static final String[] NAMES = new String[]{
        "Anu", "Arpa", "Essi", "Heluna", "Hely",
        "Hento", "Hilke", "Hilsu", "Hymy", "Ihq", "Ilme", "Ilo",
        "Jaana", "Jami", "Jatta", "Laku", "Liekki",
        "Mainikki", "Mella", "Mimmi", "Naatti",
        "Nina", "Nyytti", "Papu", "Pullukka", "Pulu",
        "Rima", "Soma", "Sylkki", "Valpu", "Virpi"};

    /*create cow with random name*/
    public Cow() {
        this(NAMES[ new Random().nextInt(NAMES.length)] );
    }

    /*creates a new cow with its given name*/
    public Cow(String name) {
        this.cowName = name;
        this.udderCapacity = 15 + new Random().nextInt(26);
        this.milkAmount = 0;
    }

    //returns cow's name
    public String getName() {
        return this.cowName;
    }

    //Udder capacity is a random value between 15 and 40
    public double getCapacity() {
        return this.udderCapacity;
    }

    //returns the amount on milk available in the cow's udders
    public double getAmount() {
        return this.milkAmount;
    }

    @Override
    public String toString() {
        return this.cowName + " " + Math.ceil(this.milkAmount) + "/" + Math.ceil(this.udderCapacity);
    }

    @Override
    public double milk() {
        double milked = milkAmount;
        milkAmount = 0;
        return milked;
    }

    @Override
    public void liveHour() {
        this.milkAmount += 0.7 + new Random().nextDouble() * 1.3;
        if (this.milkAmount > this.udderCapacity){
            milkAmount = udderCapacity;
        }
    }
}


package farmsimulator;

public class BulkTank {

    private double capacity;
    private double volume;

    //this creates tank with default capacity
    public BulkTank() {
        this(2000);
    }

    //creates tank with custom capacity
    public BulkTank(double capacity) {
        this.capacity = capacity;
    }

    //returns tank capacity
    public double getCapacity() {
        return capacity;
    }

    //retunrns milk in the tank
    public double getVolume() {
        return volume;
    }

    //returns empty space on tank
    public double howMuchFreeSpace() {
        return capacity-volume;
    }

    /*adds to the tank only as much milk as it fits; the additional 
     milk will not be added, and you don't have to worry about a 
     situation where the milk spills over*/
    public void addToTank(double amount) {
        if (volume + amount > capacity){
            volume = capacity;
        } else {
            volume+=amount;
        }
    }

    /*takes the required amount from the tank, or as much as there is left*/
    public double getFromTank(double amount) {
        if (volume < amount) {
            double volTaken = volume;
            volume = 0;
            return volTaken;
        }
        volume -= amount;
        return amount;
    }

    @Override
    public String toString() {
        return Math.ceil(getVolume()) + "/" + Math.ceil(getCapacity());
    }
}

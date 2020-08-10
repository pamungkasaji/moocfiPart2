
package farmsimulator;

import java.util.ArrayList;
import java.util.List;

public class Farm implements Alive {

    private final String owner;
    private final Barn barn;
    private final List<Cow> cowsInBarn;

    public Farm(String ownerName, Barn ownerBarn) {
        this.owner = ownerName;
        this.barn = ownerBarn;
        this.cowsInBarn = new ArrayList<Cow>();
    }

    //returns owner name
    public String getOwner() {
        return this.owner;
    }

    @Override
    public void liveHour() {
        for (Cow cow : cowsInBarn){
            cow.liveHour();
        }
    }

    //to milk cows
    public void manageCows() {
        barn.takeCareOf(cowsInBarn);
    }

    //adds cow to the list
    public void addCow(Cow cow) {
        cowsInBarn.add(cow);
    }

    //intall milking robot
    public void installMilkingRobot(MilkingRobot robot) {
        barn.installMilkingRobot(robot);
    }

    @Override
    public String toString() {
        String title = "Farm owner: " + this.owner + "\n"
                + "Barn bulk tank: " + this.barn.toString() + "\n"
                + "Animals:" + "\n";
        for (Cow c : cowsInBarn) {
            title += "        " + c.toString() + "\n";
        }
        return title;
    }
}

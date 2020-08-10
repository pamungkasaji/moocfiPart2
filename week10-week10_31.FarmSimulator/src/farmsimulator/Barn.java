
package farmsimulator;

import java.util.Collection;

public class Barn {

    private BulkTank bulkTankBarn;
    private MilkingRobot robot;

    public Barn(BulkTank tank) {
        this.bulkTankBarn = tank;
    }

    public BulkTank getBulkTank() {
        return this.bulkTankBarn;
    }

    public void installMilkingRobot(MilkingRobot milkingRobot) {
        robot = milkingRobot;
        robot.setBulkTank(bulkTankBarn);
    }

    public void takeCareOf(Cow cow) {
        try {
            robot.milk(cow);
        } catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    public void takeCareOf(Collection<Cow> cows) {
        try {
            for (Cow cow : cows){
                robot.milk(cow);
            }
        } catch (Exception e){
            throw new IllegalStateException("The MilkingRobot hasn't been installed");
        }
    }

    @Override
    public String toString() {
        return Math.ceil(this.bulkTankBarn.getVolume()) + "/"
                + Math.ceil(this.bulkTankBarn.getCapacity());
    }
}

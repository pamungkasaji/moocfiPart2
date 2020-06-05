import java.util.ArrayList;

public class Suitcase {

    private int maxWeight;
    private int thingCount;
    private ArrayList<Thing> things;

    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.things = new ArrayList<>();
    }

    public void addThing(Thing thing) {
        if (totalWeight() + thing.getWeight() <= maxWeight){
            things.add(thing);
            thingCount ++;
        }
    }

    public void printThings(){
        for (Thing thing : things){
            System.out.println(thing);
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Thing thing : things){
            totalWeight += thing.getWeight();
        }
        return totalWeight;
    }

    public Thing heaviestThing(){
        if (thingCount != 0){
            Thing heaviest = things.get(0);
            for(Thing thing : things){
                if (thing.getWeight() > heaviest.getWeight()){
                    heaviest = thing;
                }
            }
            return heaviest;
        } else {
            return null;
        }
    }

    public String toString() {
        return thingCount + convert() + " (" + totalWeight() + " kg)";
    }

    public String convert() {
        String word = "";
        if (thingCount > 1){
            word = " things";
        } else if (thingCount == 0){
            word = " empty";
        } else if (thingCount == 1){
            word = " thing";
        }
        return word;
    }

    public int getWeight() {
        return totalWeight();
    }

    public ArrayList<Thing> getThings() {
        return things;
    }
}

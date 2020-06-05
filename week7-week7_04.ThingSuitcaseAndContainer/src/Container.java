import java.util.ArrayList;

public class Container {

    private int maxWeight;
    private int suitcaseCount;
    private ArrayList<Suitcase> suitcases = new ArrayList<>();

    public Container(int maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void addSuitcase(Suitcase suitcase){
        if (totalWeight() + suitcase.getWeight() <= maxWeight){
            suitcases.add(suitcase);
            suitcaseCount++;
        }
    }

    public int totalWeight(){
        int totalWeight = 0;
        for (Suitcase suitcase : suitcases){
            totalWeight += suitcase.getWeight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return suitcaseCount + convert() + " (" + totalWeight() + " kg)";
    }

    public void printThings(){
        for (Suitcase suitcase: suitcases){
            for (Thing thing: suitcase.getThings()){
                System.out.println(thing);
            }
        }
    }

    public String convert() {
        String word = "";
        if (suitcaseCount > 1){
            word = " suitcases ";
        } else if (suitcaseCount == 0){
            word = " empty";
        } else if (suitcaseCount == 1){
            word = " suitcase ";
        }
        return word;
    }
}

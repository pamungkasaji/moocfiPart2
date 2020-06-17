
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author
 */
public class Box implements ToBeStored {

    private double maxWeight;
    private ArrayList<ToBeStored> things;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        things = new ArrayList<>();
    }

    public void add(ToBeStored thing){
        if (weight() + thing.weight() <= maxWeight){
            things.add(thing);
        }
    }

    @Override
    public double weight() {
        double weight = 0;
        for (ToBeStored thing : things){
            weight += thing.weight();
        }
        return weight;
    }

    //test printall
    public void printAll(){
        for (ToBeStored thing : things){
            System.out.println(thing);
        }
    }

    @Override
    public String toString() {
        return "Box: " + things.size() + " things, total weight " + weight() + " kg" ;
    }
}

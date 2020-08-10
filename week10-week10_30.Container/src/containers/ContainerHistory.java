
package containers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContainerHistory {
    private ArrayList<Double> history;

    public ContainerHistory() {
        this.history = new ArrayList<Double>();
    }

    public void add(double situation){
        history.add(situation);
    }

    public void reset(){
        history.clear();
    }

    public String toString(){
        return history.toString();
    }

    public double maxValue(){
        if (history.isEmpty()){
            return 0;
        }
        double max = history.get(0);
        for (double h : history){
            if (h > max){
                max = h;
            }
        }
        return max;
    }

    public double minValue(){
        if (history.isEmpty()){
            return 0;
        }
        double min = history.get(0);
        for (double h : history){
            if (h < min){
                min = h;
            }
        }
        return min;
    }

    public double average(){
        if (history.isEmpty()){
            return 0;
        }
        double sum = 0;
        for (double h : history){
            sum += h;
        }
        return sum/history.size();
    }

    public double greatestFluctuation(){
        if (history.isEmpty() || history.size() == 1){
            return 0;
        }
        double greatest = Math.abs(history.get(0) - history.get(1));
        for (int i=0; i<history.size()-1; i++){
            double compared = Math.abs(history.get(i) - history.get(i+1));
            if (compared > greatest){
                greatest = compared;
            }
        }
        return greatest;
    }

    public double variance(){
        if (history.isEmpty() || history.size() == 1){
            return 0;
        }
        double variance = 0;
        for (double h : history){
            variance += Math.pow(h - average() , 2);
        }
        return variance / (history.size() - 1);
    }
}

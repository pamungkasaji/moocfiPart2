import java.util.HashMap;

public class PromissoryNote {

    private HashMap<String, Double> map;

    public PromissoryNote() {
        this.map = new HashMap<>();
    }

    public void setLoan(String toWhom, double value){
        map.put(toWhom, value);
    }

    public double howMuchIsTheDebt(String whose){
        if(map.containsKey(whose)){
            return map.get(whose);
        }
        return 0;
    }
}

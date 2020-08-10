
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RingingCentre {

    private Map<Bird, List<String>> ringings = new HashMap<>();

    public void observe(Bird bird, String place){
        if (!ringings.containsKey(bird)){
            ringings.put(bird, new ArrayList<>());
        }
        ringings.get(bird).add(place);
    }

    public void observations(Bird bird){
        System.out.print(bird + " observations: ");
        if (!ringings.containsKey(bird)){
            System.out.println("0");
        } else {
            System.out.println(ringings.get(bird).size());
            for (String place: ringings.get(bird)){
                System.out.println(place);
            }
        }
    }
}

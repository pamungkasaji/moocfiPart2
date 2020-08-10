
package movable;

import java.util.ArrayList;
import java.util.List;

public class Group implements Movable {

    private List<Movable> movables = new ArrayList<>();

    public void addToGroup(Movable movable){
        movables.add(movable);
    }

    @Override
    public void move(int dx, int dy) {
        for (Movable movable: movables){
            movable.move(dx, dy);
        }
    }

    @Override
    public String toString() {
        String group = "";
        for (Movable movable: movables){
            group += movable + "\n";
        }
        return group;
    }
}

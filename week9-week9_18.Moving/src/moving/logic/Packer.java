
package moving.logic;

import java.util.ArrayList;
import java.util.List;
import moving.domain.Box;
import moving.domain.Thing;

public class Packer {

    private int boxesVolume;
    private List<Box> boxes;

    public Packer(int boxesVolume) {
        this.boxesVolume = boxesVolume;
        this.boxes = new ArrayList<>();
    }

    public List<Box> packThings(List<Thing> things) {
        int i = 0;
        for (Thing thing : things){
            boxes.add( new Box(this.boxesVolume) );
            boxes.get(i).addThing(thing);
            i++;
        }
        return boxes;
    }
}

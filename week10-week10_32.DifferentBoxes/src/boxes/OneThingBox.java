
package boxes;

public class OneThingBox extends Box {

    private Thing oneThing;

    public OneThingBox() {
        this.oneThing = null;
    }

    @Override
    public void add(Thing thing) {
        if (oneThing == null){
            oneThing = thing;
        }
    }

    @Override
    public boolean isInTheBox(Thing thing) {
        return oneThing != null && oneThing.equals(thing);
    }
}

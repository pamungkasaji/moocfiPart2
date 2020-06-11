import java.util.Objects;

public class Plane {

    private String id;
    private int capacity;

    public Plane(String id, int capacity) {
        this.id = id;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        return id + " (" + capacity + "ppl)";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return capacity == plane.capacity &&
                Objects.equals(id, plane.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, capacity);
    }
}

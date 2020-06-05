public class Flight {

    private Plane plane;
    private String departure;
    private String destination;

    public Flight(Plane plane, String departure, String destination) {
        this.plane = plane;
        this.departure = departure;
        this.destination = destination;
    }

    public Plane getPlane() {
        return plane;
    }

    @Override
    public String toString() {
        return plane.getId() + " (" + plane.getCapacity() + "ppl)" +
                " (" + departure + '-' + destination + ')';
    }
}

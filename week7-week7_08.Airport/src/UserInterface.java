import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner reader;
    private ArrayList<Plane> planes;
    private ArrayList<Flight> flights;

    public UserInterface(Scanner reader) {
        this.reader = reader;
        this.planes = new ArrayList<>();
        this.flights = new ArrayList<>();
    }

    public void start() {

        System.out.println("Airport panel\n"
                + "--------------------\n");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Add airplane\n"
                    + "[2] Add flight\n"
                    + "[x] Exit\n"
                    + "> ");

            String operation = reader.next();

            if ("1".equals(operation)) {
                addPlane();
            } else if ("2".equals(operation)) {
                addFlight();
            } else if ("x".equals(operation)) {
                System.out.println();
                service();
                break;
            }
        }
    }

    private void addPlane() {
        System.out.println("Give plane ID: ");
        String id = reader.next();
        System.out.println("Give plane capacity: ");
        int capacity = Integer.parseInt(reader.next());

        Plane plane = new Plane(id, capacity);
        planes.add(plane);
    }

    private void addFlight() {
        System.out.println("Give plane ID: ");
        String idPlane = reader.next();

        Plane plane = findPlane(idPlane);
        if (plane == null) {
            System.out.println("Plane is not listed");
        } else {
            System.out.println("Give departure airport code: ");
            String departure = reader.next();
            System.out.println("Give destination airport code: ");
            String destination = reader.next();

            Flight flight = new Flight(plane, departure, destination);
            flights.add(flight);
        }
    }

    private Plane findPlane(String idPlane) {
        for (Plane plane : planes) {
            if (plane.getId().equals(idPlane)) {
                return plane;
            }
        }
        return null;
    }

    private void service() {

        System.out.println("Flight service\n"
                + "------------\n"
                + "");

        while (true) {
            System.out.println("Choose operation:\n"
                    + "[1] Print planes\n"
                    + "[2] Print flights\n"
                    + "[3] Print plane info\n"
                    + "[x] Quit\n"
                    + "> ");

            String operation = reader.next();

            if ("1".equals(operation)) {
                printPlane();
            } else if ("2".equals(operation)) {
                printFlight();
            } else if ("3".equals(operation)) {
                planeInfo();
            } else if ("x".equals(operation)) {
                System.out.println();
                break;
            }
        }
    }

    private void printPlane() {
        for (Plane plane : planes) {
            System.out.println(plane);
        }
    }

    private void printFlight() {
        for (Flight flight : flights) {
            System.out.println(flight);
        }
    }

    private void planeInfo() {
        System.out.println("Give plane id: ");
        String idPlane = reader.next();

        System.out.println(findPlane(idPlane));
    }
}

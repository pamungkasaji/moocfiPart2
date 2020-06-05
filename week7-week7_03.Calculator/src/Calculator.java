
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class Calculator {

    private final Reader reader;
    private int count;

    public Calculator() {
        this.reader = new Reader();
    }

    public void start() {
        while (true) {
            System.out.print("command: ");
            String command = reader.readString();
            if (command.equals("end")) {
                break;
            }

            if (command.equals("sum")) {
                sum();
            } else if (command.equals("difference")) {
                difference();
            } else if (command.equals("product")) {
                product();
            }
        }

        statistics();
    }

    private void sum() {
        int[] values = input();
        System.out.println("Sum of the values " + (values[0]+values[1]));
    }

    private void difference() {
        int[] values = input();
        System.out.println("difference of the values " + (values[0]-values[1]));
    }

    private void product() {
        int[] values = input();
        System.out.println("product of the values " + (values[0]*values[1]));
    }

    private void statistics() {
        System.out.println("Calculations done: " + count);
    }

    private int[] input () {
        count++;
        int[] values = new int[2];
        System.out.print("value 1: ");
        values[0] = reader.readInteger();
        System.out.print("value 2: ");
        values[1] = reader.readInteger();
        return values;
    }
}

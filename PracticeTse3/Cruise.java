package PracticeTse3;

import java.io.*;
public class Cruise implements Serializable{
    private int numPassengers = 1;
    private transient String schedule = "NONE";
    { numPassengers = 2; }
    public Cruise() {
        this.numPassengers = 3;
        this.schedule = "Tropical Island";
    }
    public static void main(String... p) throws Exception {
        final String f = "ship.txt";
        try (var o = new ObjectOutputStream(
                new FileOutputStream(f))) {
            Cruise c = new Cruise();
            c.numPassengers = 4;
            c.schedule = "Casino";
            o.writeObject(c);
        }
        try (var i = new ObjectInputStream(
                new FileInputStream(f))) {
            Cruise c = (Cruise) i.readObject();
            System.out.print(c.numPassengers + "," +
                    c.schedule);
        } } }
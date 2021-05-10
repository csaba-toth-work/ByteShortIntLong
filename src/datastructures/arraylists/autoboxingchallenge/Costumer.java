package datastructures.arraylists.autoboxingchallenge;

import java.util.ArrayList;

public class Costumer {
    private ArrayList<Double> transaction;
    private String name;

    public Costumer(String name) {
        this.transaction = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Double> getTransaction() {
        return transaction;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Costumer{" +
                "transaction=" + transaction +
                ", name='" + name + '\'' +
                '}';
    }
}

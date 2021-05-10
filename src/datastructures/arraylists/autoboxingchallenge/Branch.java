package datastructures.arraylists.autoboxingchallenge;

import java.util.ArrayList;

public class Branch {
    private ArrayList<Costumer> costumers;
    private String name;

    public Branch(String name) {
        this.costumers = new ArrayList<>();
        this.name = name;
    }

    public ArrayList<Costumer> getCostumers() {
        return costumers;
    }

    public String getName() {
        return name;
    }

    public void addNewCostumer(Costumer costumer) {
        for (int i = 0; i < this.costumers.size(); i++) {
            if (costumers.get(i).getName().equalsIgnoreCase(costumer.getName())) {
                System.out.println("This costumer name is already exists");
                return;
            }
        }
        this.costumers.add(costumer);
    }

    public void addTransaction(String nameOfCostumer, double transactionAmount) {
        for (int i = 0; i < this.costumers.size(); i++) {
            if (this.costumers.get(i).getName().equals(nameOfCostumer)) {
                this.costumers.get(i).getTransaction().add(transactionAmount);
            }
        }
    }

    public void printInfo() {
        for (int i = 0; i < this.costumers.size(); i++) {
            System.out.println(i + 1 + ". name of costumer: " + this.costumers.get(i).getName() + ", list of transactions: \n" +
                    this.costumers.get(i).getTransaction());
        }
    }

    @Override
    public String toString() {
        return "Branch{" +
                "costumers=" + costumers +
                ", name='" + name + '\'' +
                '}';
    }
}

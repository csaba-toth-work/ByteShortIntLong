package DataStructures.Arraylists.AutoBoxingChallenge;

import java.util.ArrayList;

public class Bank {
    private ArrayList<Branch> branches;

    public Bank() {
        this.branches = new ArrayList<>();
    }

    public ArrayList<Branch> getBranches() {
        return branches;
    }

    public void addNewBranch(Branch newBranch) {
        this.branches.add(newBranch);
    }

    public void addNewCostumer(String nameOfBranch, Costumer costumer) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equalsIgnoreCase(nameOfBranch)) {
                this.branches.get(i).addNewCostumer(costumer);
                return;
            }
        }
    }

    public void addNewTransaction(String branch, String nameOfCostumer, double transaction) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (branches.get(i).getName().equals(branch)) {

                for (int j = 0; j < branches.get(i).getCostumers().size(); j++) {
                    if (branches.get(i).getCostumers().get(j).getName().equalsIgnoreCase(nameOfCostumer)) {
                        branches.get(i).addTransaction(nameOfCostumer, transaction);
                        return;
                    }
                }
            }
        }
    }

    public void printInfo(String branchName) {
        for (int i = 0; i < this.branches.size(); i++) {
            if (this.branches.get(i).getName().equalsIgnoreCase(branchName)) {
                this.branches.get(i).printInfo();
                return;
            }
        }
    }

    @Override
    public String toString() {
        return "Bank{" +
                "branches=" + branches +
                '}';
    }
}

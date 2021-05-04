package DataStructures.Arraylists.AutoBoxingChallenge;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank();
        String branchName = "easternBranch";
        Branch easternBranch = new Branch(branchName);
        bank.addNewBranch(easternBranch);
        Costumer costumer1 = new Costumer("Peter");
        Costumer costumer2 = new Costumer("Doe");
        bank.addNewCostumer(branchName, costumer1);
        bank.addNewCostumer(branchName, costumer2);

        bank.addNewTransaction(branchName, "Peter", 12.4);
        bank.addNewTransaction(branchName, "Peter", 60.4);
        bank.addNewTransaction(branchName, "Doe", 15.4);
        bank.printInfo(branchName);


    }
}

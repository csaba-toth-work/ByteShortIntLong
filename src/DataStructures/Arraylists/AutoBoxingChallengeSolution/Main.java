package DataStructures.Arraylists.AutoBoxingChallengeSolution;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("National Australia Bank");

        bank.addBranch("Adelaide");

        bank.addCustomer("Adelaide", "Tim", 50.05);
        bank.addCustomer("Adelaide", "Mike", 15.05);
        bank.addCustomer("Adelaide", "Percy", 220.05);

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.24);

        bank.addCustomerTransaction("Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction("Adelaide", "Tim", 12.75);
        bank.addCustomerTransaction("Adelaide", "Tim", 4123.22);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        if (!bank.addCustomer("Melbourne", "Brian", 5.45)) {
            System.out.println("Error Melbourne does not exist");
        }

        if (!bank.addBranch("Adelaide")) {
            System.out.println("Adelaide branch already exists");
        }

        if (!bank.addCustomerTransaction("Adelaide", "Fergus", 45.21)) {
            System.out.println("Customer does not exist at branch");
        }

        if (!bank.addCustomer("Adelaide", "Tim", 12.21)) {
            System.out.println("Customer Tim already exists");
        }
    }
}

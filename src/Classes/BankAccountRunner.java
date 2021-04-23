package Classes;

public class BankAccountRunner {

    public static void main(String[] args) {

        BankAccount BobsAccount = new BankAccount();

        BobsAccount.depositFunds(500);
        System.out.println(BobsAccount.getBalance());

        BobsAccount.withdrawFunds(250);
        System.out.println(BobsAccount.getBalance());

        BobsAccount.withdrawFunds(400);
        System.out.println(BobsAccount.getBalance());
        BobsAccount.setCustomerName("Bob");
        BobsAccount.setAccountNumber("961230612");
        BobsAccount.setEmail("bob@java.com");

        BankAccount JohnsAccount = new BankAccount("1233234", 15, "John", "john@java.com", "4355412");

        BankAccount timsAccount = new BankAccount("Tim", "tim@java.com", "12345");
        System.out.println(timsAccount.getAccountNumber() + " name " + timsAccount.getCustomerName());


        VipCustomer vipCustomer = new VipCustomer();
        System.out.println(vipCustomer.getName());

        VipCustomer vipCustomer2 = new VipCustomer("Bob", 2500);
        System.out.println(vipCustomer2.getName());

        VipCustomer vipCustomer3 = new VipCustomer("Tim", 5000, "tim@email.com");
        System.out.println(vipCustomer3.getName());
        System.out.println(vipCustomer3.getEmail());
    }
}

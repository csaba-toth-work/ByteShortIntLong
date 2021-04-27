package Classes.Encapsulation;

public class Main {

    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Csaba";
//        player.weapon = "sword";
//        player.health = 20;
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Csaba", 200, "Sword");
        System.out.println("Initial health is " + player.getHealth());
    }
}

package datastructures.arraylists.arraylistchallenge;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public void showMenu() {
        boolean flag = true;
        int choice = 0;
        while (flag) {
            System.out.println("Press the number according which option you would like to use");
            printInstructions();
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    store();
                    break;
                case 2:
                    modify();
                    break;
                case 3:
                    remove();
                    break;
                case 4:
                    query();
                    break;
                case 5:
                    showAllContacts();
                    break;
                default:
                    flag = false;
                    break;
            }
        }

    }

    public void store() {
        System.out.println("Type the name of the contact");
        String name = scanner.nextLine();
        System.out.println("Type the number of the contact");
        int number = scanner.nextInt();
        scanner.nextLine();
        if (isContactExist(name)) {
            System.out.println("This contact already exists");
        } else {
            contacts.add(new Contact(name, number));
            System.out.println("Contact has been added");
        }
    }

    public void modify() {
        System.out.println("Type in whom you want to modify? ");
        String name = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                System.out.println("Type in the new name");
                String newName = scanner.nextLine();
                if (!isContactExist(newName)) {
                    contacts.get(i).setName(newName);
                } else {
                    System.out.println("The chosen contact name is taken already.");
                }
            } else {
                System.out.println("Contact doesn't exist");
            }


        }

    }

    public void remove() {
        System.out.println("Type in the name of the contact you want to remove");
        String name = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                contacts.remove(i);
                System.out.println("Contact has been removed");
                return;
            }
            System.out.println("Contact doesnt exist");
        }
    }

    public void query() {
        System.out.println("Type the name of the contact you want to search");
        String name = scanner.nextLine();
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                System.out.println("Contact has been found");
                System.out.println(contacts.get(i));
                return;
            }
        }
        System.out.println("Contact doesnt exist");
    }

    public void showAllContacts() {
        System.out.println(contacts);
    }

    public void printInstructions() {
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To store a contact.");
        System.out.println("\t 2 - To modify a contact.");
        System.out.println("\t 3 - To remove a contact.");
        System.out.println("\t 4 - To query a contact.");
        System.out.println("\t 5 - To show all contacts.");
        System.out.println("\t");
    }

    public boolean isContactExist(String name) {
        for (int i = 0; i < contacts.size(); i++) {
            if (contacts.get(i).getName().equals(name)) {
                return true;
            }
        }
        return false;
    }
}

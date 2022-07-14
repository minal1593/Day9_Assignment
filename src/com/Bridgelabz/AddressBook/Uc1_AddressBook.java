package com.BridgeLabz.AddressBook;


import java.util.*;
import java.io.*;

class Uc1_AddressBook {

    public ArrayList<Person> data = new ArrayList<Person>();


    public String readString(String displayMessage) {

        Scanner sc = new Scanner(System.in);
        System.out.print(displayMessage);
        String input = sc.nextLine();

        return input;
    }

    public long readLong(String displayMessage) {

        Scanner sc = new Scanner(System.in);
        System.out.print(displayMessage);
        long input = sc.nextLong();

        return input;
    }
    public int indexOfPerson() {

        System.out.println();
        String name = readString("[+]Enter Person's name: ");
        long phoneNumber = readLong("[+]Enter his/her phone number: ");

        int index = 0;
        for (Person p : this.data) {
            if (p.getName().equals(name) && p.getPhoneNumber() == phoneNumber) {
                return index;
            }
            ++index;
        }
        return -1;
    }



    /* Address Book Operations */
    public void addPerson() {
        for (int i = 0; i <= 2; i++) {
            System.out.println();
            String name = readString("[+]Enter Person's name: ");
            String lastname = readString("[+]Enter Person's lastname: ");
            String email = readString("[+]Enter Person's email: ");
            String city = readString("[+]Enter where he/she lives first enter City: ");
            String state = readString("[+]Now, enter State: ");
            String address = readString("[+]Now, enter full address: ");
            String zipCode = readString("[+]At last enter, area's Zip Code: ");
            long phoneNumber = readLong("[+]Enter his/her phone number: ");
            Person newEntry = new Person(name, lastname, email, city, state, address, zipCode, phoneNumber);

            this.data.add(newEntry);
            System.out.println("\n[*]\t" + name + " added successfully to address book.");
        }
    }
    public void showPerson() {

        int index = this.indexOfPerson();

        if (index != -1) {

            this.data.get(index).showPersonsDetails();
        } else {

            System.out.println("\n[*]\tNo one with these details found!");
        }
    }
    public static void main(String[] args) {

        Uc1_AddressBook obj1 = new Uc1_AddressBook();

        obj1.addPerson();
        obj1.showPerson();


    }
}

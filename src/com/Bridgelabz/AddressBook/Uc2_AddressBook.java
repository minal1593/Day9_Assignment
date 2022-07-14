package com.Bridgelabz.AddressBook;

import java.util.ArrayList;
import java.util.Scanner;

public class Uc2_AddressBook extends Uc1_AddressBook{


    public void editPerson() {

        int index = this.indexOfPerson();

        if (index != -1) {
            String options = "[+]\tWhat you want to change?\n\t1. City\n\t2. State\n\t3. Address\n\t4. Zip Code\n\t5. PhoneNumber\n: ";
            int choice = (int) readLong(options);

            switch (choice) {
                case 1:
                    this.data.get(index).setCity(readString("[+]Enter new City: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 2:
                    this.data.get(index).setState(readString("[+]Enter new State: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 3:
                    this.data.get(index).setAddress(readString("[+]Enter new Address: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 4:
                    this.data.get(index).setZipCode(readString("[+]Enter new Zip Code: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                case 5:
                    this.data.get(index).setPhoneNumber(readLong("[+]Enter new Phone number: "));
                    System.out.println("[*]\tEntry Modified");
                    break;
                default:
                    System.out.println("\n[*]\tBad Input!");
            }
        } else {

            System.out.println("\n[*]\tNo such person found!");
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

        Uc2_AddressBook obj1 = new Uc2_AddressBook();

        obj1.addPerson();
        System.out.println("Enter The name and phone number of a person you want to edit");
        obj1.editPerson();
        System.out.println("Enter The name and phone number of a person you have edited");
        obj1.showPerson();

    }

}


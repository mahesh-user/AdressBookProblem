package com.bridgelabz;

import java.util.Scanner;

public class ContactsManager {

    Scanner sc;

    public void add(){
        sc= new Scanner(System.in);

        System.out.println("Enter the name");

        String name = sc.next();
        System.out.println("Enter the address");
        String address = sc.next();
        System.out.println("Enter the city");
        String city = sc.next();
        System.out.println("Enter the state");
        String state = sc.next();
        System.out.println("Enter the emailId");
        String email = sc.next();
        System.out.println("Enter the Phone number");
        long phoneNumber = sc.nextLong();
        System.out.println("Enter the zipcode");
        long zipCode = sc.nextLong();

        Contact contact = new Contact(name, address, city, state, email, phoneNumber, zipCode);
    }
}

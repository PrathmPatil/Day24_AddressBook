package com.addressbook;
import java.util.Scanner;

public class Main {
	
	    static ContactInfo contact;
	    public void uc1_CreatingContact() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the contact details");
	        System.out.println();
	        System.out.println("Enter the first name");
	        String f_name = sc.next();
	        System.out.println("Enter the last name");
	        String l_name = sc.next();
	        System.out.println("Enter the address");
	        String address  = sc.next();
	        System.out.println("Enter the city name");
	        String city  = sc.next();
	        System.out.println("Enter the state name");
	        String state = sc.next();
	        System.out.println("Enter the Zip code");
	        String zip = sc.next();
	        System.out.println("Enter the phone number");
	        String ph_no = sc.next();
	        System.out.println("Enter the email address");
	        String email = sc.next();
	       
	        contact = new ContactInfo(f_name,l_name,address,city,state,zip,ph_no,email);
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to day 9 address book program");
	        Main addresBook = new Main();
	        addresBook.uc1_CreatingContact();
	        System.out.println(contact);
	    }
	

}

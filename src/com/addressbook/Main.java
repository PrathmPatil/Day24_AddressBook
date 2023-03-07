package com.addressbook;
import java.util.Scanner;

public class Main extends Addressbook {
	static int option;
	
	
	    public static void menu() {
	    	 Main addressBook=new Main();
	    	 Scanner sc=new Scanner(System.in);
	        System.out.println("Menu: (Enter the respective number)\n1. Add contact 2. Edit contact 3.Delete 4.Display ");
	        option = sc.nextInt();
	        switch(option) {
	            case 1:
	                addressBook.uc1_CreatingContact();
	                addressBook.uc2_AddingContacts();
	                addressBook.menu();
	                break;
	            case 2:
	                System.out.println("Enter the first name ");
	                addressBook.findByName = sc.next();
	                addressBook.uc3_editContacts();
	                addressBook.menu();
	                break;
	            case 3:
	                System.out.println("Enter the first name ");
	                addressBook.findByName = sc.next();
	                addressBook.uc4_deleteContact();
	                addressBook.menu();
	                break;
	            case 4:
	            	 System.out.println("Enter the contact's first name to display");
	                 addressBook.findByName = sc.next();
	                 for(int i = 0; i < contacts.size(); i++) {
	                     if(contacts.get(i).getF_name().equalsIgnoreCase(addressBook.findByName)) {
	                         System.out.println(contacts.get(i));
	                         addressBook.menu();
	                     }
	                     else {
	                         System.out.println("Oops, can't found the name. Try again");
	                         addressBook.menu();
	                     }
	                 }
	                 break;
	            case 5:
	                System.exit(0);
	            default:
	                System.out.println("Invalid option please enter valid option");
	                addressBook.menu();
	                break;
	        }
	    }
	    public static void main(String[] args) {
	    	System.out.println("Welcome In Address Book: ");
	    	Main.menu();
	    }
	

}

package com.addressbook;
import java.util.Scanner;

public class Main extends Addressbook {
	static int option;
	
	
	    public static void menu() {
	    	 Main addressBook=new Main();
	    	 Scanner sc=new Scanner(System.in);
	        System.out.println("Menu: (Enter the respective number)\n1. Add contact 2. Edit contact 3.Delete 4.Display 5.Search by City or State 6.Exit ");
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
	            	System.out.println("1. Search by city 2. Search by state");
                int option2 = sc.nextInt();
                if(option2 == 1) {
                    System.out.println("Enter the city name to search");
                    String citySearch = sc.next();
                    addressBook.uc8_searchByCity(citySearch);
                }
                else if(option2 == 2) {
                    System.out.println("Enter the state name to search");
                    String stateSearch = sc.next();
                    addressBook.uc8_searchByState(stateSearch);
                }
                menu();
                break;
	            case 6:
	            	 System.out.println("1. count of city 2. Search of state");
	                 int option3 = sc.nextInt();
	                 if(option3 == 1) {
	                     System.out.println("Enter the city name");
	                     String citySearch = sc.next();
	                     addressBook.uc10_CountByCity(citySearch);
	                 }
	                 else if(option3 == 2) {
	                     System.out.println("Enter the state name");
	                     String stateSearch = sc.next();
	                     addressBook.uc10_countByState(stateSearch);
	                 }
	                 menu();
	                 break;
	            case 7:
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

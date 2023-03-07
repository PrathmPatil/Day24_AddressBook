package com.addressbook;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	
	static Main addressBook=new Main();
	Scanner sc=new Scanner(System.in);
	String findByName;
	static int option;
	    static ContactInfo contact;
	    int count = 1;
	    static ArrayList <ContactInfo> contacts = new ArrayList<ContactInfo>(); //using Arraylist as it is easier than using Array

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
	    
	    public void uc2_AddingContacts() {
	    	count++;
	    	contacts.add(contact);//in arraylist store the contact 
	    }

	    public void uc3_editContacts() {
	    	int index=-1;
	    	for(int i=0;i<contacts.size();i++)
	    	{
	    		if(contacts.get(i).getF_name().equalsIgnoreCase(findByName))
	    		{
	    			index=i;
	    			break;
	    		}
	    	}
	    	if(index==-1)
	    	{
	    		System.out.println("Oops! Your name are not in book");
	    	}
	    	if(index>=0) {
	    		   		
	             System.out.println("Enter respectively\n1.First name 2.Last name 3.Address" +
	                     " 4.City 5.State 6.Zip 7.Phone number 8.Email address");
	             int option2 = sc.nextInt();
	             switch (option2) {
	                 case 1:
	                     System.out.println("Enter the first name ");
	                     contacts.get(index).setF_name(sc.next());
	                     break;
	                 case 2:
	                     System.out.println("Enter the last name");
	                     contacts.get(index).setL_name(sc.next());
	                     break;
	                 case 3:
	                     System.out.println("Enter the address");
	                     contacts.get(index).setAddress(sc.next());
	                     break;
	                 case 4:
	                     System.out.println("Enter the city name");
	                     contacts.get(index).setCity(sc.next());
	                     break;
	                 case 5:
	                     System.out.println("Enter the state name ");
	                     contacts.get(index).setState(sc.next());
	                     break;
	                 case 6:
	                     System.out.println("Enter the zip code");
	                     contacts.get(index).setZip(sc.next());
	                     break;
	                 case 7:
	                     System.out.println("Enter the phone number ");
	                     contacts.get(index).setPh_no(sc.next());
	                     break;
	                 case 8:
	                     System.out.println("Enter the email address");
	                     contacts.get(index).setEmail(sc.next());
	                     break;
	                 default:
	                     System.out.println("Invalid option");
	             }
	         }
	         
	     }
	    public void uc4_deleteContact() {
	    	int index=-1;
	    	for(int i=0;i<contacts.size();i++)
	    	{
	    		if(contacts.get(i).getF_name().equalsIgnoreCase(findByName))
	    		{
	    			index=i;
	    			break;
	    		}
	    	}
	    	if(index>=0) {
	            contacts.remove(index);
	            System.out.println("Deleted successfully"+contacts.size()+" Contacts in Book");
	        }
	        else
	            System.out.println("Oops! can't find the name");
	    }
	    public void menu() {
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
	               findByName = sc.next();
	                addressBook.uc3_editContacts();
	                addressBook.menu();
	                break;
	            case 3:
	                System.out.println("Enter the first name ");
	                findByName = sc.next();
	                addressBook.uc4_deleteContact();
	                addressBook.menu();
	                break;
	            case 4:
	            	for(int i=0;i<contacts.size();i++) {
	            	System.out.println(contacts.get(i));
	            }
	            addressBook.menu();
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
	    	addressBook.menu();
	    }
	

}

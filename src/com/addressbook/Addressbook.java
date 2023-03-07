package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Addressbook {

	
	    Scanner sc=new Scanner(System.in);
	    String findByName;
	    static ContactInfo contact;
	    int count = 1;
	    static ArrayList <ContactInfo> contacts = new ArrayList<ContactInfo>(); //using Arraylist as it is easier than using Array
	    static List<ContactInfo>duplicateCheckedcontacts;
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
	       
	        contact = new ContactInfo(count,f_name,l_name,address,city,state,zip,ph_no,email);
	    }
	    
	    public void uc2_AddingContacts() {
	    	//this is for initial adding we have to make sure the list is not empty
	        if(contacts.isEmpty()) {
	            count++;
	            contacts.add(contact);
	        }
	        else {//used streams to collect the duplicates alone in a separate list
	            duplicateCheckedcontacts = contacts.stream().filter(x -> (x.getF_name()+x.getL_name()).equalsIgnoreCase(contact.getF_name()+contact.getL_name())).collect(Collectors.toList());
	            //if the duplicate list has items in the contacts list sys out that there duplicate
	            if(contacts.equals(duplicateCheckedcontacts)) {
	                System.out.println("Found a duplicate contact " + contact.getF_name()+" "+contact.getL_name() + " Already exists S.no " + contact.getCount());
	            }
	            //else ther is no duplicate it will get added
	             else {
	                count++;
	                contacts.add(contact);
	            }
	        }
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
	    	for(int i = 0; i < contacts.size(); i++) {
	            if(contacts.get(i).getF_name().equalsIgnoreCase(findByName)) {
	                contacts.remove(i);
	                System.out.println("Deleted successfully"+contacts.size());
	            }
	        }
	    }
}

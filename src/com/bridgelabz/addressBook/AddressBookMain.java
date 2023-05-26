package com.bridgelabz.addressBook;

public class AddressBookMain {
    public static void main(String[] args) {
        Contact contact = new Contact ("Sayali","Bafna","Shivajinagar","Pune","Maharashtra","411020","8600789894","ss@gmail.com");
        System.out.println("First Name: " + contact.getfName());
        System.out.println("Last Name: " + contact.getlName());
        System.out.println("Address: " + contact.getAddress());
        System.out.println("City: " + contact.getCity());
        System.out.println("State: " + contact.getState());
        System.out.println("Zip: " + contact.getZip());
        System.out.println("Phone Number: " + contact.getPhoneNum());
        System.out.println("Email: " + contact.getEmail());


    }

}

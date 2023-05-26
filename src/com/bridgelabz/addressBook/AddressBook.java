package com.bridgelabz.addressBook;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {
    ArrayList<Contact> contacts = new ArrayList();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void displayContacts() {
        for (Contact contact : contacts) {
            System.out.println(contact);
        }
    }

    public void editContact(String fName, String lName) {
        for (Contact contact : contacts) {
            if (contact.getfName().equalsIgnoreCase(fName) && contact.getlName().equalsIgnoreCase(lName)) {
                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter updated details for " + fName + " " + lName);
                System.out.print("Enter new address: ");
                String address = scanner.nextLine();
                System.out.print("Enter new city: ");
                String city = scanner.nextLine();
                System.out.print("Enter new state: ");
                String state = scanner.nextLine();
                System.out.print("Enter new zip: ");
                String zip = scanner.nextLine();
                System.out.print("Enter new phone number: ");
                String phoneNumber = scanner.nextLine();
                System.out.print("Enter new email: ");
                String email = scanner.nextLine();
                contact.setAddress(address);
                contact.setCity(city);
                contact.setState(state);
                contact.setZip(zip);
                contact.setPhoneNum(phoneNumber);
                contact.setEmail(email);

                System.out.println("Contact updated successfully!");
                return; // Exit the method after updating the contact
            }
        }
    }
    public void deleteContact(String firstName, String lastName) {
        Iterator<Contact> iterator = contacts.iterator();
        while (iterator.hasNext()) {
            Contact contact = iterator.next();
            if (contact.getfName().equalsIgnoreCase(firstName) && contact.getlName().equalsIgnoreCase(lastName)) {
                iterator.remove();
                System.out.println("Contact deleted successfully!");
                return; // Exit the method after deleting the contact
            }
        }
        System.out.println("Contact not found!");
    }

            public static void main (String[]args){
                AddressBook addressBook = new AddressBook();
                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("1. Add Contact");
                    System.out.println("2. Display Contacts");
                    System.out.println("3. Edit Contacts");
                    System.out.println("4. Delete Contacts");
                    System.out.println("5. Exit");
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();
                    scanner.nextLine();

                    switch (choice) {
                        case 1:
                            System.out.print("Enter first name: ");
                            String firstName = scanner.nextLine();
                            System.out.print("Enter last name: ");
                            String lastName = scanner.nextLine();
                            System.out.print("Enter address: ");
                            String address = scanner.nextLine();
                            System.out.print("Enter city: ");
                            String city = scanner.nextLine();
                            System.out.print("Enter state: ");
                            String state = scanner.nextLine();
                            System.out.print("Enter zip: ");
                            String zip = scanner.nextLine();
                            System.out.print("Enter phone number: ");
                            String phoneNumber = scanner.nextLine();
                            System.out.print("Enter email: ");
                            String email = scanner.nextLine();

                            Contact newContact = new Contact(firstName, lastName, address, city, state, zip, phoneNumber, email);
                            addressBook.addContact(newContact);
                            System.out.println("Contact added successfully!");
                            break;
                        case 2:
                            addressBook.displayContacts();
                            break;
                        case 3:
                            System.out.print("Enter first name of the contact to edit: ");
                            String editFirstName = scanner.nextLine();
                            System.out.print("Enter last name of the contact to edit: ");
                            String editLastName = scanner.nextLine();
                            addressBook.editContact(editFirstName, editLastName);
                            break;
                        case 4:
                            System.out.print("Enter first name of the contact to delete: ");
                            String deleteFirstName = scanner.nextLine();
                            System.out.print("Enter last name of the contact to delete: ");
                            String deleteLastName = scanner.nextLine();
                            addressBook.deleteContact(deleteFirstName, deleteLastName);
                            break;

                        case 5:
                            System.out.println("Exit");
                            break;
                        default:
                            System.out.println("Invalid choice!");
                    }
                    System.out.println();
                }
            }

        }




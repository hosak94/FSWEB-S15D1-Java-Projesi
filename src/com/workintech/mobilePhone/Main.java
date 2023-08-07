package com.workintech.mobilePhone;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("1231231");
        Contact ahmet = new Contact("Ahmet","1231231");
        phone.addNewContact(new Contact("Mehmet", "1231232"));
        phone.addNewContact(ahmet);
        phone.addNewContact(new Contact("Yigit", "1231232"));
        phone.addNewContact(new Contact("Yigit", "1231232"));
        phone.addNewContact(new Contact("Veli", "1231233"));
        phone.addNewContact(new Contact("Veli", "1231234"));

        phone.printContact();
        System.out.println("Index: " + phone.findContact(ahmet));
        System.out.println("Index with string: " + phone.findContact(ahmet.getName()));
        System.out.println("Query Contact: "+phone.queryContact("Mehmet"));
        phone.removeContact(ahmet);
        phone.printContact();


    }
}

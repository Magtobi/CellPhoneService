package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        CellPhone cellPhone = new CellPhone();
        Scanner scanCell = new Scanner(System.in);

        System.out.print("What is the serial number? ");
        cellPhone.setserialNumber(scanCell.nextInt());
        scanCell.nextLine();
        System.out.print("What model is the phone? ");
        cellPhone.setmodel(scanCell.nextLine());
        System.out.print("Who is the carrier? ");
        cellPhone.setcarrier(scanCell.nextLine());
        System.out.print("What is the phone number? ");
        cellPhone.setPhoneNumber(scanCell.nextLine());
        System.out.print("Who is the owner of the phone? ");
        cellPhone.setowner(scanCell.nextLine());

        System.out.println("\nSerial Number: " + cellPhone.getserialNumber());
        System.out.println("Model: " + cellPhone.getModel());
        System.out.println("Carrier: " + cellPhone.getCarrier());
        System.out.println("Phone Number: " + cellPhone.getPhoneNumber());
        System.out.println("Owner: " + cellPhone.getOwner());




    }
}

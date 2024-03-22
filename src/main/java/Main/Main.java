package Main;

////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

// Create the customer information
// Create the driver information
// Create the billing and delivery address form for the customer
// Create the online ordering form
// Create the despatch information system
//
public class Main {
    public static void main(String[] args) {
        Customer newCustomer = new Customer();
        newCustomer.completeForm();
        newCustomer.getUserInformation();
    }
}
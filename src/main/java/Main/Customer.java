package Main;

import java.util.Scanner;
import java.util.Vector;

public class Customer {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private String billingAddress;
    private String deliveryAddress;
    private String phoneNumber;
    private String emailAddress;

    Vector<String> userInformation = new Vector<>();

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getBillingAddress() {
        return billingAddress;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setBillingAddress(String billingAddress) {
        this.billingAddress = billingAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void placeOrder(){
        System.out.println("Thank you for your order" + getFirstName() + " " + getLastName());
    }

    public void completeForm(){
        Scanner userInput = new Scanner(System.in);

        System.out.println("Please enter your first name");
        String firstName = userInput.nextLine();

        System.out.println("Please enter your last name");
        String lastName = userInput.nextLine();

        System.out.println("Please enter your date of birth");
        String dateOfBirth = userInput.nextLine();

        System.out.println("Please enter your billing address");
        String billingAddress = userInput.nextLine();

        System.out.println("Please enter your delivery address");
        String deliveryAddress = userInput.nextLine();

        System.out.println("Please enter your phone number");
        String phoneNumber = userInput.nextLine();

        System.out.println("Please enter your email address");
        String emailAddress = userInput.nextLine();

        userInformation.add(firstName);
        userInformation.add(lastName);
        userInformation.add(dateOfBirth);
        userInformation.add(billingAddress);
        userInformation.add(deliveryAddress);
        userInformation.add(phoneNumber);
        userInformation.add(emailAddress);

        System.out.println("Thank you for completing your information");
    }

    public void getUserInformation(){
        System.out.println("User Information: \n" + userInformation);
    }
}


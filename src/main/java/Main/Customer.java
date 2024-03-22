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
        boolean firstNameChar = false;
        boolean secondNameChar = false;

        char[] specialCharacters = {'!', '@', '#', '$', '%', '^', '&', '*', '(', ')'};

        System.out.println("Please enter your first name");
        String firstName = userInput.nextLine();

        // Check the following things:
        // 1. The name has more than 8 digits (works)
        // 2. The name contains the above special characters (not working)
        // 3. The name containts both special characters and more than 8 digits (works)


        for (int i=0; i<firstName.length(); i++){
            for (char characters : specialCharacters){
                if (firstName.length() > 8){
                    if (firstName.charAt(i) == characters){
                        System.out.println("You cannot have special characters and more than 8 digits in the name");
                        System.out.println("Please enter your first name");
                        userInput.nextLine();
                    }
                    else{
                        System.out.println("You cannot have more than 8 digits in the name");
                        System.out.println("Please enter your first name");
                        userInput.nextLine();
                    }
                }
                else {
                    if (firstName.charAt(i) == characters){
                        System.out.println("You cannot have special characters in the name");
                        System.out.println("Please enter your first name");
                        userInput.nextLine();
                    }
                }
            }
        }
//        while (firstName.length() > 8) {
//            for (int i = 0; i < firstName.length(); i++) {
//                for (char characters : specialCharacters) {
//                    if (firstName.charAt(i) == characters) {
//                    //    firstNameChar = true;
//                     //   if (firstNameChar){
//                            if (firstName.length() > 8){
//                                System.out.println("[ERROR]: You cannot have special characters in the name");
//                                System.out.println("[ERROR]: The maximum characters for the name is 8");
//                                System.out.println("Please enter your first name");
//                                firstName = userInput.nextLine();
//                            }
//                            else if (firstName.length() < 8) {
//                                System.out.println("[ERROR]: You cannot have special characters in the name");
//                                System.out.println("Please enter your first name");
//                                firstName = userInput.nextLine();
//                            }
//                     //   }
//                    }
//                }
//            }


          //  System.out.println("[ERROR]: The maximum characters for the name is 8");

         //   System.out.println("Please enter your first name");
           // firstName = userInput.nextLine();
     //   }

        System.out.println("Please enter your last name");
        String lastName = userInput.nextLine();
        while (lastName.length() > 8){
            for (int i=0; i<lastName.length(); i++){
                for (char characters : specialCharacters){
                    if (lastName.charAt(i) == characters){
                        secondNameChar = true;
                        break;
                    }
                }
            }
            if (secondNameChar){
                System.out.println("[ERROR]: You cannot have special characters in the name");
            }

            System.out.println("[ERROR]: The maximum characters for the name is 8");

            System.out.println("Please enter your last name");
            lastName = userInput.nextLine();

        }

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


package com.company.composition;

public class CustomerApp {
    public static void main(String[] args) {

        Customer customer = new Customer();
        customer.setFirstName("Angela");
        System.out.println("First Name: " + customer.getFirstName());
        customer.setLastName("Miller");
        System.out.println("Last Name: " + customer.getLastName());
        customer.setEmail("angelam@gmail.com");
        System.out.println("email: " + customer.getEmail());
        customer.setPhoneNumber(1237880904);
        System.out.println("Phone Number: " + customer.getPhoneNumber());
        customer.setRewardMember(true);
        System.out.println("Reward Member: " + customer.isRewardMember());

    }
}

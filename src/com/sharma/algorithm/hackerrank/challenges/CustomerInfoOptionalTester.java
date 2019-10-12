package com.sharma.algorithm.hackerrank.challenges;

import java.util.Optional;

public class CustomerInfoOptionalTester {

    public static void main(String[] args) {
        CustomerInfoOptional customer = new CustomerInfoOptional();

        String customerName = customer.getCustomerName();

        System.out.println("Customer Name is == " + customerName);

        Optional<CustomerInfoOptional> customerNameOptional = customer.getCustomerNameUsingOptional(10);

        if (customerNameOptional.isPresent()) {
            System.out.println("Customer Name is using Optional == " + customerNameOptional.get().getCustomerName());
        } else {
            System.out.println("Customer not found!");
        }
    }
}

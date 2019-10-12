package com.sharma.algorithm.hackerrank.challenges;

import java.util.Optional;

public class CustomerInfoOptional {

    private Integer customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String phone;

    public Integer getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerName() {
        return this.firstName + " " + this.lastName;
    }

    public Optional<CustomerInfoOptional> getCustomerNameUsingOptional(Integer customerId) {
        CustomerInfoOptional customer = null;

        if (customerId > 0) {
            customer = new CustomerInfoOptional();
            customer.setCustomerId(1001);
            customer.setFirstName("Optional");
            customer.setLastName("User");
        }

        return Optional.ofNullable(customer);
    }
}

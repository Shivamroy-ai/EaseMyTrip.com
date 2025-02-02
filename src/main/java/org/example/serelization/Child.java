package org.example.serelization;

import java.util.List;

public class Child {

    private String userName;
    private  String lastName;
    private  String  email;
    public String contact;
    private List<String> DOB;

    private String passportNumber;
    private  List<String> PassportExpiryDate;

    public Child(String userName, String lastName, String email, String contact, List<String> DOB, String passportNumber, List<String> passportExpiryDate) {
        this.userName = userName;
        this.lastName = lastName;
        this.email = email;
        this.contact = contact;
        this.DOB = DOB;
        this.passportNumber = passportNumber;
        PassportExpiryDate = passportExpiryDate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public List<String> getDOB() {
        return DOB;
    }

    public void setDOB(List<String> DOB) {
        this.DOB = DOB;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }

    public List<String> getPassportExpiryDate() {
        return PassportExpiryDate;
    }

    public void setPassportExpiryDate(List<String> passportExpiryDate) {
        PassportExpiryDate = passportExpiryDate;
    }
}

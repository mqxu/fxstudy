package com.niit.fxstudy.li;


public class AddressBook {
    private String studentID;
    private String name;
    private String gender;
    private String homeTown;
    private String bedNumber;
    private String phoneNumber;
    private String picture;

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    public String getBedNumber() {
        return bedNumber;
    }

    public void setBedNumber(String bedNumber) {
        this.bedNumber = bedNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "AddressBook{" +
                "studentID='" + studentID + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", bedNumber='" + bedNumber + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", picture='" + picture + '\'' +
                '}';
    }

    public AddressBook(String studentID, String name, String gender, String homeTown, String bedNumber, String phoneNumber, String picture) {
        this.studentID = studentID;
        this.name = name;
        this.gender = gender;
        this.homeTown = homeTown;
        this.bedNumber = bedNumber;
        this.phoneNumber = phoneNumber;
        this.picture = picture;

    }
}


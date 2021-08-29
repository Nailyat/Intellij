package com.syntax.review.class07;

public class Company {

    String name;
    int year;
    String country;
    String state;
    int numberOfEmploees;


    Company(){
        name="ARS";
        year=2015;
        country="USA";
        state="VA";
        numberOfEmploees=1000;

    }
    Company(String companyName){
        name=companyName;
        year=2018;
        country="USA";
        state="VA";
        numberOfEmploees=1000;
    }

    Company(String companyName, String countryName){
        name=companyName;
        year=2020;
        country=countryName;
        state="VA";
        numberOfEmploees=1000;
    }
    void printCompanyInfo(){
        System.out.println(name+" "+year+" "+country+" "+state+" "+numberOfEmploees);
    }
}

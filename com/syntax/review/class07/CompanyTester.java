package com.syntax.review.class07;

public class CompanyTester {
    public static void main(String[] args) {

        Company c = new Company();
        c.printCompanyInfo();

        Company c1 = new Company("GoodHouse");
        c1.printCompanyInfo();

        Company c2 = new Company("Staging", "USA");
        c2.printCompanyInfo();

    }
}

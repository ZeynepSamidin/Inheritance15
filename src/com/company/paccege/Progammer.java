package com.company.paccege;

public class Progammer extends  Person {

    private String companyName;

    public Progammer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void coding(){
        System.out.println("Programmer writes code");
    }
    public void learm() {
        System.out.println("Programmer teaches coding ");
    }
    public void walk() {
        System.out.println("Programmer walks in the park");

    }
    public void eat() {
        System.out.println("Programmer eat sandwich");

    }

    @Override
    public String toString() {
        return "Progammer{" +
                "companyName='" + companyName + '\'' +
                '}';
    }
}

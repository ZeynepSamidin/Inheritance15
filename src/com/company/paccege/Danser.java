package com.company.paccege;

public class Danser extends  Person {

    private String groupName;

    public Danser(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }
    public void dansing(){
        System.out.println("Dance hip hop");
    }
    public String getGroupName() {
        return groupName;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public  void learm(){
        System.out.println("Teaches to dance.");
    }
    public  void walk(){
        System.out.println("Tansor walks.");
    }
    public void eat() {
        System.out.println("Tansor eats.");
    }

    @Override
    public String toString() {
        return "Danser" + "groupName='" + groupName;
    }
}



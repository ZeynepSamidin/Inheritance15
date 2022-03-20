package com.company.paccege;

public class Singer extends Person {

    private String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void singing() {
        System.out.println("Singing a song");

    }
    public void playGitar() {
        System.out.println("Plays tre guiter");

    }
    public void learm() {
        System.out.println("Singer teaches to sing");

    }
    public void walk() {
        System.out.println("The singer is walking in the park");

    }
    public void eat() {
        System.out.println("Singer eats pizza");

    }

    @Override
    public String toString() {
        return "Singer{" +
                "bandName='" + bandName + '\'' +
                '}';
    }
}

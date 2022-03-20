package com.company.paccege;

public class Main {
    public static void main(String[] args) {

        Danser danser = new Danser("Dasha", " dancer", "Shattyk");
        System.out.println(danser.getName()+ ", " + danser.getDesignation()+ ", " +danser.getGroupName()+ ",");
        danser.dansing();
        danser.learm();
        danser.walk();
        danser.eat();

        System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");

        Singer singer = new Singer("Freddie Mercury", "Singer", "Queen");
        System.out.println(singer.getName()+ ", " + singer.getDesignation()+ ", " + singer.getBandName()+ ",");
        singer.singing();
        singer.playGitar();
        singer.learm();
        singer.walk();
        singer.eat();

        System.out.println("*  *  *  *  *  *  *  *  *  *  *  *  *  *  *  *");

        Progammer progammer = new Progammer("Zeynep", "Programmer", "Peaksoft");
        System.out.println(progammer.getName()+ ", " + progammer.getDesignation()+ ", " + progammer.getCompanyName()+ ",");
        progammer.coding();
        progammer.learm();
        progammer.walk();
        progammer.eat();
    }
}

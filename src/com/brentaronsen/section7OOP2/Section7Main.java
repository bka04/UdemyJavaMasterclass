package com.brentaronsen.section7OOP2;

public class Section7Main {

    public static void section7Main() {

        EnhancedPlayer player = new EnhancedPlayer("Tim", 500, "Sword");
        System.out.println("Initial health is " + player.getHealth());

//        // example showing no encapsulation
//        Player player = new Player();
//        player.fullName = "Tim";
////        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//
//        damage = 11;
//        player.health = 200;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());

//        Wall wall1 = new Wall("West");
//        Wall wall2 = new Wall("East");
//        Wall wall3 = new Wall("South");
//        Wall wall4 = new Wall("North");
//
//        Ceiling ceiling = new Ceiling(12, 55);
//
//        Bed bed = new Bed("Modern", 4, 3, 2, 1);
//
//        Lamp lamp = new Lamp("Classic", false, 75);
//
//        Bedroom bedroom = new Bedroom("Tim's", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
//
//        bedroom.makeBed();
//        bedroom.getLamp().turnOn();

//        Dimensions dimensions = new Dimensions(20, 20, 5);
//        Case theCase = new Case("220B", "Dell", "240", dimensions);
//        Monitor theMonitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//        Motherboard theMotherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//        PC thePC = new PC(theCase, theMonitor, theMotherboard);
//        thePC.powerUp();

    }
}
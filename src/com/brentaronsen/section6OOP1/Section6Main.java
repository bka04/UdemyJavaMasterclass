package com.brentaronsen.section6OOP1;

public class Section6Main {

    public static void section6Main() {


        Animal animal = new Animal("Animal", 1, 1, 5, 5);
        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "long silky");
        dog.eat();
        dog.walk();
        dog.run();

        //Exercise 34: Complex operations
//        ComplexNumber one = new ComplexNumber(1.0, 1.0);
//        ComplexNumber number = new ComplexNumber(2.5, -1.5);
//        one.add(1,1);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        one.subtract(number);
//        System.out.println("one.real= " + one.getReal());
//        System.out.println("one.imaginary= " + one.getImaginary());
//        number.subtract(one);
//        System.out.println("number.real= " + number.getReal());
//        System.out.println("number.imaginary= " + number.getImaginary());

        // Exercise 33: Carpet cost calculator
//        Carpet carpet = new Carpet(3.5);
//        Floor floor = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());
//        carpet = new Carpet(1.5);
//        floor = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor, carpet);
//        System.out.println("total= " + calculator.getTotalCost());

//        Exercise 32: Point
//        Point first = new Point(6, 5);
//        Point second = new Point(3, 1);
//        System.out.println("distance(0,0)= " + first.distance());
//        System.out.println("distance(second)= " + first.distance(second));
//        System.out.println("distance(2,2)= " + first.distance(2, 2));
//        Point point = new Point();
//        System.out.println("distance()= " + point.distance());

//        VipCustomer VIP1 = new VipCustomer();
//        VipCustomer VIP2 = new VipCustomer("Brian", "brian@life.com");
//        VipCustomer VIP3 = new VipCustomer("Jack", 50000, "jack@email.com");
//
//        System.out.println(VIP1.getName() + " " + VIP1.getEmailAddress() + " " + VIP1.getCreditLimit());
//        System.out.println(VIP2.getName() + " " + VIP2.getEmailAddress() + " " + VIP2.getCreditLimit());
//        System.out.println(VIP3.getName() + " " + VIP3.getEmailAddress() + " " + VIP3.getCreditLimit());

//        //BankAccount account1 = new BankAccount("12345", 0.00, "Bob Brown", "myemail@bob.com", "123-456-7890");
//        BankAccount account1 = new BankAccount(); //use default constructor
//
//        account1.depositFunds(25);
//        account1.withdrawFunds(20);
//        account1.withdrawFunds(10);
//
//        BankAccount timsAccount = new BankAccount("Tim", "tim@email.com", "12345");
//        System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

//        Car porsche = new Car();
//        Car holden = new Car();
//        porsche.setModel("Carrera");
//        System.out.println("Model is " + porsche.getModel());
    }
}

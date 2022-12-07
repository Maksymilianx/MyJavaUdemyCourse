package SectionNr6.Lessons;

import SectionNr6.Exercises.ComplexNumber;
import SectionNr6.Exercises.VipCustomer;
import SectionNr6.Lessons.Car;

public class Main {

    public static void main(String[] args) {
//        Car fiat = new Car();
//        Car ferrari = new Car();
//        fiat.setModel("Panda");
//        ferrari.setModel("italia");
//        System.out.println("Model is " + fiat.getModel());
//        System.out.println("Ferrari model is " + ferrari.getModel());


//        BankAccount someAcc = new BankAccount();
//        System.out.println(someAcc.getAccountNumber());
//        System.out.println(someAcc.getBalance());
//        someAcc.withdrawal(100);
//
//        someAcc.deposit(50);
//        someAcc.withdrawal(100);
//
//        someAcc.deposit(51);
//        someAcc.withdrawal(100);

        // example of garbage collection (there is no reference to an object)
        new VipCustomer("Bob",0,"asdasd");

        // we are using the new keyword, to create an instance of a class
        VipCustomer customer1 = new VipCustomer();
        // after we have got the instance, we can call the instance method getName
        System.out.println(customer1.getName());

        VipCustomer customer2 = new VipCustomer("Bob", 2500.0);
        System.out.println(customer2.getName());

        VipCustomer customer3 = new VipCustomer("Tim", 2500.0, "mail");
        System.out.println(customer3.getName());
    }
}


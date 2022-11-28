package SectionNr6.Lessons;

import SectionNr6.Lessons.Car;

public class Main {

    public static void main(String[] args) {
//        Car fiat = new Car();
//        Car ferrari = new Car();
//        fiat.setModel("Panda");
//        ferrari.setModel("italia");
//        System.out.println("Model is " + fiat.getModel());
//        System.out.println("Ferrari model is " + ferrari.getModel());


        BankAccount someAcc = new BankAccount();
        System.out.println(someAcc.getAccountNumber());
        System.out.println(someAcc.getBalance());
        someAcc.withdrawal(100);

        someAcc.deposit(50);
        someAcc.withdrawal(100);

        someAcc.deposit(51);
        someAcc.withdrawal(100);
    }
}


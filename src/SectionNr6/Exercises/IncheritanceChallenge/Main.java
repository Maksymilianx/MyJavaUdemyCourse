package SectionNr6.Exercises.IncheritanceChallenge;

public class Main {

    public static void main(String[] args) {

        Employee Max = new Employee("Max", "08/01/1996", "01/01/2020");
        System.out.println(Max);
        System.out.println("Age = " + Max.getAge());
        System.out.println("Pay = " + Max.collectPay());

        SalariedEmployee Joe = new SalariedEmployee("Joe", "08/01/1990", "01/01/2020",
                35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = $" + Joe.collectPay());

        Joe.retire();
        System.out.println("Joe's Pension check = $" + Joe.collectPay());

        HourlyEmployee Mary = new HourlyEmployee("Mary", "05/05/1970",
                "03/03/2021", 15);
        System.out.println(Mary);
        System.out.println("Mary's Paycheck = $" + Mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + Mary.getDoublePay());
    }

}

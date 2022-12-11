package SectionNr6.Exercises.IncheritanceChallenge;

import java.time.LocalDate;

public class Worker {

    private String name;
    private String birthDate;
    protected String endDate;

    public Worker() {

    }

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge() {
        LocalDate today = LocalDate.now();
        // substring() method extract a substring from the given string by using index values passed in an argument
        // substring(startIndex, endIndex)
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return (today.getYear() - birthYear);
    }

    public double collectPay() {
        return 0.0;
    }

    public void terminate(String endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", endDate='" + endDate + '\'' +
                '}';
    }
}

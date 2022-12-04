package SectionNr6.Lessons;

import SectionNr6.Lessons.Student;

public class Main2 {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            LPAStudent s = new LPAStudent("S92300" + i,
                    switch (i) {
                        case 1 -> "Mary";
                        case 2 -> "Carol";
                        case 3 -> "Tim";
                        case 4 -> "Jake";
                        case 5 -> "Lisa";
                        default -> "Anonymous";
                    },
                    "05/11/2000",
                    "Java Masterclass");
            System.out.println(s);
        }

        Student pojoStudent = new Student("S92306", "Ann", "05/11/1985","Java Masterclass");
        LPAStudent recordStudent = new LPAStudent("S92307", "Bill", "05/11/1985","Java Masterclass");

        pojoStudent.setClassList(pojoStudent.getClassList() + ", some classList");
        //   recordStudent.setClassList(recordStudent.classList() + ", some classList");

        System.out.println(pojoStudent);
        System.out.println(recordStudent);

        System.out.println(pojoStudent.getName() + " is taking " + pojoStudent.getClassList());
        System.out.println(recordStudent.name() + " is taking " + recordStudent.classList());
    }
}

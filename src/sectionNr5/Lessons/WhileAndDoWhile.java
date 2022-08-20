package sectionNr5.Lessons;

public class WhileAndDoWhile {

    public static void main(String[] args) {
        int count = 6;
        while (count != 6) {
            System.out.println("Count value is " + count);
            count++;
        }

        for (int i=6; i!=6; i++) {
            System.out.println("Count value is " + count);
        }

        count = 6;
        do {
            System.out.println("Count value was " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);

        System.out.println("###############################");

//        continue - continues to the next iteration, while break exit the loop
//        do {
            //statements
//        } while (condition);

        int number = 4;
        int finishNumber = 20;
        int nextCount = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                nextCount++;
                System.out.println("Even number " + number);
                continue;
            }
            if (nextCount == 5) {
                break;
            }
        }
        System.out.println("Total even numbers found = " + nextCount);
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 != 0;
    }
}

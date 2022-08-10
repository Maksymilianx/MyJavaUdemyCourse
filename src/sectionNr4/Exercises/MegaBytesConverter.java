package sectionNr4.Exercises;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes(int kiloBytes) {
        int Mb = kiloBytes / 1024;
        int moduloMb = kiloBytes % 1024;
        if (kiloBytes < 0) System.out.println("Invalid Value");
        else {
            System.out.println(kiloBytes + " KB = " + Mb + " MB and " + moduloMb + " KB");
        }
    }

    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(-2500);
    }
}

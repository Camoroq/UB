package ssg.Task;
import java.util.Scanner;

public class Konversisuhu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("\n\n");
        System.out.print("Masukkan suhu dalam Celcius: ");
        double celcius = input.nextDouble();

        double fahrenheit = (celcius * 9.0 / 5.0) + 32;

        System.out.printf("Suhu dalam Fahrenheit: %.2f°F\n", fahrenheit);
        System.out.println("\n\n");
    }
}
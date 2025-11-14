package ssg.Task;

import java.util.Scanner;
public class aa {
    public static void main(String[] args) {
    
    Scanner input = new Scanner(System.in);
    int a,b;

    System.out.print("Masukkan operator pertama :");
    a=input.nextInt();
    System.out.print("Masukkan operator kedua :");
    b=input.nextInt();
    System.out.println("Hasil penjumlahan :"+(a+b));
    System.out.println("Hasil pengurangan :"+(a-b));
    System.out.println("Hasil perkalian :"+(a*b));
    System.out.println("Hasil pembagian :"+(a/b));


    }
}

package ssg.Task;

import java.util.Scanner;
public class Kelas {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("Masukkan jumlah kelas: ");
    int a=sc.nextInt();
    System.out.print("Masukkan jumlah siswa per kelas: ");
    int b=sc.nextInt();
    System.out.println("\n Daftar Nilai Siswa:");
    
    for (int i=1;i<=a;i++) {
        System.out.println("Kelas "+i+":"); 
            for (int j=1;j<=b;j++) {
                System.out.print("  Masukkan nilai siswa ke-"+j+": ");
                int nilai=sc.nextInt();
                System.out.printf("    Nilai siswa ke-%d adalah %d\n", j, nilai);
            } System.out.println("");}
        }
    }

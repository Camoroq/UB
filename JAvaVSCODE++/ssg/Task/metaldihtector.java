package ssg.Task;

import java.util.Scanner;
public class metaldihtector {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        String[] buah = {"Apel", "Pisang", "Melon"};
        int[][] hstok = {{10, 3000}, {12, 4500}, {5, 11000}};

        while (true) {
            System.out.print("---------------------------------------");
           
            System.out.println("\nNo\tNama Buah\tStok\tHarga");
            for (int i = 0; i < buah.length; i++) {
                System.out.println((i + 1) + "\t" + buah[i] + "\t\t" + hstok[i][0] + "\t" + hstok[i][1]);
            } System.out.print("---------------------------------------");
            System.out.print("\nPilih nomor buah (1-" + buah.length + "), ketik 0 untuk keluar: ");
            int pilih = sc.nextInt();

            if (pilih == 0) break; 
            if (pilih > 0 && pilih <= buah.length) {
                if (hstok[pilih-1][0] == 0) {
                    System.out.println("Stok " + buah[pilih-1] + " habis");
                    continue;
                }
                System.out.print("Masukkan jumlah yang akan dibeli: ");
                int jumlah = sc.nextInt();
                if (jumlah <= hstok[pilih-1][0]) {
                    hstok[pilih-1][0] -= jumlah;
                } else {
                    System.out.println("Stok tidak cukup");
                }
            } else {
                System.out.println("Nomor buah tidak valid");
            }
            int minIdx = 0;
            for (int i = 1; i < buah.length; i++) {
                if (hstok[i][0] < hstok[minIdx][0]) {
                    minIdx = i;
                }
            }
            System.out.println("\nPeringatan: Stok terendah adalah buah " + buah[minIdx] +
            " (" + hstok[minIdx][0] + " buah)");
        }
        sc.close();
        System.out.println("\nPerubahan Stok Terakhir:");
        System.out.println("No\tNama Buah\tStok");
        for (int i = 0; i < buah.length; i++) {
            System.out.println((i + 1) + "\t" + buah[i] + "\t\t" + hstok[i][0]);
        }
    }
}
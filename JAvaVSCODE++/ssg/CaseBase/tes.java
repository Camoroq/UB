package ssg.CaseBase;

import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lagi = "ya";
        int kode = 1;
        int harga = 0, total = 0;
        int jenis = 0;
        int tldc, tlhr = 0, tlbks;
        int ayambakar = 0;
        int diskon=0;

        System.out.println("\n=================== Menu ==================");
        System.out.printf("Kode 1: %-20s Harga: Rp. %s\n", "Nasi Goreng Spesial", "15,000");
        System.out.printf("Kode 2: %-20s Harga: Rp. %s\n", "Ayam Bakar Madu", "25,000");
        System.out.printf("Kode 3: %-20s Harga: Rp. %s\n", "Soto Ayam Lamongan", "12,000");
        System.out.printf("Kode 4: %-20s Harga: Rp. %s\n", "Es Teh Manis", "5,000");
        System.out.printf("Kode 5: %-20s Harga: Rp. %s\n", "Es Jeruk", "7,000");
        System.out.println("===========================================\n");

        while (lagi.equalsIgnoreCase("ya")) {
            System.out.printf("%-23s: ", "Masukkan kode makanan");
            kode = sc.nextInt();

            if (kode == 1) {
                harga = 15000;
                jenis++;
            } else if (kode == 2) {
                harga = 25000;
                jenis++;
            } else if (kode == 3) {
                harga = 12000;
                jenis++;
            } else if (kode == 4) {
                harga = 5000;
            } else if (kode == 5) {
                harga = 7000;
            } else {
                System.out.println("Kode tidak valid");
                continue;
            }

            System.out.printf("%-23s: ", "Masukkan jumlah barang");
            int jml = sc.nextInt();
            int tlharga = harga * jml;
            total += tlharga;

            if (kode == 2) {
                ayambakar += jml;
            }

            System.out.printf("%-23s: Rp. %,d\n", "Subtotal harga", tlharga);
            System.out.print("Apakah ingin menambah item lagi? (ya/tidak): ");
            sc.nextLine();
            lagi = sc.nextLine();
            System.out.println();
        }

        System.out.printf("%-27s %s", "Apakah hari ini hari Jumat?", "(ya/tidak): ");
        String hari = sc.nextLine();
        System.out.printf("%-27s %s", "Apakah dibungkus?", "(ya/tidak): ");
        String bks = sc.nextLine();

        tldc = total;
        
        if (total > 100000) {
            tldc = total - total * 15 / 100;
            diskon=15;
        } else if (total > 50000) {
            tldc = total - total * 10 / 100;
            diskon=10;
        }

        if (hari.equalsIgnoreCase("ya") && ayambakar >= 1) {
            tlhr = tldc - 5000;
        } else {
            tlhr = tldc;
        }

        tlbks = 0;
        if (bks.equalsIgnoreCase("ya")) {
            tlbks = jenis * 2000;
        }


        double subtotal = tlhr + tlbks;
        double pajak = subtotal * 0.10;
        double totalAkhir = subtotal + pajak;
        System.out.println("\n========== RINCIAN PEMBAYARAN ==========");
        System.out.printf("%-25s: Rp. %,d\n","Total Harga",total);
        System.out.printf("%-25s: Rp. %,d\n",String.format ("Diskon Harga (%d%%)",diskon),(total - tldc));
        System.out.printf("%-25s: Rp. %,d\n","Diskon Spesial Jumat",(tldc - tlhr));
        System.out.printf("%-25s: Rp. %,d\n","Biaya Bungkus",tlbks);
        System.out.printf("%-25s: Rp. %,.0f\n","Pajak Restoran (10%)",pajak);
        System.out.println("=========================================");
        System.out.printf("%-25s: Rp. %,.0f\n\n","Total Akhir Pembayaran",totalAkhir);
    } 
}
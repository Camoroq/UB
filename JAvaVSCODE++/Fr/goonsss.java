package Fr;

import java.util.Scanner;
public class goonsss {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahNama = input.nextInt();
        input.nextLine();
        
        String[] nama = new String[jumlahNama];
        int totalHuruf = 0;

        System.out.println("Masukkan " + jumlahNama + " nama lengkap: ");
        for (int i = 0; i < jumlahNama; i++) {
            System.out.print("Nama ke-" + (i + 1) + ": ");
            nama[i] = input.nextLine().trim().replaceAll("\\s+", " ");
        }

        System.out.println("\nInisial dari setiap nama: ");
        for (int i = 0; i < jumlahNama; i++) {
            String[] kata = nama[i].split(" ");
            StringBuilder inisial = new StringBuilder();
            
            for (int j = 0; j < kata.length; j++) {
                inisial.append(Character.toUpperCase(kata[j].charAt(0)))    .append(".");
            }
            
            System.out.println(nama[i] + " -> " + inisial);
        }

        String awalan = input.nextLine().trim().toUpperCase();

        System.out.println("\nNama yang berawalan huruf '" + awalan + "': ");
        boolean ada = false;
        
        for (int i = 0; i < jumlahNama; i++) {
            String[] kata = nama[i].split(" ");
            StringBuilder namaProper = new StringBuilder();
            
            for (int j = 0; j < kata.length; j++) {
                namaProper.append(Character.toUpperCase(kata[j].charAt(0)))
                         .append(kata[j].substring(1).toLowerCase());
                if (j < kata.length - 1) namaProper.append(" ");
            }
            
            String hasil = namaProper.toString();
            if (hasil.toUpperCase().startsWith(awalan)) {
                System.out.println(hasil);
                ada = true;
            }
        }
        
        if (!ada) {
            System.out.println("Tidak ada nama yang berawalan '" + awalan + "'");
        }

        for (int i = 0; i < jumlahNama; i++) {
            totalHuruf += nama[i].replace(" ", "").length();
        }
        
        System.out.println("\nTotal huruf (tanpa spasi): " + totalHuruf);
        
        input.close();
    }
}
package ssg.Task;

import java.util.Scanner;
public class Forreal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tanggalBeli;
        int bulanBeli;
        int tahunBeli;
        int jumlahBarang;
        String belanjaBarang;
        double hargaBarang;
        int diskon;
        boolean jenisPembayaran;
        double totalHarga;
        double jumlahPembayaran;

        System.out.print("Masukkan Tanggal Beli : ");
        tanggalBeli = input.nextInt();

        System.out.print("Masukkan Bulan Beli : ");
        bulanBeli = input.nextInt();

        System.out.print("Masukkan Tahun Beli : ");
        tahunBeli = input.nextInt();

        input.nextLine();

        System.out.print("Masukkan Nama Barang : ");
        belanjaBarang = input.nextLine();

        System.out.print("Masukkan Jumlah Barang : ");
        jumlahBarang = input.nextInt();

        System.out.print("Masukkan Harga Barang : ");
        hargaBarang = input.nextDouble();

        System.out.print("Masukkan Diskon : ");
        diskon = input.nextInt();

        System.out.print("Apakah pembayaran tunai? : ");
        jenisPembayaran = input.nextBoolean();

                totalHarga = jumlahBarang * hargaBarang;
                jumlahPembayaran = totalHarga - (totalHarga * diskon/100);
        
        System.out.println("========= List Barang =========");
        System.out.printf("%-16s: %d-%d-%d\n", "tanggal", tanggalBeli, bulanBeli, tahunBeli);
        System.out.printf("%-16s: %s\n", "Nama Barang", belanjaBarang);
        System.out.printf("%-16s: %d\n", "Jumlah Barang", jumlahBarang);
        System.out.printf("%-16s: Rp. %.2f\n", "Harga Barang", hargaBarang);
        System.out.printf("%-16s: %d%%\n", "Diskon", diskon);
        System.out.printf("%-16s: %b\n", "Pembayaran Tunai", jenisPembayaran);
        System.out.printf("%-16s: Rp. %.2f\n", "Total Harga", totalHarga);
        System.out.println("===============================");
        System.out.printf("%-16s: %.0f\n", "Total Pembayaran", jumlahPembayaran);


        
    }
}

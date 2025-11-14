package ssg.CaseBase;
import java.util.Scanner;

public class WarungPakBudi {

    // ===== PROCEDURE (Orang 2): Menampilkan daftar menu barang =====
    /**
     * Menampilkan menu makanan dan minuman dengan format kolom yang rapi.
     */
    public void tampilkanMenuBarang() {
        System.out.println("\n================= Menu Warung Pak Budi =================");
        System.out.printf("%-5s %-20s %s\n", "No.", "Nama Barang", "Harga");
        System.out.println("------------------------------------------------------");
        System.out.printf("%-5d %-20s Rp. %,d\n", 1, "Nasi Goreng", 15000);
        System.out.printf("%-5d %-20s Rp. %,d\n", 2, "Mie Goreng", 12000);
        System.out.printf("%-5d %-20s Rp. %,d\n", 3, "Es Teh", 5000);
        System.out.printf("%-5d %-20s Rp. %,d\n", 4, "Kopi", 8000);
        System.out.println("======================================================");
    }

    // ===== FUNCTION (Orang 3): Menghitung total harga =====
    /**
     * Menghitung total harga dari jumlah barang dan harga satuan.
     * @param harga Harga satuan barang.
     * @param jumlah Jumlah barang yang dibeli.
     * @return Total harga (harga * jumlah).
     */
    static int hitungTotal(int harga, int jumlah) {
        return harga * jumlah;
    }

    // ===== PROCEDURE Cetak Struk (Orang 4) =====
    /**
     * Mencetak rincian struk belanja.
     * @param namaBarang Nama barang yang dibeli.
     * @param harga Harga satuan barang.
     * @param jumlah Jumlah barang yang dibeli.
     * @param total Total harga setelah dikalikan jumlah.
     */
    static void cetakStruk(String namaBarang, int harga, int jumlah, int total) {
        System.out.println("\n===== Struk Belanja =====");
        System.out.println("Barang : " + namaBarang);
        System.out.println("Harga  : Rp " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total  : Rp " + total);
        System.out.println("==========================");
        System.out.println("Terima kasih telah belanja di Warung Pak Budi!");
    }

    // ===== MAIN PROGRAM (Orang 1) =====
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Panggil procedure menampilkan menu
        WarungPakBudi ay = new WarungPakBudi();
        ay.tampilkanMenuBarang();

        System.out.print("\nPilih nomor menu: ");
        int pilihan = input.nextInt();

        System.out.print("Masukkan jumlah: ");
        int jumlah = input.nextInt();

        String namaBarang = "";
        int harga = 0;

        // menentukan barang yang dipilih
        switch (pilihan) {
            case 1:
                namaBarang = "Nasi Goreng";
                harga = 15000;
                break;
            case 2:
                namaBarang = "Mie Goreng";
                harga = 12000;
                break;
            case 3:
                namaBarang = "Es Teh";
                harga = 5000;
                break;
            case 4:
                namaBarang = "Kopi";
                harga = 8000;
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                input.close();
                return;
        }

        // panggil function hitung total
        int total = hitungTotal(harga, jumlah);

        // cetak struk
        cetakStruk(namaBarang, harga, jumlah, total);

        input.close();
    }
}
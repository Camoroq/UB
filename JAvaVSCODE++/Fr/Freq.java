package Fr;
import java.util.Scanner;
public class Freq {

        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // --- 1. BACA INPUT ---
        
        // Baca baris pertama (n)
        int n = scanner.nextInt();

        // Buat array untuk menampung n angka
        int[] arr = new int[n];

        // Baca baris kedua (n angka) dan masukkan ke array
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        // --- 2. PROSES PENCARIAN MODUS ---

        // Siapkan variabel untuk menyimpan jawaban terbaik sejauh ini
        int modus = 0; // Nilai yang paling sering muncul
        int frekuensiMaks = 0; // Jumlah kemunculan (frekuensi) terbanyak

        // Inisialisasi:
        // Kita set frekuensiMaks = 0 (belum ada)
        // Kita set modus = 1001 (angka di luar rentang -1000 s/d 1000)
        // Ini untuk memastikan angka pertama yang kita cek pasti akan
        // menjadi modus sementara.
        modus = 1001; 

        // Loop Luar (i): Untuk memilih satu per satu angka sebagai "kandidat" modus
        for (int i = 0; i < n; i++) {
            
            int nilaiKandidat = arr[i];
            int frekuensiKandidat = 0;

            // Loop Dalam (j): Untuk menghitung frekuensi dari "nilaiKandidat"
            // Kita bandingkan nilaiKandidat (arr[i]) dengan semua elemen (arr[j])
            for (int j = 0; j < n; j++) {
                if (arr[j] == nilaiKandidat) {
                    frekuensiKandidat++; // Tambah hitungan jika angkanya sama
                }
            }

            // 6. Cek apakah kandidat ini lebih baik dari modus kita saat ini
            
            // Kasus 1: Frekuensi kandidat LEBIH BESAR dari frekuensiMaks
            if (frekuensiKandidat > frekuensiMaks) {
                frekuensiMaks = frekuensiKandidat;
                modus = nilaiKandidat;
            } 
            // Kasus 2: Frekuensi SAMA (TIE BREAKER)
            else if (frekuensiKandidat == frekuensiMaks) {
                // Jika frekuensinya sama, kita harus pilih yang nilainya LEBIH KECIL
                if (nilaiKandidat < modus) {
                    modus = nilaiKandidat;
                    // frekuensiMaks tidak perlu diubah karena nilainya sama
                }
            }
            // Jika frekuensiKandidat < frekuensiMaks, kita abaikan.
        }

        // --- 3. CETAK OUTPUT ---

        // Cetak Nilai dan Frekuensi
        System.out.println("Nilai: " + modus);
        System.out.println("Frekuensi: " + frekuensiMaks);

        // Cetak semua indeks (posisi) dari nilai modus
        System.out.print("Indeks:");
        for (int i = 0; i < n; i++) {
            if (arr[i] == modus) {
                System.out.print(" " + i);
            }
        }
        System.out.println(); // Cetak baris baru di akhir

        scanner.close();
    }
}

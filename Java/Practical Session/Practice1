import java.util.Scanner;
public class Practice1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nm, klurah;
        int kwhbfr, kwhaft;
        int beban;
        int ppj;
        int aftppj;
        int cost;

        System.out.print("\n\nMasukkan nama   : ");
        nm=input.nextLine();
        System.out.print("Kelurahan   : ");
        klurah=input.nextLine();
        System.out.print("Masukkan posisi awal Kwh Meter   : ");
        kwhbfr=input.nextInt();
        System.out.print("Masukkan posisi akhir Kwh Meter  : ");
        kwhaft=input.nextInt();
        System.out.print("Masukkan biaya beban saat ini    : ");
        beban=input.nextInt();
        System.out.print("Masukkan PPJ (dalam persen)      : ");
        ppj=input.nextInt();
        System.out.printf("\n\n");

          cost=(kwhaft-kwhbfr)*beban;
          aftppj=(cost*ppj/100);
        
        System.out.println("===================PLN "+klurah+"===================");
        System.out.printf("%-14s: %s\n","Nama", nm );
        System.out.printf("%-14s: %s\n","Kelurahan", klurah);
        System.out.printf("%-20s: %d%s\n", "Pemakaian bulan ini", (kwhaft-kwhbfr), " Kwh Meter");
        System.out.printf("%-14s: Rp %d%s\n", "Tarif listrik", cost,",-");
        System.out.printf("PPJ %d%%%8c Rp %d%s\n", ppj,':', aftppj, ",-");
        System.out.printf("%-14s: Rp %d%s\n", "Total bayar", (cost+aftppj), ",-");
        System.out.println("===============================================");

    }
}     


package Fr;
import java.util.Scanner; 
import java.util.ArrayList;
public class supanika {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<>();
        int pilihan;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Input Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Average");
            System.out.println("4. Sum");
            System.out.println("5. Max");
            System.out.println("6. Min");
            System.out.println("0. Keluar");
            System.out.print("Masukkan pilihan menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan nilai: ");
                    double nilai = sc.nextDouble();
                    data.add(nilai);
                    break;
                case 2:
                    System.out.print("\nData: ");
                    for (double d : data) {
                        System.out.print(d + " ");
                    }
                    System.out.println();
                    break;
                case 3:
                    if (data.size() > 0) {
                        double total = 0;
                        for (double d : data)
                            total += d;
                        System.out.println("\nRata-rata: " + (total / data.size()));
                    } else {
                        System.out.println("\nData kosong");
                    }
                    break;
                case 4:
                    double sum = 0;
                    for (double d : data)
                        sum += d;
                    System.out.println("\nJumlah: " + sum);
                    break;
                case 5:
                    if (data.size() > 0) {
                        double max = data.get(0);
                        for (double d : data)
                            if (d > max) max = d;
                        System.out.println("\nData Maksimum: " + max);
                    } else {
                        System.out.println("\nData kosong!");
                    }
                    break;
                case 6:
                    if (data.size() > 0) {
                        double min = data.get(0);
                        for (double d : data)
                            if (d < min) min = d;
                        System.out.println("\nData Minimum: " + min);
                    } else {
                        System.out.println("\nData kosong");
                    }
                    break;
                case 0:
                    System.out.println("\nKeluar dari program");
                    break;
                default:
                    System.out.println("\nPilihan tidak valid");
            }
        } while (pilihan !=7 && pilihan !=0);

        sc.close();
    }
}
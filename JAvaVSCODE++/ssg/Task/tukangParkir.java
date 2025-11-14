package ssg.Task;


import java.util.Scanner;

    public class tukangParkir {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("\n\n");
            double menitParkir = input.nextDouble();
            if (menitParkir <= 0){
                System.out.println("Misiiii input ga valid nih!!"); return;}

            input.nextLine();
            String kendaraan = input.nextLine();

            double jamParkir = menitParkir / 60;
            String keluar;
            double biayaParkir;

            
            if (!kendaraan.equalsIgnoreCase ("motor") && !kendaraan.equalsIgnoreCase("mobil"))
                keluar = "Jalan kaki tidak perlu bayar parkir";
            else {
              if (menitParkir <= 5 && menitParkir > 0){
                biayaParkir = 3000;
                System.out.printf("Biaya parkir %s hanya Rp%,.2f karena hanya %.1f menit", kendaraan, biayaParkir, menitParkir);
                System.exit(0);}
              else if (menitParkir <= 120)
                biayaParkir = 5000;
              else 
                biayaParkir = 5000 + ((menitParkir-120)/10)*2000; 

                keluar = "Biaya parkir " + kendaraan + " selama " + jamParkir + " jam adalah Rp " + String.format("%,.2f",biayaParkir);

            }
              System.out.println(keluar);

             input.close();



        }

    }
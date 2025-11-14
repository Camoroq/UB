package Fr;

import java.util.Scanner;
public class kereta {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int q=0;
        int et=0;
        int bt=0;
        int xt=0;
        int p=0;
        int menu=1;
        String[] train= {"Ekonomi", "Bisnis", "Eksekutif", "Pariwisata"};
        int price[][]={{50000, 2},{100000, 5},{200000, 7},{300000, 10}};
        String ft[][]={{"Tidak ada","Tidak ada"},{"Ada","Tidak ada"},{"Ada","Tidak ada"},{"Ada","Ada"}};

    while(menu!=0 && menu>=1 && menu<=5){
        System.out.println("\n1. Melihat Daftar Kereta Api");
        System.out.println("2. Melihat Daftar Kereta yang ada AC");
        System.out.println("3. Melihat Daftar Kereta yang ada Colokan");
        System.out.println("4. Memesan Tiket Kereta Api");
        System.out.println("5. Melihat Pesanan Tiket");
        System.out.println("0. Keluar");
        System.out.print("Masukkan nilai: ");
        menu=sc.nextInt();
        System.out.println();

            switch (menu){
                case 1:
            System.out.println("------------------------------------------------------");
            System.out.printf("%-11s%-11s%-11s%-11s%-11s\n","Jenis","Harga","Diskon","AC","Colokan");
            System.out.println("------------------------------------------------------");
            for (int i=0;i<4;i++){
                System.out.printf("%-11s%-11d%-11s%-11s%-11s\n",train[i],price[i][0],String.format("%d %%",price[i][1]),ft[i][0],ft[i][1]);
                System.out.println("------------------------------------------------------");
            } break;
                case 2:
            System.out.println("------------------------------------------------------");
            System.out.printf("%-11s%-11s%-11s%-11s%-11s\n","Jenis","Harga","Diskon","AC","Colokan");
            System.out.println("------------------------------------------------------");
            for (int i=1;i<4;i++){
                System.out.printf("%-11s%-11d%-11s%-11s%-11s\n",train[i],price[i][0],String.format("%d %%",price[i][1]),ft[i][0],ft[i][1]);
                System.out.println("------------------------------------------------------");
            } break;
                case 3:
            System.out.println("------------------------------------------------------");
            System.out.printf("%-11s%-11s%-11s%-11s%-11s\n","Jenis","Harga","Diskon","AC","Colokan");
            System.out.println("------------------------------------------------------");
            for (int i=3;i<4;i++){
                System.out.printf("%-11s%-11d%-11s%-11s%-11s\n",train[i],price[i][0],String.format("%d %%",price[i][1]),ft[i][0],ft[i][1]);
                System.out.println("------------------------------------------------------");
            } break;
                case 4:
            sc.nextLine();
            System.out.print("Tiket: ");
            String tik=sc.nextLine();
            tik=tik.toLowerCase();
                switch (tik){
                    case "ekonomi":
                    System.out.print("Jumlah tiket: ");
                    int t=sc.nextInt();
                    et+=t; System.out.println(); break;
                    case "bisnis":
                    System.out.print("Jumlah tiket: ");
                    t=sc.nextInt();
                    bt+=t; System.out.println(); break;
                    case "eksklusif":
                    System.out.print("Jumlah tiket: ");
                    t=sc.nextInt();
                    xt+=t; System.out.println(); break;
                    case "pariwisata":
                    System.out.print("Jumlah tiket: ");
                    t=sc.nextInt();
                    p+=t; System.out.println(); break;
                    default:
                    System.out.println("------------------------");
                    System.out.println("Tiket invalid");
                    System.out.println("------------------------\n"); break;
                } q++; break;
            case 5:
            if (q>0){
            System.out.println("------------------------");
            System.out.println("Tiket yang sudah dipesan");
            System.out.println("------------------------");
            System.out.println("Ekonomi    : "+et);
            System.out.println("Bisnis     : "+bt);
            System.out.println("Eksklusif  : "+xt);
            System.out.println("Pariwisata : "+p);
            System.out.println();
            } else {
            System.out.println("------------------------");
            System.out.println("Belum memesan tiket");
            System.out.println("------------------------\n");}break;
            default: break;
        }   
    } int totalEt = et * price[0][0];
    int totalBt = bt * price[1][0];
    int totalXt = xt * price[2][0];
    int totalP  = p  * price[3][0];
    int diskonEt = totalEt * price[0][1] / 100;
    int diskonBt = totalBt * price[1][1] / 100;
    int diskonXt = totalXt * price[2][1] / 100;
    int diskonP  = totalP  * price[3][1] / 100;

    int grandTotal =
        (totalEt - diskonEt) +
        (totalBt - diskonBt) +
        (totalXt - diskonXt) +
        (totalP  - diskonP);

        System.out.println("\n================== TOTAL PEMESANAN ==================");
    System.out.println("Jenis\t\tJumlah\tHarga\tSubtotal\tDiskon (%)\tDiskon");
    System.out.println("-----------------------------------------------------");
    System.out.printf("Ekonomi\t\t%d\t%d\t%d\t\t%d%%\t\t%d\n", 
        et, price[0][0], totalEt, price[0][1], diskonEt);
    System.out.printf("Bisnis\t\t%d\t%d\t%d\t\t%d%%\t\t%d\n", 
        bt, price[1][0], totalBt, price[1][1], diskonBt);
    System.out.printf("Eksekutif\t%d\t%d\t%d\t\t%d%%\t\t%d\n", 
        xt, price[2][0], totalXt, price[2][1], diskonXt);
    System.out.printf("Pariwisata\t%d\t%d\t%d\t\t%d%%\t\t%d\n", 
        p, price[3][0], totalP, price[3][1], diskonP);
    System.out.println("-----------------------------------------------------");
    System.out.printf("Total yang harus dibayar:\t%d\n", grandTotal);
    System.out.println("=====================================================");
    }

}

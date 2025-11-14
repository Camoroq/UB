package ssg.Task;

import java.util.Scanner;
public class java{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        double hasil=0,nilai1=0;
        boolean kondisi=true;
        while (kondisi){
            int operator=sc.nextInt();
            switch(operator){
                case 1:
                    nilai1=sc.nextDouble();
                    hasil+=nilai1;
                    break;
                case 2:
                    nilai1=sc.nextDouble();
                    hasil-=nilai1;
                    break;
                case 3:
                    nilai1=sc.nextDouble();
                    hasil*=nilai1;
                    break;
                case 4:
                    nilai1=sc.nextDouble();
                    hasil/=nilai1;
                    break;
                case 0:
                    kondisi=false;
                    if (hasil %1==0){
                    System.out.printf("Hasil akhir: %.1f\n",hasil);}
                    else{System.out.println("Hasil akhir: "+hasil);}
                    System.out.println("Kalkulator dimatikan");
                    break;
                default:
                    System.out.println("Opsi tidak ditemukan");
                    
                
            }
        }
    }
}
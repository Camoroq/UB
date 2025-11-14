package ssg.CaseBase;

import java.util.Scanner;
public class Menu{
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        int hg, a,js=0,b,c,d,kd,jml;
        int tlhg,lg=1;
        kd=sc.nextInt();
        while (lg==1){lg=sc.nextInt();
        switch (kd){
            case 1:
            System.out.println("Nsg");
            System.out.print("Jml"); jml=sc.nextInt();
            js++;
            hg=15000;break;
            case 2:
            System.out.println("Aym");
            System.out.print("Jml"); jml=sc.nextInt();
            js++;
            hg=25000;break;
            case 3:
            System.out.println("Sto");
            System.out.print("Jml"); jml=sc.nextInt();
            js++;
            hg=12000;break;
            case 4:
            System.out.println("Est");
            System.out.print("Jml"); jml=sc.nextInt();
            hg=5000;break;
            case 5:
            System.out.println("Esj");
            System.out.print("Jml"); jml=sc.nextInt();
            hg=7000;
            break;
            default: System.out.println("Kode invalid");break;

            
        } 
    }
    }
}

package ssg.PraktikumBP;
import java.util.Scanner;
public class Practice5{
    public static void main (String[] args){
        Scanner sc= new Scanner (System.in);
        int id=sc.nextInt();
        int n=sc.nextInt();
        int[] arr= new int [n];
        sc.nextLine();
        for (int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        StringBuilder pesan=new StringBuilder();
        int invalid[]= new int[n];
        int ci=0;
        for (int i=0; i<n; i++){
            if (arr[i]>=id && arr[i]<=id +25){
                pesan.append((char) ('A'+ (arr[i]-id)));
            } else if (arr[i]>id+25){
                pesan.append(" ");
            } else { invalid[ci]=arr[i]; //0,1,2
            ci++;}
        } 
        
        System.out.println ("Output pesan: " + pesan.toString().toUpperCase()   );
        if (ci>0){
            System.out.print("Elemen tidak valid ditemukan: ");
            for (int i=0;i<ci;i++){
                System.out.print(invalid[i]);
               if(i<ci-1) {System.out.print(", ");}
        
            }
        }
        }
        
        
    }

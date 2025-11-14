package Fr;
import java.util.Scanner;
public class sixseven{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int [n];
        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int freq=0;
        int mod=0;
        //

        
    for (int i=0;i<n;i++){
        int cant=a[i];
        int freqa=0;
        for (int j=0;j<n;j++){
            if(a[j]==cant){
                freqa++;
            }}
  
        if (freqa>freq){
            freq=freqa;
            mod=cant;
        }
        else if (freqa==freq){
            if(cant<mod){
                mod=cant;
            }
        }
        
    }
        System.out.println("Nilai: "+mod);
        System.out.println("Frekuensi: "+freq);
        System.out.print("Indeks: ");
        for (int i=0;i<n;i++){
            if(a[i]==mod){
            System.out.print(i+" ");
             } }
    }
}
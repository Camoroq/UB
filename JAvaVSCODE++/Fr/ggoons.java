
package Fr;
import java.util.Scanner;
public class ggoons {
         public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]= new int[n];
        double b=0;

        for (int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }
        int m=a[0];
    for(int i=1;i<n;i++){
        if(a[i]>m){
            m=a[i];
        }    
    }
    for(int i=0;i<n;i++){
        b += a[i];
    }
        double r= b/n;
    System.out.printf("Rata-rata: %.2f\n",r);
    System.out.printf("Maksimum: %d",m);
        
    }
}

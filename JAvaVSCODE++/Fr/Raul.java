package Fr;
import java.util.Scanner;
public class Raul {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int t=0;

        for (int i=0;i<n;i++){
            a[i]=sc.nextInt();}

        for (int i=1;i<n;i++){
            if (a[i]==a[i-1]){
                t++;
            }
        }
        
System.out.println("Anunya: "+t);
    }
}

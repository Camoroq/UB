package ssg.Task;


import java.util.Scanner;
public class Aw {
    public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.print("N: ");
    int n=sc.nextInt();
    for (int i=1; i<=n; i++){
        for (int b=n; b>i;b--){
            System.out.print("  ");
        }
        for (int j=1;j<=i;j++){
            System.out.print("* ");
        }
        System.out.println("");
    }
    }
}

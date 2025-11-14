package Fr;
import java.util.Scanner;
public class utpp {
    public static void main (String[]args){
    Scanner sc=new Scanner (System.in);
        char b= sc.next().charAt(0);
        String s="gae";
        String u="dih";
        System.out.println(s.concat(u));
        System.out.println(s.toUpperCase());
        System.out.println(s.concat(u));
        System.out.println(s.concat(u));

        if(s.equals("dih")){}

        System.out.println(s.replaceAll("g", "8"));
        System.out.println(" dih tectira");

        
    }
    
}

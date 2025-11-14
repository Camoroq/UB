package Fr;
import java.util.Scanner;
public class oil {

     // Return type: int (method akan mengembalikan angka bulat)
    public int tambah(int a, int b) {
        return a + b;  // harus return int
    }
    
    // Return type: String (method akan mengembalikan teks)
    public String gabung(String kata1, String kata2) {
        return kata1 + " " + kata2;  // harus return String
    }
    
    // Return type: double (method akan mengembalikan desimal)
    public double bagi(double a, double b) {
        return a / b;  // harus return double
    }
    
    
   
    public static void main(String[] args) {
        oil obj = new oil();
        
        // Java sudah tahu hasilnya int
        int hasil1 = obj.tambah(5, 3);
        
        // Java sudah tahu hasilnya String
        String hasil2 = obj.gabung("Halo", "Dunia");
        
        // Java sudah tahu hasilnya double
        double hasil3 = obj.bagi(10.0, 3.0);
    }
}
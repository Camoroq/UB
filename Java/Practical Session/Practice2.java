import java.util.*;
public class Practice2 {
    public static void main (String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.printf("Menu:\n");
        System.out.printf("1. menghitung luas dan keliling persegi panjang\n");
        System.out.printf("2. menghitung luas dan keliling lingkaran\n");
        System.out.printf("3. menghirung luas dan keliling segitiga\n");

        String code="";
        double k=0;
        double L=0;
        int key=1;

        while (key==1||key==2||key==3){
        System.out.print("\nPilihan anda: ");
        key=sc.nextInt();
        switch(key){
            case 1:
                code="Persegi panjang";
                System.out.print("Masukkan p: ");
                float p=sc.nextFloat();
                System.out.print("Masukkan l: ");
                float l=sc.nextFloat();
                k=2*(p+l);
                L=p*l;
                break;

            case 2:
                code="Lingkaran";
                System.out.print("Masukkan r: ");
                float r=sc.nextFloat();
                k=2*Math.PI*r;
                L=Math.PI*Math.pow(r,2);
                break;

            case 3:
                code="Segitiga";
                System.out.print("Masukkan a");
                float a=sc.nextFloat();
                System.out.print("Masukkan b");
                float b=sc.nextFloat();
                System.out.print("Masukkan c (alas)");
                float c=sc.nextFloat();
                k=a+b+c;
                double t= Math.sqrt(Math.pow(a,2)-Math.pow(c/2,2));
                L=1/2*c*t;
                break;
            
            default:
                System.out.println("Data tak ditemukan, program dihentikan...");
                return;
        }

        System.out.printf("Keliling %-16s : %.2f\n",code,k);
        System.out.printf("Luas %-20s : %.2f\n",code,L);
        }

    }
    
}

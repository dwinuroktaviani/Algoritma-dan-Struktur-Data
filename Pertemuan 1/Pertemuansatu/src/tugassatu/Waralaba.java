
package tugassatu;

import java.util.Scanner;

public class Waralaba {
    public static int pilihan,
            cA = 12000,
            cB = 15000,
            cC = 20000,
            oA = 10000,
            oB = 12000,
            oC = 15000;
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Waralaba w = new Waralaba();
        System.out.println("Masukkan Pilihan Anda :");
        System.out.println("1.Paket Chicken  :");
        System.out.println("2.Paket Oke :");
        w.pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
                System.out.println("1.Chicken A = Rp 12.000");
                System.out.println("2.Chicken B = Rp 15.000");
                System.out.println("3.Chicken C = Rp 12.000");
                int total = cA + cB + cC;
                System.out.println("Total Pembayaran: " + total);
            break;
            case 2:
                System.out.println("1.Oke A = Rp 10.000");
                System.out.println("2.Oke B = Rp 12.000");
                System.out.println("3.Oke C = Rp 15.000");
               int total2 = oA + oB + oC;
                System.out.println("Total Pembayaran: " + total2);
            break;
            default:
                System.out.println("Nomor yang anda masukkan salah");
        }
        
    }
    
}

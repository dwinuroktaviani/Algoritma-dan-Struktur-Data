
package js3;

import java.util.Scanner;

public class MainPangkat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        Pangkat[] png = new Pangkat[elemen];
        for (int i = 0; i < elemen; i++) {
            png[i] = new Pangkat(i, i);
            System.out.print("Masukkan nilai yang akan dipangkatkan " + (i+1) + " : ");
            png[i].nilai = sc.nextInt();
            System.out.print("Masukkan nilai pemangkat ke- " + (i+1) + " : ");
            png[i].pangkat = sc.nextInt();
            
        }
        System.out.println("Menu :");
        System.out.println("1. Brute Force \n2.Devide Conquer");
        System.out.println("Masukkan Metode yang ingin digunakan :");
        int pilihan = sc.nextInt();
        
        
        switch(pilihan){
            case 1:
                System.out.println("=============================================");
                System.out.println("Hasil pemangkatan dengan Brute Force : ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " +png[i].pangkat +" adalah "+ png[i].pangkatBF(png[i].nilai,png[i].pangkat ));
                }
            break;
            case 2:
                        System.out.println("=============================================");
                System.out.println("Hasil faktorial dengan Devide Conquer : ");
                 for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " +png[i].pangkat +" adalah "+ png[i].pangkatDC(png[i].nilai,png[i].pangkat ));
                }
            break;
            default:
            
        }
        
        
        
        
    }
    
}

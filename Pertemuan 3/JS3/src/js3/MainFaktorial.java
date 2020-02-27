
package js3;

import java.util.Scanner;

public class MainFaktorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung : ");
        int elemen = sc.nextInt();
        
        faktorial[] fk = new faktorial[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new faktorial();
            System.out.print("Masukkan nilai data ke-" + (i+1) + " : ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("=============================================");
        System.out.println("Hasil faktorial dengan Brute Force : ");
        for (int i = 0; i < elemen; i++) {
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialBF(fk[i].nilai));
        }
        System.out.println("=============================================");
        System.out.println("Hasil faktorial dengan Devide Conquer : ");
        
        int i = 0;
        while (i < elemen) {            
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah : " + fk[i].faktorialDC(fk[i].nilai));
            i++;
        }
    }
        
    }
    


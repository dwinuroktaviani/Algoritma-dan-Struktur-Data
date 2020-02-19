
package task;

import java.util.Scanner;

public class Lingkaran {
    double PHI = 3.14;
    double r;
    
    public double hitungLuas(){
        double luas = PHI * r * r;
        return luas;
    }
    public double hitungKeliling(){
        double keliling = 2 * PHI * r;
        return keliling;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Lingkaran l = new Lingkaran();
        
        System.out.println("Masukkan Jari-Jari");
        l.r = sc.nextDouble();
        
        System.out.println("Luas nya adalah : " + l.hitungLuas());
        System.out.println("Keliling adalah : " + l.hitungKeliling());
    }
    
}

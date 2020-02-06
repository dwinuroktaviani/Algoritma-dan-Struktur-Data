
package tugaslima;

import java.util.Scanner;
import tugassatu.Waralaba;

public class Luas {
    public static int pilihan;
    public static int alas,tinggi,sisi,jari2; 
    
    public int hitungLuasSegitiga(){
                int luas = (int) (0.5 * alas * tinggi);
                return luas;
    }
    public int hitungLuasSegiempat(){
                int luas2 = sisi * sisi;
                return luas2;
    }
    public int hitungLuasLingkaran(){
                      int luas3 = (int) (3.14 * jari2 * jari2);
                      return luas3;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Luas l = new Luas();
        System.out.println("1.Menghitung Luas segitiga");
        System.out.println("2.Menghitung Luas segiempat");
        System.out.println("3.Menghitung Luas lingkaran");
        System.out.println("Masukkan Pilihan Anda");
        l.pilihan = sc.nextInt();
        switch(pilihan){
            case 1 :
                System.out.println("Masukkan Alas");
                l.alas = sc.nextInt();
                System.out.println("Masukkan Tinggi");
                l.tinggi = sc.nextInt();
                System.out.println("Luas Segitiga = " + l.hitungLuasSegitiga());
                break;
            case 2:
                System.out.println("Masukkan Sisi ");
                l.sisi = sc.nextInt();
                System.out.println("Luas SegiEmpat" + l.hitungLuasSegiempat());
                break;
            case 3:
                System.out.println("Masukkan jari-jari");
                l.jari2 = sc.nextInt();
                System.out.println("Luas Lingkaran = " + l.hitungLuasLingkaran());
                break;
            default:
                System.out.println("Nomor yang anda masukkan salah");        
        }
    }
    
}

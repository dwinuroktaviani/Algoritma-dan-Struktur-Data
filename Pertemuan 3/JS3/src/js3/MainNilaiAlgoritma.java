
package js3;

import java.util.Scanner;

public class MainNilaiAlgoritma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        System.out.print("Masukkan jumlah Mahasiswa : ");
        a = sc.nextInt();
       NilaiAlgoritma[] n = new NilaiAlgoritma[a];

        for (int i = 0; i < a; i++) {
        n[i] = new NilaiAlgoritma();
        System.out.print("Masukkan Nama: ");
        n[i].namaMhs = sc.next();
        System.out.print("Masukkan Nilai Tugas :");
        n[i].nilaiTugas = sc.nextInt();
        System.out.print("Masukkan Nilai Kuis : ");
        n[i].nilaiKuis = sc.nextInt();
        System.out.print("Masukkan Nilai UTS ");
        n[i].nilaiUTS = sc.nextInt();
        System.out.print("masukkan nilai UAS :");
        n[i].nilaiUAS = sc.nextInt();
        }
        int i = 0;
        while (i < a) {            
            System.out.println("Nilai Akhir mahasiswa ke " + i+ " adalah : " + n[i].hitungTotalNilai(n[i].nilaiUAS,n[i].nilaiUTS,n[i].nilaiTugas, n[i].nilaiKuis));
            i++;
           
        }
        NilaiAlgoritma b = new NilaiAlgoritma();
        for (int j = 0; j < a; j++) {
            System.out.println("Nilai mahasiswa ke " + i );
           // System.out.println(n[i].hitungTotalNilai(n[i].nilaiUAS,n[i].nilaiUTS,n[i].nilaiTugas, n[i].nilaiKuis)); 
           n[i].total = (int) n[i].hitungTotalNilai(n[i].nilaiUAS,n[i].nilaiUTS,n[i].nilaiTugas, n[i].nilaiKuis);
            
        }
        System.out.println("Rata " + b.rataBF(a));

    }
    
}

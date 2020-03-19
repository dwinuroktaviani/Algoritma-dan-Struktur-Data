
package testsearching;

import java.util.Scanner;

public class SearchingMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int data[] = {10,30,40,50,60,70,80,90};
       
        Searching pencarian = new Searching(data, 8);
        System.out.println("Isi Array : ");
        pencarian.TampilData();
        int cari = 30;
        System.out.println("Menggunakan sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);   
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("==============================");
        System.out.println("Menggunakan Binary Search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length -1);
        pencarian.Tampilposisi(cari, posisi);
        
        if (posisi != -1) {
            System.out.println("data : " + cari + "ditemukan pada indeks " + posisi);
        }
        else{
            System.out.println("data " + cari + "tidak ditemukan");
        } 
    }
}


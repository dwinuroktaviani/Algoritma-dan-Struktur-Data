
package task;

import java.util.Scanner;

public class Peminjaman {
    int id,lama,harga;
    String nama_member,nama_game;
    
    public int hitungTotal(){
        int total = lama * harga;
        return total;
    }
    
    public void TampilData(){
        System.out.println("Id Pembeli \t:" + id);
        System.out.println("Nama Member \t:" + nama_member);
        System.out.println("Nama Game \t:" + nama_game);
        System.out.println("Lama \t\t:" + lama);
        System.out.println("Tarif \t\t:" + harga);
        System.out.println("Total Bayar \t:" + hitungTotal());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Peminjaman p = new Peminjaman();
        System.out.println("Masukkan Id Member :");
        p.id = sc.nextInt();
        System.out.println("Masukkan Nama Member :");
        p.nama_member = sc.next();
        System.out.println("Masukkan Nama Game :");
        p.nama_game = sc.next();
        System.out.println("Masukkan Lama Pinjam :");
        p.lama = sc.nextInt();
        System.out.println("Masukkan Harga : ");
        p.harga = sc.nextInt();

        p.TampilData();
        
        
    }
    
}

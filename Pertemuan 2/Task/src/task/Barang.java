
package task;

import java.util.Scanner;

public class Barang {
    String nama;
    int jumlah,hargaSatuan;
    
    public int hitungHargaTotal(){
        return hargaSatuan * jumlah;
    }
     public void TampilBarang(){
        System.out.println("Nama\t\t:" + nama);
        System.out.println("Harga Barang Persatuan :" + hargaSatuan);
        System.out.println("Jumlah : "  + jumlah);
        System.out.println("Total Bayar = " + hitungDiskon());
    }
    public int hitungDiskon(){
        if (hitungHargaTotal() > 100000) {
          jumlah = (int) (hitungHargaTotal() * 0.1);
        }
        else if (hitungHargaTotal() >= 50000 && hitungHargaTotal() <= 100000) {
            jumlah= (int) (hitungHargaTotal() * 0.05);
        }
        else{
            jumlah = hitungHargaTotal();
        }
        return jumlah;
    }
    public int hitungHargaBayar(){
        return hitungHargaTotal() - hitungDiskon();
        
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Barang b = new Barang();
        b.hargaSatuan = 50000;
        System.out.println("Masukkan Nama :");
        b.nama = sc.next();
        System.out.println("Masukkan jumlah :");
        b.jumlah = sc.nextInt();
        b.TampilBarang();
        
    }
    
}

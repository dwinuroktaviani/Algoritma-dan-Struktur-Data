
package task;

import java.util.Scanner;

public class Tanah {
    public int panjang,lebar,jumlah;
    
    public int hitungLuas(){
        return panjang * lebar;
    }

    public Tanah() {
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Masukkan Jumlah Tanah");
        n = sc.nextInt();
        Tanah[] tnArray = new Tanah[n];
        
        for (int i = 0; i < n; i++) {
        tnArray[i] = new Tanah();
        System.out.println("Tanah " + i);
        System.out.println("Masukkan Panjang: ");
        tnArray[i].panjang = sc.nextInt();
        System.out.println("Masukkan Lebar:");
        tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah : " + i + " = " + tnArray[i].hitungLuas());
            
        }
    }
}

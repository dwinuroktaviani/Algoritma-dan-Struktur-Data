
package task;

import java.util.Scanner;

public class Nilai {
    public int jumlah,nilai1,nilai2;
    
    public int nilaiTerbaik(){
        if (nilai1 > nilai2) {
            return nilai1;
        }
        else{
           return nilai2; 
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah;
        
        System.out.println("Jumlah Mahasiswa : ");
        jumlah = sc.nextInt();
        Nilai[] NilArray = new Nilai[jumlah];
        
        for (int i = 0; i <  jumlah; i++) {
            NilArray[i] = new Nilai();
            System.out.println("Mhs" + i);
            System.out.println("Nilai 1 :");
            NilArray[i].nilai1 = sc.nextInt();
            System.out.println("Nilai 2 :");
            NilArray[i].nilai2 = sc.nextInt();
        }
        
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai terbaik Mhs " + i + ":" +NilArray[i].nilaiTerbaik());
        }
    }
    
}

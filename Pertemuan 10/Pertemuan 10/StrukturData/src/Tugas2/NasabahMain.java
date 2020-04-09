
package Tugas2;

import java.util.Scanner;

public class NasabahMain {
    static void menu(){
        System.out.println("Pilih Operasi Yang ingin dilakukan"); 
        System.out.println("1. Enqueue"); 
        System.out.println("2. Dequeue"); 
        System.out.println("3. Print "); 
        System.out.println("4. Print Front"); 
        System.out.println("5. Print Rear"); 
        System.out.println("6. Print Data Position"); 
        System.out.println("7. Print Data by Position"); 
        System.out.println("8. Keluar"); 
        System.out.print("Pilihlah : ");
    }
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); int pil = 0;
        System.out.print("Masukkan Jumlah Maksimal Antrian: "); 
        int m = sc.nextInt();
        
        Queue q = new Queue(m); do{
            menu();
            pil = sc.nextInt();
            switch(pil){
                case 1:
                    System.out.print("Masukkan nama baru: ");
                    String nama = sc.next();
                    System.out.print("Masukkan No Rekening baru: ");
                    String noRekening = sc.next();
                    Nasabah na = new Nasabah(noRekening, nama);
                    q.enqueue(na);
                    break;
                case 2: 
                    Nasabah out = q.dequeue();
                break;
                case 3: 
                    q.print();
                    break;
                case 4 : 
                    q.printFront();
                    break;
                case 5 : 
                    q.printRear();
                    break;
                case 6 : 
                    System.out.println("Input Nama Nasabah : ");
                    String nm = sc.next();
                    q.printPosition(nm);
                    break;
                case 7 : 
                    System.out.println("Input Position :");
                    int pos = sc.nextInt();
                    q.printNasabah(pos);
            }
        } while(pil!=8);
    }
}
 


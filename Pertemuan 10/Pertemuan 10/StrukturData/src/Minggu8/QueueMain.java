
package Minggu8;

import java.util.Scanner;

public class QueueMain {
    static void menu(){
        System.out.println("Pilih Operasi yang diinginkan"); 
        System.out.println("1. Enqueue"); 
        System.out.println("2. Dequeue"); 
        System.out.println("3. Print "); 
        System.out.println("4. Keluar");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("-----------------------------");
    }
    
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        int pilih = 0;
        System.out.print("Masukkan Jumlah Maksimal Antrian :");
        int n = sc.nextInt();
        Queue Q = new Queue(n);
        do{
            menu();
            pilih = sc.nextInt();
            switch(pilih){
                case 1: 
                System.out.print("Masukkan data baru: ");
                int dataMasuk = sc.nextInt();
                Q.enqueue(dataMasuk);
                break;
                case 2: 
                    int dataKeluar = Q.dequeue();
                if(dataKeluar!= 0){
                    System.out.println("Data yang Dikeluarkan = " + dataKeluar);
                }
                break;
                case 3: 
                    Q.print();
                break;
                case 4 :
                    Q.peek();
                    break;
                case 5 :
                    Q.peekRear();
                    break;
                case 6 :
                    System.out.println("Input Data : "); 
                    int data = sc.nextInt(); 
                    Q.peekPosition(data);
                    break;
                case 7 :
                    System.out.println("Input Position :");
                    int pos = sc.nextInt();
                    Q.peekAt(pos);
                    
            }
        } while(pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
    }
}

    


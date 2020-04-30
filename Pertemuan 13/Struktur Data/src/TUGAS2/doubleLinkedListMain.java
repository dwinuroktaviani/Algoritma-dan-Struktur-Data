package TUGAS2;

import java.util.Scanner;

public class doubleLinkedListMain {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        doubleLinkedList dl = new doubleLinkedList();
        do{
                System.out.println("\n Double Link List Dengan Menu");
                System.out.println("================================");
                System.out.println("Silahkan pilih");
                System.out.println("1. Tambah awal"); 
                System.out.println("2. Tambah akhir"); 
                System.out.println("3. Tambah data indeks tertentu"); 
                System.out.println("4. Hapus awal"); 
                System.out.println("S. Hapus akhir"); 
                System.out.println("6. Hapus indeks tertentu"); 
                System.out.println("7. Cetak data"); 
                System.out.println("8. Cari"); 
                System.out.println("9. Bubble Sort"); 
                System.out.println("10. Keluar");
                System.out.println("================================");
                
                System.out.print("\n PILIHAN ANDA : ");
                int pilih = sc.nextInt();
                System.out.println("================================");
                if(pilih == 1){
                    System.out.print("Masukkan Data : ");
                    int m = sc.nextInt();
                    dl.addFirst(m);
                }
               else if (pilih == 2) {
                    System.out.print("masukkan Data : ");
                       int l = sc.nextInt();
                       dl.addLast(l);
                  }
                else if(pilih == 3){
                    System.out.print("masukkan Data : ");
                       int d = sc.nextInt();
                       System.out.println("Masukkan Indeks : ");
                       int i = sc.nextInt();
                       dl.add(d, i);
                       }
                else if(pilih == 4){
                       dl.removeFirst();
                       System.out.println("Data Awal Di Hapus");
                }
               else if(pilih == 5){
                       dl.removeLast();
                       System.out.println("Data Akhir Di Hapus");
                }
               else if(pilih == 6 ){
                       System.out.println("Masukkan index : ");
                       int n = sc.nextInt();
                       dl.remove(n);
                       }
               else if(pilih == 7){
                       dl.print();
                       }
               else if(pilih == 8){
                       System.out.println("Data yang akan di cari :");
                       int c = sc.nextInt();
                       int hasil = 0;
                       if (dl.get(c) == -1) {
                       System.out.println("DATA TIDAK ADA ");
                       }
                       else{
                        for (int i = 0; i < dl.get(c); i++) {
                        hasil = dl.get(c);
                       }
                       System.out.println("DATA :" + c + "berada di indeks ke : " + hasil);
                    }
                       }
               else if(pilih == 9){
                       dl.sort();
                       dl.printSort();
               }
               else if(pilih == 10){
                       System.exit(0);
                       }
    }
    while(true);              
}           
}

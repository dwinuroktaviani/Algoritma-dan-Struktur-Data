
package TUGAS3;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        try {
            Mahasiswa m = new Mahasiswa();
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            int pilihan,nilai;
            String nama;
            do {                
                System.out.println(" ");
                System.out.println("MENU : ");
                System.out.println("=================");
                System.out.println("1.Add First");
                System.out.println("2.Add Last");
                System.out.println("3.Add By Index");
                System.out.println("4.Delete First");
                System.out.println("5.Delete Last");
                System.out.println("6.Delete by Index");
                System.out.println("7.Urutkan berdasarkan Desc");
                System.out.println("8.Urutkan berdasarkan Ascending");
                System.out.println("9.Print Data");
                System.out.println("10.Keluar");
                System.out.println("==================================");
                System.out.println(">> ");
                pilihan = sc.nextInt();
                System.out.println("==================================");
                switch(pilihan){
                    case 1:
                        System.out.println("Masukkan data Pertama");
                        System.out.println("Masukkan nama : ");
                        nama = sc1.next();
                        System.out.println("Masukkan nilai : ");
                        nilai = sc.nextInt();
                        m.addFirst(nama, nilai);
                        break;
                    case 2: 
                        System.out.println("Masukkan data terakhir");
                        System.out.println("Masukkan nama : ");
                        nama = sc1.next();
                        System.out.println("Masukkan nilai : ");
                        nilai = sc.nextInt();
                        m.addLast(nama, nilai);
                        break;
                    case 3:
                        System.out.println("Masukkan data berdasarkan index");
                        System.out.println("Masukkan nama : ");
                        nama = sc1.next();
                        System.out.println("Masukkan nilai : ");
                        nilai = sc.nextInt();
                        System.out.println("Masukkan Indeks data : ");
                        int index = sc.nextInt();
                        m.add(nama, nilai, index);
                        break;
                    case 4 :
                        m.removeFirst();
                        break;
                    case 5:
                        m.removeLast();
                        break;
                    case 6:
                        System.out.println("Masukkan Indeks Data : ");
                        index = sc.nextInt();
                        m.remove(index);
                        break;
                    case 7:
                        System.out.println("Urutan Berdasar Descending");
                        m.sortDesc();
                        m.print();
                        break;
                    case 8 :
                        System.out.println("Urutan Berdasar Ascending");
                        m.sortAsc();
                        m.print();
                        break;
                    case 9:
                        m.print();
                        break;
                    case 10:
                        System.exit(0);
                        break;
                }
            } while (pilihan < 11);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}

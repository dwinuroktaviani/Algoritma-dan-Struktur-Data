
package TUGAS1;

import java.util.Scanner;

public class doubleLinkedListMain {
    static void menu() {
        System.out.println("DOUBLE LINK LIST DENGAN MENU");
        System.out.println("==============================");
        System.out.println("Memilih menu");
        System.out.println("1. Tambah Awal");
        System.out.println("2. Tambah Akhir");
        System.out.println("3. Tambah Data Indeks Tertentu");
        System.out.println("4. Hapus Awal");
        System.out.println("5. Hapus Akhir");
        System.out.println("6. Hapus Indeks Tertentu");
        System.out.println("7. Cetak Data");
        System.out.println("8. Cari");
        System.out.println("10. Keluar");
        System.out.println("==============================");
        System.out.print(">> ");
    }

    public static void main(String[] args) {
        int menu = 0;
        Scanner sc = new Scanner(System.in);
        doubleLinkedList dl = new doubleLinkedList();
        try {
            do {
                menu();
                menu = sc.nextInt();

                System.out.println("==============================");
                System.out.println();
                switch (menu) {
                    case 1: {
                        System.out.print("Masukkan data :");
                        dl.addFirst(sc.nextInt());
                        System.out.println();
                        break;
                    }
                    case 2: {
                        System.out.print("Masukkan data :");
                        dl.addLast(sc.nextInt());
                        System.out.println();
                        break;
                    }
                    case 3: {
                        int val, index;
                        System.out.print("Masukkan data : ");
                        val = sc.nextInt();
                        System.out.print("Masukkan Posisi indeks data : ");
                        index = sc.nextInt();
                        dl.add(val, index);
                        System.out.println();
                        break;
                    }
                    case 4: {
                        dl.removeFirst();
                        System.out.println("Data awal dihapus!!");
                        System.out.println();
                        break;
                    }
                    case 5: {
                        dl.removeLast();
                        System.out.println("Data akhir dihapus !!");
                        System.out.println();
                        break;
                    }
                    case 6: {
                        int index;
                        System.out.print("Hapus Posisi indeks data ke : ");
                        index = sc.nextInt();
                        dl.remove(index);
                        System.out.println();
                        break;
                    }
                    case 7: {
                        dl.print();
                        break;
                    }
                    case 8: {
                        System.out.print("Masukkan data yang ingin dicari: ");
                        dl.getKey(sc.nextInt());
                        System.out.println();
                        break;
                    }
                }
            } while (menu != 9);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
       


package kuis2;

import java.util.Scanner;

public class Main {
  
    static void menuTambah() {
        System.out.println("+ Menu Tambah+");
        System.out.println("1. Add First");
        System.out.println("2. Add Index");
        System.out.println("3. Add Last");
        System.out.println("4. Print");
        System.out.println("+	+");
        System.out.print("Masukkan pilihan : ");
        }
    public static void main(String[] args) {
        LinkedList data = new LinkedList();
        Scanner sc = new Scanner (System.in);
        int pilih,sub,idx;
        int thn18,th19,thn20;
        
         for (int i = 1; i <=12;i++) {
            System.out.println("Bulan ke- : " + i);
            try {
            do{
                menuTambah();
                pilih = sc.nextInt();
                    switch(pilih){
                         case 1 :
                             System.out.println("Masukkan Data 2018 : ");
                             thn18 = sc.nextInt();
                             System.out.println("Masukkan Data 2019 : ");
                             th19 = sc.nextInt();
                             System.out.println("Masukkan Data 2020 : ");
                             thn20 = sc.nextInt();
                             System.out.println("=======================");
                             data.addFirst(thn18,th19,thn20);
                             data.print();
                             break;
                         case 2 :
                            System.out.println("Masukkan Data 2018 : ");
                             thn18 = sc.nextInt();
                             System.out.println("Masukkan Data 2019 : ");
                             th19 = sc.nextInt();
                             System.out.println("Masukkan Data 2020 : ");
                             thn20 = sc.nextInt();
                             System.out.println("Masukkan Index :  ");
                             idx = sc.nextInt();
                             System.out.println("=========================");
                             data.add(thn18, th19, thn20, idx);
                             break;
                         case 3 :
                             System.out.println("Masukkan Data 2018 : ");
                             thn18 = sc.nextInt();
                             System.out.println("Masukkan Data 2019 : ");
                             th19 = sc.nextInt();
                             System.out.println("Masukkan Data 2020 : ");
                             thn20 = sc.nextInt();
                             data.addLast(thn18,th19,thn20);
                             data.print();
                             break;
                        case 4:
                               System.out.println("=========================");
                               data.print();
                               break;
                        default:
                                System.out.println("Pilihan tidak tersedia ");
                        }
                        break;
            } while (pilih != 5);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        }
    }
}
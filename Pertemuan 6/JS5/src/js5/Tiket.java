
package js5;

import java.util.Scanner;

public class Tiket {
    Tiket t[] = new Tiket[5];

    String maskapai;
    int jumlah;
    float harga;
    int flighTime;
    int transitCount;
    int idx;

    public Tiket() {
    }
    
    
    
    void tambah(Tiket m){
        if (idx < t.length) {
            t[idx] = m;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh !!");
        } 
    }

    public Tiket(String maskapai, float harga, int flighTime, int transitCount) {
        this.maskapai = maskapai;
        this.harga = harga;
        this.flighTime = flighTime;
        this.transitCount = transitCount;
    }

    void tampil(){
        System.out.println("Nama : " + maskapai);
        System.out.println("Harga: " +  harga);
        System.out.println("Flight Time : " + flighTime);
        System.out.println("Transit Count : " + transitCount);
    }
    
    public void bublesort(){
        for (int i = 0; i < t.length-1; i++) {
            for (int j = 1; j <t.length-i; j++) {
                if (t[j].harga < t[j-1].harga) {
                    Tiket tmp = t[j];
                    t[j] = t[j-1];
                    t[j-1] = tmp;
                }
            }
        }
        for(Tiket m : t){
            m.tampil();
            System.out.println("------------------");
        }
    }
    
    void selectionsort(){
        for (int i = 0; i < t.length-1; i++) {
            int idxMin = i;
            for (int j = i+1; j < t.length; j++) {
                if (t[j].harga < t[idxMin].harga) {
                    idxMin = j;
                }
            }
            Tiket tmp = t[idxMin];
            t[idxMin] = t[i];
            t[i] = tmp;
        }
        
        for(Tiket m : t){
            m.tampil();
            System.out.println("------------------");
        }
    }
    
    public static void main(String[] args) {
      Scanner  s = new Scanner(System.in);
      Tiket t = new Tiket();
      int jumtik = 5; 
        for (int i = 0; i < jumtik; i++) {
            System.out.print("Maskapai : ");
            String maskapai = s.next();
            System.out.print("Harga : " );
            float harga = s.nextFloat();
            System.out.print("Flight : ");
            int flight = s.nextInt();
            System.out.print("Transit Count : ");
            int transit = s.nextInt();
            Tiket ti = new Tiket(maskapai, harga, flight, transit);
            t.tambah(ti);
        }
        System.out.println("--------------------");
        System.out.println("Buble Sort");
        t.bublesort();
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("--------------------");
        System.out.println("Selection sort");
        t.selectionsort();
        
    }
}

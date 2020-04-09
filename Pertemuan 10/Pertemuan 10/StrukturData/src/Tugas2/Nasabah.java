
package Tugas2;

public class Nasabah {
    String noRekening;
    String nama;
    
    public Nasabah(String noRek, String nm) { 
        noRekening = noRek;
        nama = nm;
    }
    
    void print(){
        System.out.println("Nama Nasabah : " + nama);
        System.out.println("Nomor Rekening : " + noRekening);
    }
}

    
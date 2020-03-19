
package js5;

public class Mahasiswa {
    String nama;
    int thnMasuk;
    int umut;
    double ipk;

    public Mahasiswa() {
    }
    

    public Mahasiswa(String n, int t, int u, double i) {
        this.nama = n;
        this.thnMasuk = t;
        this.umut = u;
        this.ipk = i;
    }
    void tampil(){
        System.out.println("Nama : " + nama);
        System.out.println("Tahun Masuk : " + thnMasuk);
        System.out.println("Umur : " + umut);
        System.out.println("IPK : " + ipk);
    }
    
    
    
    
    
    
    
    
    
}

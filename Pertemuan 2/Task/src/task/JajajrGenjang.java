
package task;

import java.util.Scanner;

public class JajajrGenjang {
    public int tinggi,panjang,sisi_miring;

    public JajajrGenjang(int tinggi, int panjang, int sisi_miring) {
        this.tinggi = tinggi;
        this.panjang = panjang;
        this.sisi_miring = sisi_miring;
    }

    public int hitungLuas(){
        return panjang * tinggi;
    }
    public int hitungKeliling(){
        return 2 * (panjang +sisi_miring);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        JajajrGenjang[] jjArray = new JajajrGenjang[5];
        
        for (int i = 0; i < 5; i++) {
            jjArray[i] = new JajajrGenjang(i,i,i);
            System.out.println("Jajar Genjang ke-" + i);
            System.out.println("Masukkan Tinggi :");
            jjArray[i].tinggi = sc.nextInt();
            System.out.println("Masukkan Panjang :");
            jjArray[i].panjang = sc.nextInt();
            System.out.println("Masukkan Sisi Miring :");
            jjArray[i].sisi_miring = sc.nextInt();
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Jajar Genjang ke-" + i);
            System.out.println("Panjang : " + jjArray[i].panjang + ", Tinggi :" + jjArray[i].tinggi + "Sisi Miring : " + jjArray[i].sisi_miring);
            System.out.println("Luas: " + jjArray[i].hitungLuas() + ", Keliling :" + jjArray[i].hitungKeliling());
        }
        
    }
}

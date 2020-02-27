
package js3;
import java.util.Scanner;

public class Tugas3 {
     String namaMhs;
    int nilaiTugas;
    int nilaiKuis;
    int nilaiUAS;
    int nilaiUTS;
    double total;
    
    double hitungTotalNilai(){
        total= (nilaiTugas*30/100) + (nilaiKuis*20/100)+ 
                (nilaiUTS*20/100)+ (nilaiUAS*30/100);
        return total;
    }
    
   

    public static void main(String[] args) {
         Scanner sc= new Scanner(System.in);
         Scanner huruf= new Scanner(System.in);
         System.out.println("======= PROGRAM PERHITUNGAN RATA-RATA ========");
         System.out.print("Jumlah mahasiswa: ");
         int jmlh= sc.nextInt();
         Tugas3[] a=new Tugas3[jmlh];
         for(int i=0; i<jmlh;i++){   
             System.out.println("Nilai mahasiswa ke " + (i+1));
            a[i]= new Tugas3();
            System.out.print("Masukkan nama mahasiswa : ");
             a[i].namaMhs= huruf.nextLine();
            System.out.print("Masukkan nilai tugas : ");
            a[i].nilaiTugas= sc.nextInt();
            System.out.print("Masukkan nilai kuis : ");
            a[i].nilaiKuis= sc.nextInt();
            System.out.print("Masukkan nilai UTS : ");
            a[i].nilaiUTS= sc.nextInt();
            System.out.print("Masukkan nilai UAS : ");
            a[i].nilaiUAS= sc.nextInt();
             System.out.println();
         }
        for(int i=0; i<jmlh;i++){
             System.out.println("total Nilai " + a[i].namaMhs+" adalah " 
                     +a[i].hitungTotalNilai());
        }
        System.out.println();
        double rata=0;
        for(int j=0; j<jmlh;j++){
            rata+=a[j].hitungTotalNilai()/jmlh;
        }    
        System.out.println("Rata-rata nilai mahasiswa adalah "+rata);
    }
    
}

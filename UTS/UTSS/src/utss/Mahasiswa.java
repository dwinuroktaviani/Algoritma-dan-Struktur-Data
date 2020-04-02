
package utss;

import static java.util.Arrays.sort;
import java.util.Scanner;

public class Mahasiswa {
    String nama;
    int thnMasuk;
    int umur;
    double ipk;

    public Mahasiswa(String n, int t, int u, double i) {
        this.nama = n;
        this.thnMasuk = t;
        this.umur = u;
        this.ipk = i;
    }

    public Mahasiswa() {
         
    }
    
    void Tampil(){
        System.out.print("Nama :  ");
         System.out.print("Tahun Masuk : ");
         System.out.print("Umur : ");
         System.out.print("IPK : ");
    }

    int binarySearch(int arr[], int l, int r, double x){
       if (r>=l) 
        { 
            int mid = l + (r - l)/2; 
            if (arr[mid] == x) 
               return mid; 
            if (arr[mid] > x) 
               return binarySearch(arr, l, mid-1, x); 

            return binarySearch(arr, mid+1, r, x); 
        } 

        return -1; 
      }
    
            public static void initializemergeSort(int n[], int l, int h)
          { 
             int low = l;
             int high = h;
             if (low>=high)
             {
                return;
             }
             int middle=(low+high)/2;
             initializemergeSort(n,low,middle);
             initializemergeSort(n,middle+1,high);
             int end_low=middle;
             int start_high=middle+1;
             while ((l<=end_low) && (start_high<=high))
             {
                if (n[low]<n[start_high])
                {
                   low++;
                }
                else
              {
                   int Temp=n[start_high];
                   for (int k=start_high-1;k>=low;k--)
                   {
                      n[k+1]=n[k];
                   }
                   n[low]=Temp;
                   low++;
                   end_low++;
                   start_high++;
              }
            }
          }  


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa m = new Mahasiswa();
        int[] jumlah = new int[3];
      
        for (int i = 0; i < jumlah.length; i++) {
             System.out.print("IPK : ");
             jumlah[i] = sc.nextInt();
        }
        System.out.println("Masukkan Nilai yang anda cari : ");
        double nilai = sc.nextDouble();
        double result = m.binarySearch(jumlah, 0,jumlah.length-1 ,nilai);
        if (result == -1) 
            System.out.println("Tidak Ditemukan Mahasiswa dengan IPK "); 
        else
            System.out.println("Ditemukan Mahasiswa dengan IPK  " +  nilai); 
        
        System.out.println("Sebelum dirutkan : ");
            for(int i = 0; i < jumlah.length; i++)
         {
            System.out.print(jumlah[i]+" ");
         }
         System.out.println();
         
         initializemergeSort(jumlah,0,jumlah.length-1);
     System.out.println();   
     System.out.println("Setelah di Urutkan = ");
     for(int i = 0; i < jumlah.length; i++)
     {
        System.out.print(jumlah[i]+" ");
     }
     System.out.println();
    }
}

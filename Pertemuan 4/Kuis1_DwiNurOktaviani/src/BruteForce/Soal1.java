
package BruteForce;

import static jdk.nashorn.internal.objects.NativeString.match;

public class Soal1 {

    String o = "Oke";
    int n,m;
      public int bruteforce(char teks[],char pola[]){
        n = teks.length;
        m = pola.length;
        for (int i = 0; i <= teks.length-pola.length; i++) {
            int j = 1;
            while (j < m && (pola[j] == teks[i+j])) {                
               j = j + 1;
            }
            if (j == m)
                    System.out.println("Data cocok");
                else{
                    System.out.println("Data tidak cocok");
                }
        }
        return -1;
    }

      public static void main(String[] args) {
          Soal1 s = new Soal1();
          char[] x = {'N', 'G','A'};
          char[] y = {'S', 'E', 'M','A','N', 'G', 'A', 'T'};
          s.bruteforce(y, x);
          
        
    }
}
  

package tugasdua;

public class bank {
   
    public static void main(String[] args) {
        bank b = new bank();
        int uang = 1000000;
        double bunga;
        int j = 0;
       
       for (int i = uang ; i <= 1500000; i+=bunga) {
           bunga = i * 0.02;
            j+=1;
           
       }
        System.out.println("Uana akan terkumpul Rp.1.500.000 selama "+ j );

    }
    
}

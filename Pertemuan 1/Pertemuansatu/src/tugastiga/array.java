
package tugastiga;


public class array {
    public static void main(String[] args) {
    char[] kata = {'M','I','S','S','I','S','S', 'I', 'P', 'I'};
    int j = 0;
        for (int i = 0; i < kata.length; i++) {
            if(kata[i] == 'M'){
                j+=1;
            }
            
        }
        System.out.println("Huruf M sebanyak : " + j);
        System.out.println("");
        
    int k = 0;
        for (int i = 0; i < kata.length; i++) {
            if(kata[i] == 'I'){
                k+=1;

            }
            
        }
           System.out.println("Huruf I sebanyak : " + k);
        
           
           System.out.println("");
    int l = 0;
        for (int i = 0; i < kata.length; i++) {
            if(kata[i] == 'I'){
                l+=1;

            }
            
        }
           System.out.println("Huruf S sebanyak : " + l);
    
           System.out.println("");
     int m = 0;
        for (int i = 0; i < kata.length; i++) {
            if(kata[i] == 'I'){
                m+=1;

            }
            
        }
           System.out.println("Huruf P sebanyak : " + m);
        
        
    }
}


package DevideConquer;
public class Soal2 {
    static void devideconquer(int numDisc, char source, char destination, char spare){
        if (numDisc == 1) {
                 System.out.println("Pindah 1 gelang dari tower : " + source + " ke " + destination);
        }
        if (numDisc > 1) {
            devideconquer( numDisc-1, source, spare, destination);
            System.out.println("Pindah gelang " + numDisc + " dari tower " + source + " ke " + destination);
            devideconquer(numDisc-1, spare, destination, source);
        }
    }
    public static void main(String args[]) 
    { 
        int a = 0;
        devideconquer(a, 'A', 'C', 'B');
    } 
    
}


package js3;

public class NilaiAlgoritma {
    String namaMhs;
    public int nilaiTugas,nilaiKuis,nilaiUTS,nilaiUAS;
  
    public double hitungTotalNilai(int nilaiTugas,int nilaiKuis,int nilaiUTS,int nilaiUAS){
        int nilaiAkhir =  (int) ((0.3 * nilaiTugas) + (0.2 *  nilaiKuis) + (0.2 * nilaiUTS ) + (0.3 * nilaiUAS));
        return nilaiAkhir;
    }
    
    public int total = 0;
    public double rataBF(int a){
        return total / a;
    }
}

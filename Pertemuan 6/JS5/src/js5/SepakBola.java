
package js5;

import java.util.Scanner;

public class SepakBola {
    SepakBola sb[] = new SepakBola[100];
    String league;
    int poin1, poin2,poin3, idx;

    public SepakBola() {
    }

    public SepakBola(String league, int poin1, int poin2, int poin3, int idx) {
        this.league = league;
        this.poin1 = poin1;
        this.poin2 = poin2;
        this.poin3 = poin3;
        this.idx = idx;
    }
    
    
    void tambah(SepakBola s){
        if (idx < sb.length) {
            sb[idx] = s;
            idx++;
        }
        else{
            System.out.println("Data sudah penuh !!");
        } 
    }
    void tampil(){
        System.out.println("Nama Kalsemen : " + league);
        System.out.println("Poin Klasemen : " + poin);
    }
    
    void isertionsort(){
        int i,j;
        for (i = 0; i < sb.length; i++) {
            SepakBola temp = new SepakBola();
            temp = sb[i];
            j = i;
            while ((j > 0) && (sb[j-1].poin > temp.poin)) {                
                sb[j] = sb[j-1];
                j--;
            }
            sb[j] = temp;
        }
        for(SepakBola s : sb){
            s.tampil();
            System.out.println("------------------");
        }
    }
    
    void insertionsortdesc(){
        int i,j;
        for (i = 0; i > sb.length; i++) {
            SepakBola temp = new SepakBola();
            temp = sb[i];
            j = i;
            while ((j > 0) && (sb[j-1].poin > temp.poin)) {                
                sb[j] = sb[j-1];
                j--;
            }
            sb[j] = temp;
        }
        for(SepakBola s : sb){
            s.tampil();
            System.out.println("------------------");
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SepakBola sbp = new SepakBola();
        String nama[] = {"Liverpool","Manchester City","Leicester", "Chelsea", "Wolverhampion Wanderers",
                          "Sheffiel United", "Manchester United", "Totten"};
        
        SepakBola[] SP = new SepakBola[20];

        SP[0] = new SepakBola("Manchester United", 28, 12, 42);
        SP[1] = new SepakBola("Tottenham Hotspur", 29, 7, 41);
        SP[2] = new SepakBola("Arsenal", 28, 4, 40);
        SP[3] = new SepakBola("Burnley", 29, -6, 39);
        SP[4] = new SepakBola("Crystal Palace", 29, -6, 39);
        SP[5] = new SepakBola("Everton", 29, -6, 37);
        SP[6] = new SepakBola("Liverpool", 29, 45, 82);
        SP[7] = new SepakBola("Manchester City", 27, 39, 57);
        SP[8] = new SepakBola("Leicester", 28, 26, 50);
        L[9] = new SepakBola("Newcastle United", 29, -16, 35);
        L[10] = new SepakBola("Southampton", 29, -17, 34);
        L[11] = new SepakBola("Brighton & Hove Albion", 29, -8, 29);
        L[12] = new SepakBola("Chelsea", 29, 9, 48);
        L[13] = new SepakBola("Wolverhampton Wanderers", 29, 7, 43);
        L[14] = new SepakBola("Sheffield United", 28, 5, 43);
        L[15] = new SepakBola("West Ham United", 29, -15, 27);
        L[16] = new SepakBola("Watford", 29, -17, 27);
        L[17] = new SepakBola("AFC Bournemouth", 29, -18, 27);
        L[18] = new SepakBola("Aston Villa", 27, -18, 25);
        L[19] = new SepakBola("Norwich City", 29, -27, 21);
        
        System.out.println("Poin setelah sorting ascending");
        sbp.isertionsort();
        
        System.out.println("Poin setelah sorting desending");
        sbp.insertionsortdesc();
        
    }
    
    
    
    
    
    
}

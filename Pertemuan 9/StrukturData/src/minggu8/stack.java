
package minggu8;

import java.util.Scanner;

public class stack {
    int size;
    int top;
    int data[];

    public stack(int size) {
        this.size = size;
        data = new int[size];
        top = -1;
    }
    public boolean IsEmpty(){
        if (top == -1) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean IsFull(){
        if (top == size -1) {
         return true;
        }
        else{
            return false;
        }
    }
    
    public void push(int dt){
        if (!IsFull()) {
            top++;
            data[top] = dt;
        }else{
            System.out.println("Isi Stack Penuh");
        }
    }
    
    public void pop(){
        if (!IsEmpty()) {
            int x = data[top];
            top--;
            System.out.println("Data yang keluar : " + x);
        }else{
            System.out.println("Stack masih kosong");
        }
    }
    
    public void peek(){
        System.out.println("Elemen teratas: " + data[top]);
    }
    
    public void print(){
        System.out.println("Isi stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i]+ " ");
        }
        System.out.println(" ");
    }
    
    public void clear(){
        if (!IsEmpty()) {
            for (int i = top; i >=0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        }else{
            System.out.println("Gagal! stack massih kosong");
        }
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah angka : ");
        int bil = sc.nextInt();
        stack tumpukan = new stack(bil);
        
        for (int i = 1; i <=bil; i++) {
            System.out.print("Masukkan angka ke- " + i +  " : ");
            int angka = sc.nextInt();
            tumpukan.push(angka);
        }
        
        tumpukan.print();
        
        System.out.println("Masukkan Tindakan yang anda lakukan : ");
        System.out.println("1.pop");
        System.out.println("2.peek");
        int pilihan = sc.nextInt();
        switch(pilihan){
            case 1:
                tumpukan.pop();
                tumpukan.print();
            break;
            case 2:
                tumpukan.peek();
                tumpukan.print();
            break;
            default:
        }

    }
    
    
}

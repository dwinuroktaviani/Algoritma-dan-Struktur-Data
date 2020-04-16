
package Minggu10.Tugas2;

public class MainStack {
    public static void main(String[] args) {
    SList data = new SList();
        System.out.println("Inisialisasi Stack...");
        data.push(27);
        data.push(18);
        data.push(36);
        System.out.println("Tampilkan");
        data.print();
        System.out.println("Hapus Stack dari Top");
        while (!data.isEmpty()) {            
            NodeS ns = data.pop();
            System.out.print("Hapus");
            ns.tampil();
            System.out.println("");
        }
        data.print();
    }
}

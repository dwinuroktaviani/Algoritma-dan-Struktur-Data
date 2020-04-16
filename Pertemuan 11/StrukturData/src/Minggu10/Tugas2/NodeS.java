
package Minggu10.Tugas2;

public class NodeS {
    public int data;
    public NodeS next;
    public NodeS prev;

    public NodeS(int id) {
        this.data = id;
    }
    
    public void tampil(){
        System.out.println("{" + data + "}");
    }

}


package TUGAS3;

public class Node {
    String nama;
    int nilai;
    Node prev,next;

    public Node(Node prev,String nama, int nilai,  Node next) {
        this.nama = nama;
        this.nilai = nilai;
        this.prev = prev;
        this.next = next;
    }
    
    
    
}

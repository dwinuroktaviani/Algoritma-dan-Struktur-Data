
package kuis2;

public class LinkedList {
    Node head;
    int size;
    Pariwisata pr;

    LinkedList(){
    head = null; 
    size = 0;
    }
    
    boolean isEmpty(){ 
        return head == null;
    }

    public void addFirst(int thn18,int thn19,int thn20) {
        pr = new Pariwisata(thn18, thn19, thn20);
        head = new Node(pr, head);
        size++;
    }
    
    public void add(int thn18,int thn19,int thn20,int index) throws Exception {
        pr = new Pariwisata(thn18, thn19, thn20);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(thn18, thn19, thn20);
        } else {
            Node tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            Node next = (tmp == null) ? null : tmp.next;
            tmp.next = new Node(pr, next);
            size++;
        }
    }
    
    public void addLast(int thn18,int thn19,int thn20) {
       pr = new Pariwisata(thn18, thn19, thn20);
        if (isEmpty()) {
            addFirst(thn18,thn19,thn20);
        } else {
            Node tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node(pr, null);
            size++;
        }
    }
    
    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("Bulan ke- :" +"\t"+ "2018" +"\t\t"+ "2019" +"\t\t"+ "2020");
                for (int i = 1; i <=size; i++) {
                System.out.println(i + "\t\t" + tmp.data.thn18 +"\t\t" + tmp.data.thn19 +"\t\t" + tmp.data.thn20);
                tmp = tmp.next;
                }
                
            }
            System.out.println("");
        } else {
            System.out.println("LinkedList kosong");
        }
    } 
}




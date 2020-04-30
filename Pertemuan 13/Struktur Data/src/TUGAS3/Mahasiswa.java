
package TUGAS3;

public class Mahasiswa {
    Node head;
    int size;
    
    public Mahasiswa(){
        head = null;
        size = 0;
    }
    
    boolean isEmpty() {
        return head == null;
    }
    
    void addFirst(String nama, int nilai) {
        if (isEmpty()) {
            head = new Node(null,nama,nilai, null);
        } else {
            Node newNode = new Node(null,nama,nilai, null);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    
    void addLast(String nama, int nilai) {
        if (isEmpty()) {
            addFirst(nama,nilai);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current,nama,nilai, null);
            current.next = newNode;
            size++;
        }
    }
    
    void add(String nama,int nilai,int index) throws Exception {
        if (isEmpty()) {
            addFirst(nama,nilai);
        }
        if (index < 0 || index > size) {throw new Exception("Nilai Index di Luar Batas");
        }
        else {
        Node current = head;
            int i = 0;
            while (i < index) {
                current = current.next;
                i++;
            }
            if (current.prev == null) {
                Node newNode = new Node(null,nama,nilai,current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(current.prev,nama,nilai, current); 
                newNode.prev = current.prev;
                newNode.prev = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }
    
    void removeFirst() throws Exception {
        if (isEmpty()) {throw new Exception("Linked List masih kosong,tidak dapat diHapus");
        }
        else if (size == 1) {
                   removeLast();
        } else {
            head = head.next;
            head.prev = null;
            size--;
        }
    }
    
    void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List masih kosong,tidak dapat diHapus");
        }
        if (head.next == null) {
                   head = null;
                   size--;
                   return;
               }
        Node current = head;
        while (current.next != null) {
          current = current.next;
        }
        current.next = null;
        size--;
    }
    
    void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas ");
        }
        if (index == 0) {
                   removeFirst();
               } else {
                   Node current = head;
                   int i = 0;
                   while (i < index) {
                       current = current.next;
                       i++;
                   }
            if (current.next == null) {
                current.prev.next = null;
            } else if (current.prev == null) {
                current = current.next;
                current.prev = null;
                head = current;
            } else {
                current.prev.next = current.next;
                current.next.prev = current.prev;
            }
            size--;
        }
    }
    
    public void sortAsc(){
        Node tmp = head;
        while (tmp.next != null) {            
            Node current = head;
            while (current.next != null) {                
                if (current.next.nilai < current.nilai) {
                    int temp = current.nilai;
                    current.nilai = current.next.nilai;
                    current.next.nilai = temp;
                }
                current = current.next;
            }
            tmp = tmp.next;
        }
    }
    
    public void sortDesc(){
        Node tmp = head;
        while (tmp.next != null) {            
            Node current = head;
            while (current.next != null) {                
                if (current.next.nilai > current.nilai) {
                    int temp = current.nilai;
                    current.nilai = current.next.nilai;
                    current.next.nilai =  temp;
                }
                current = current.next;
            }
            tmp = tmp.next;
        }
    }
    
    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        Node tmp = head;
        System.out.println("Size = " + size);
        while (tmp != null) {            
            System.out.println("Nama : " + tmp.nama);
            System.out.println("Nilai : " + tmp.nilai);
            System.out.println("======================");
            tmp = tmp.next;
        }
    }
}

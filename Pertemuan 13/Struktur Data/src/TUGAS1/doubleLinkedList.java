
package TUGAS1;

public class doubleLinkedList {
    Node head;
    int size;

    doubleLinkedList() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    void addFirst(int item) {
        if (isEmpty()) {
            head = new Node(item, null, null);
        } else {
            Node newNode = new Node(item, null, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    void addLast(int item) {
        if (isEmpty()) {
            addFirst(item);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(item, current,null);
            current.next = newNode;
            size++;
        }
    }

    void add(int item, int index) throws Exception {
        if (isEmpty()) {
            addFirst(item);
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
                Node newNode = new Node(item,current.prev, current);
                current.prev = newNode;
                head = newNode;
            } else {
                Node newNode = new Node(item,current.prev, current); 
                newNode.prev = current.prev;
                newNode.prev = current;
                current.prev.next = newNode;
                current.prev = newNode;
            }
        }
        size++;
    }

    int size() {
        return size;
    }

    void clear() {
        head = null;
        size = 0;
    }

    void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("Berhasil Diisi");
        } else {
            System.out.println("Linked Lsst Kosong");
        }
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

    int getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked ListKosong");
        }
        return head.data;
    }

    int getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked List Kosong");
        }
        Node tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception {
        if (isEmpty() || index >= size) { throw new Exception("Nilai Diluar Batas");
        }
        Node tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    void getKey(int value) {
        int index = -1;
        int i = 0;
        Node tmp = head;
        while (tmp != null) {
            if (tmp.data == value) {
                index = i;
            }
            tmp = tmp.next;
            i++;
        }
        System.out.println("Data : " + value +" ditemukan pada indeks ke : " + index);
    }
}



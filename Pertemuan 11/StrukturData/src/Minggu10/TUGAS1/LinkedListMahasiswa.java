package Minggu10.TUGAS1;

public class LinkedListMahasiswa {

    NodeMahasiswa head;
    int size;
    Mahasiswa mhs;

    LinkedListMahasiswa() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(String nim, String nama) {
        mhs = new Mahasiswa(nim, nama);
        head = new NodeMahasiswa(mhs, head);
        size++;
    }

    public void add(String nim, String nama, int index) throws Exception {
        mhs = new Mahasiswa(nim, nama);
        if (index < 0 || index > size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            addFirst(nim, nama);
        } else {
            NodeMahasiswa tmp = head;
            for (int i = 1; i < index; i++) {
                tmp = tmp.next;
            }
            NodeMahasiswa next = (tmp == null) ? null : tmp.next;
            tmp.next = new NodeMahasiswa(mhs, next);
            size++;
        }
    }

    public void addLast(String nim, String nama) {
        mhs = new Mahasiswa(nim, nama);
        if (isEmpty()) {
            addFirst(nim, nama);
        } else {
            NodeMahasiswa tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new NodeMahasiswa(mhs, null);
            size++;
        }
    }

    public Mahasiswa getFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        return head.data;
    }

    public Mahasiswa getLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("LinkedList kosong");
        }
        NodeMahasiswa tmp = head;
        while (tmp.next != null) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public Mahasiswa get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        NodeMahasiswa tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public void addKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        String nama = "";
        for (int i = 0; i < size; i++) {

            if (tmp.data.nim.equalsIgnoreCase(nim)) {
                nama = tmp.data.nama;
                mhs = new Mahasiswa(nim, nama);
                add(nim, nama, i + 1);
                break;
            }
            tmp = tmp.next;
        }
    }

    public int getKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        int simpan = -1;
        for (int i = 0; i < size; i++) {

            if (tmp.data.nim.equalsIgnoreCase(nim)) {
                simpan = i;
                break;
            }
            tmp = tmp.next;
        }
        return simpan;
    }

    public void removeKey(String nim) throws Exception {
        NodeMahasiswa tmp = head;
        for (int i = 0; i < size; i++) {

            if (tmp.data.nim.equalsIgnoreCase(nim)) {
                remove(i);
                break;
            }
            tmp = tmp.next;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai index di luar batas");
        }
        if (isEmpty() || index == 0) {
            removeFirst();
        } else {
            NodeMahasiswa prev = head;
            NodeMahasiswa cur = head.next;
            for (int i = 1; i < index; i++) {
                prev = cur;
                cur = prev.next;
            }
            prev.next = cur.next;
            size--;
        }
    }

    public void removeFirst() throws Exception {
        Mahasiswa tmp = getFirst();
        head = head.next;
        size--;
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public void print() {
        if (!isEmpty()) {
            NodeMahasiswa tmp = head;
            while (tmp != null) {
                System.out.println("Nim : " + tmp.data.nim);
                System.out.println("Nama : " + tmp.data.nama);
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedList kosong");
        }
    }
}


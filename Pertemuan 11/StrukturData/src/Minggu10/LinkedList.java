
package Minggu10;
public class LinkedList {
    Node head;
    int size;

    LinkedList(){
    head = null; 
    size = 0;
    }

    boolean isEmpty(){ 
        return head == null;
    }

    void addFirst(int item){
    head = new Node(item, head); 
    size++;
    }

    void add(int item, int index) throws Exception{ if (index < 0 || index > size) 
        throw new Exception("Nilai index di luar batas");
        if (isEmpty() || index == 0){ addFirst(item);
        }else{
        Node tmp = head;
        for (int i=1; i<index; i++){ tmp = tmp.next;
        }
        Node next = (tmp == null) ? null :tmp.next;
        tmp.next = new Node(item, next);
        }
        size++;
    }

    void addLast(int item){ if (isEmpty()){
        Node tmp = head;
        while (tmp.next != null){ tmp = tmp.next;
        }
        tmp.next = new Node(item, null);
        }else{
        size++;
        }
    }
    
    int getFirst() throws Exception{
        if (isEmpty()) throw new Exception("LinkedList kosong"); return head.data;
        }
        int getLast() throws Exception{
        if (isEmpty()) throw new Exception("LinkedList kosong"); Node tmp = head;
        while (tmp.next != null){ tmp = tmp.next;
        }
        return tmp.data;
    }

    int get(int index) throws Exception{
        if (isEmpty() || index >= size) throw new Exception("Nilai index di luar batas");
        Node tmp = head;
        for (int i=0; i < index; i++){ tmp = tmp.next;
        }
        return tmp.data;
    }
    
    public void removeFirst() throws Exception{
        head = head.next;
        size--;
    }

    void remove(int index) throws Exception{
        if (isEmpty() || index >= size) {throw new Exception("Nilai index di luar batas");}
        Node prev = head; 
        Node cur = head.next;
        for (int i=1; i<index; i++){ 
            prev = cur;
            cur = prev.next;
        }
            prev.next = cur.next; 
            size--;
            
        if (size == 1) {
            removeFirst();
            
        }
    }
    void clear(){ 
        head = null; 
        size = 0;
    }
    
    void print(){
        if (!isEmpty()){
        Node tmp = head;
        while (tmp != null){ System.out.println(tmp.data + "\t"); tmp = tmp.next;
        }

        System.out.println();
        }
        else{
        System.out.println("LinkedList kosong");
        }
    }
    
    public void addByValue(int item) throws Exception{
        if (isEmpty()) {
            throw new Exception("Data Kosong");
        }
        Node tmp = head;
        while (tmp != null) {  
            if (item == tmp.data) {
                while (tmp.next != null) {                    
                    tmp = tmp.next;
                }
            tmp.next = new Node(item,null);
            size++;
            break;
            }
            tmp=tmp.next;
        }
    }
    
    void removeByValue(int item) throws Exception{ 
        int index = -1, i = 0;
        Node tmp=head; 
        while(tmp!=null){
            if (item == tmp.data){ index = i;
            }
            tmp = tmp.next; i++;
        }
       Node prev = head; 
       Node cur = head.next; 
       for(int j = 1; j < index; j++){
           prev = cur;
           cur = prev.next;
       }
       prev.next = cur.next; 
       size--;
    }

    
    
    
}

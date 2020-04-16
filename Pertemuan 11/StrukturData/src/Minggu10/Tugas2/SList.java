
package Minggu10.Tugas2;

public class SList {
    private NodeS top;
    private NodeS bottom;

    public SList() {
        top = bottom = null;
    }
    
    public boolean isEmpty(){
        return (top ==null);
    }
    
    public void push(int id){
        NodeS st = new NodeS(id);
        if (top == null) {
            top = bottom = st;
        }
        else{
            top.next = st;
            st.prev = top;
            top = st;
        }
    }
    
    public NodeS pop(){
        NodeS tmp = null;
        if (top == null) {
            System.out.println("Stack Kosong");
        }
        else if(top == bottom){
            tmp = top;
            top = bottom = null;
        }
        else{
            tmp = top;
            top = top.prev;
            top.next = null;
        }
        return tmp;
    }
    
    public void print(){
        NodeS current = bottom;
        while (current != null) {            
            current.tampil();
            current = current.next;
        }
        System.out.println("");
    }

}

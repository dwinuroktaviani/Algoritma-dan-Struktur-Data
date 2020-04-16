
package Minggu8;

public class Queue {
    int max, front, size, rear;
    int [] Q;

    public Queue(int m) {
    max = m;
    create();
    }

    void create(){
    Q = new int [max];
    size = 0;
    front = rear = -1;
    }
    
    boolean isEmpty(){
        if (size == 0)
            return true;
        else
            return false;
    }

    boolean isFull(){
    if(size == max)
        return true;
    else
    return false;
    }
    
    public void peek(){
        if (isEmpty()) {
            System.out.println("Elemen Terdepan : " + Q[front]);
        }
        else{
            System.out.println("Antrian masih kosong");
        }
    }
    
    void enqueue(int data){
        if(isFull()){
            System.out.println("Antrian sudah penuh!!"); 
        }
        else{
            if (isEmpty()){
                front = rear = 0;
            }else{
                if(rear == max-1){
                    rear = 0;
                }else {
                    rear++;
                }
            }
            Q[rear] = data;
            size++;
        }
    }

    int dequeue(){
        int data = 0;
        if(isEmpty()){
            System.out.println("Antrian Kosong!"); 
        }
        else{
            data = Q[front];
            size--;
            if(isEmpty()){
                front = rear = -1;
            }else{
                if(front == max -1){
                    front = 0;
                }else{
                    front++;
                }
            }
        }
        return data;
    }

    void print(){
        if(isEmpty()){
            System.out.println("Antrian kosong!"); 
        }
        else{
            int i = front;
            while(i!=rear){
                System.out.print(Q[i] + " ");
                i = (i+1)%max;
            }
            System.out.println(Q[i]+" "); 
            System.out.println("Jumlah Antrian = " +size);
        }
    }
    
    void peekRear(){
        int last = Q[rear];
          System.out.println("Rear Data is : " + last);
    }
    //TUGAS 1 
    void peekPosition(int data){
        int count =0;
        if(isEmpty()){
            System.out.println("Antrian kosong!"); }else{
            int i = front;
            while(i!=rear){
                count++;
                if (data == Q[i]){
                    System.out.println("Data berada dalam Posisi: " +
                            count);
                    break;
                }
                i = (i+1)%max;
            }
        }
    }
    //TUGAS 1
    void peekAt(int position){
        int count =0;
        if(isEmpty()){
            System.out.println("Antrian kosong!"); }else{
            int i = front;
            while(i!=rear){
                count++;
                if (position == count){
                    System.out.println("Posisi ke -" + (i+1) + " : " +
                            Q[i]);
                    break;
                }
                i = (i+1)%max;
            }
        }
    } 
}



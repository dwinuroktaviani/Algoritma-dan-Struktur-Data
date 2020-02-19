
package task;

import java.util.Scanner;

public class pcman {
    int x,y,width,height;
    
    void moveLeft(){
        if (x<= width || x > 0) {
            x -=1;
        }
    }
    void moveRight(){
         if (x<= width || x > 0) {
            x +=1;
        }
    }
    void moveUp(){
        if (y<= height || y > 0) {
            y-=1;
        }
    }
    void moveDown(){
        if (y<= height || y > 0) {
            y += 1;
        }
    }
    void printPosition(){
        System.out.println("Titik Koordinat :" + x + "x," + y + "y"); 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        pcman p = new pcman();
        
        System.out.println("Masukkan x :");
        p.x = sc.nextInt();
        System.out.println("Masukkan y :");
        p.y = sc.nextInt();
        System.out.println("Masukkan width : ");
        p.width = sc.nextInt();
        System.out.println("Masukkan height :");
        p.height = sc.nextInt();
        
        p.moveLeft();
        p.moveUp();
        p.moveRight();
        p.moveDown();
        p.printPosition();
        

        
    }
    
}

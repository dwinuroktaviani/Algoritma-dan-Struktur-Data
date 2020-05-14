
package TUGAS2;

import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Graph graph = new Graph(2);
        for (int i = 1; i <= 2; i++) {
            System.out.print("Masukkan vertex awal : ");
            int source = sc.nextInt();
            System.out.print("Masukkan vetex tujuan : ");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            System.out.println("------------------------------------------------");
        }
        graph.printGraph();
        for (int i = 1; i <= 2; i++) {
            System.out.print("Masukkan vertex awal : ");
            int source = sc.nextInt();
            System.out.print("Masukkan vertex tujuan : ");
            int destination = sc.nextInt();
            graph.graphType(source, destination);
            System.out.println("------------------------------------------------");
        }
        graph.printGraph();

    }
}

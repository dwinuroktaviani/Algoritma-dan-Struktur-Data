
package TUGAS1;
import java.util.Scanner;

public class GraphMain {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex : ");
        int jmlvertex = sc.nextInt();
        Graph graph = new Graph(jmlvertex);
        for (int i = 1; i <= jmlvertex; i++) {
            System.out.print("Masukkan vertex awal : ");
            int source = sc.nextInt();
            System.out.print("Masukkan vertex tujuan : ");
            int destination = sc.nextInt();
            graph.addEdge(source, destination);
            System.out.println("--");
        }
        graph.printGraph();

    }
}

package TUGAS3;

import java.util.Scanner;

public class GraphMain {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner ssc = new Scanner(System.in);
        System.out.print("Masukkan jumlah vertex : ");
        int jmlvertex = sc.nextInt();
        Graph graph = new Graph(jmlvertex);
        boolean status = true;
        while (status) {
            System.out.println("	");
            System.out.println(" GRAPH DENGAN MENU");
            System.out.println("	");
            System.out.println(" Menu Graph : ");
            System.out.println("1. Jenis Graph ");
            System.out.println("2. Input jumlah vertex ");
            System.out.println("3. addEdge ");
            System.out.println("4. removeEdge ");
            System.out.println("5. removeAllEdges ");
            System.out.println("6. Keluar ");
            System.out.println("	");
            System.out.print("Masukkan pilihan :	");
            int pilih = sc.nextInt();
            if (pilih == 1) {
                System.out.println("-------------------------");
                System.out.println("1. Directed ");
                System.out.println("2. Undirected ");
                System.out.print("Pilih : ");
                int pil = sc.nextInt();
                if (pil == 1) {
                    System.out.println("--");
                    System.out.print("Masukkan source : ");
                    int t = sc.nextInt();
                    System.out.print(
                    "Masukkan destination :");
                    int u = sc.nextInt();
                    graph.graphType(t, u);
                    graph.printGraph();
                } else if (pil == 2) {
                    System.out.println("--");
                    System.out.print("Masukkan source : ");
                    int s = sc.nextInt();
                    System.out.print("Masukkan destination : ");
                    int d = sc.nextInt();
                    graph.addEdge(s, d);
                    graph.printGraph();

                }
            } else if (pilih == 2) {
                System.out.println("-------------------------");
                System.out.print("Masukkan source : ");
                int t = sc.nextInt();
                System.out.print("Masukkan destination : ");
                int u = sc.nextInt();
                graph.graphType(t, u);
                graph.printGraph();

            } else if (pilih == 3) {
                System.out.println("-------------------------");
                System.out.print("Masukkan source : ");
                int t = sc.nextInt();
                System.out.print("Masukkan destination :");
                int u = sc.nextInt();
                graph.graphType(t, u);
                graph.printGraph();

            } else if (pilih == 4) {
                System.out.println("-------------------------");
                System.out.print("Masukkan source yang akan dihapus : ");
                int t = sc.nextInt();
                System.out.print("Masukkan destination yang akan dihapus : ");
                int u = sc.nextInt();
                graph.removeEdge(t, u);
                graph.printGraph();

            } else if (pilih == 5) {
                System.out.println("-------------------------");
	graph.removeAllEdges();
                graph.printGraph();
            } else if (pilih == 6) {
                status = false;
            }
        }
    }
}


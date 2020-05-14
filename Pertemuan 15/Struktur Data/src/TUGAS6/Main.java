
package TUGAS6;

public class Main {
    public static void main(String[] args) throws Exception { 
        int vertices = 6;
        Graph graph = new Graph(vertices); 
        graph.addEdge(0, 2);
        graph.addEdge(1, 3);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 1);
        graph.addEdge(4, 5);
        graph.printGraph();
        }

}

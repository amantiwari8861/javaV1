package com.loonycorn;

import java.util.List;


public class GraphBreadthFirstTraversal {

    private static int N = 8;

    public static void main(String[] args)
            throws Queue.QueueOverflowException, Queue.QueueUnderflowException {
        Graph graph = new AdjacencyMatrixGraph(N, Graph.GraphType.DIRECTED);
        graph.addEdge(1, 0);
        graph.addEdge(1, 2);
        graph.addEdge(2, 7);
        graph.addEdge(2, 4);
        graph.addEdge(2, 3);
        graph.addEdge(1, 5);
        graph.addEdge(5, 6);
        graph.addEdge(6, 3);
        graph.addEdge(3, 4);

        int[] visited = new int[] {0, 0, 0, 0, 0, 0, 0, 0};

        // This for-loop ensures that all nodes are covered even for an unconnected
        // graph.
        for (int i = 0; i < N; i++) {
            breadthFirstTraversal(graph, visited, i);
        }
    }

    public static void breadthFirstTraversal(Graph graph, int[] visited, int currentVertex)
        throws Queue.QueueOverflowException, Queue.QueueUnderflowException {

        Queue<Integer> queue = new Queue<>(Integer.class);
        queue.enqueue(currentVertex);

        while (!queue.isEmpty()) {
            int vertex = queue.dequeue();

            if (visited[vertex] == 1) {
                continue;
            }

            System.out.print(vertex + "->");
            visited[vertex] = 1;

            List<Integer> list = graph.getAdjacentVertices(vertex);
            for (int v : list) {
                if (visited[v] != 1) {
                    queue.enqueue(v);
                }
            }
        }
    }
}

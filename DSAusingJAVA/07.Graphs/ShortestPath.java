import java.util.*;

class Graph {
    private int vertices;
    private List<List<Edge>> adjacencyList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjacencyList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjacencyList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjacencyList.get(source).add(new Edge(destination, weight));
    }

    public int[] shortestPath(int start) {
        int[] distance = new int[vertices];
        Arrays.fill(distance, Integer.MAX_VALUE);
        distance[start] = 0;

        PriorityQueue<Node> pq = new PriorityQueue<>(Comparator.comparingInt(node -> node.distance));
        pq.add(new Node(start, 0));

        while (!pq.isEmpty()) {
            Node currentNode = pq.poll();

            for (Edge neighbor : adjacencyList.get(currentNode.vertex)) {
                int newDistance = distance[currentNode.vertex] + neighbor.weight;
                if (newDistance < distance[neighbor.destination]) {
                    distance[neighbor.destination] = newDistance;
                    pq.add(new Node(neighbor.destination, newDistance));
                }
            }
        }

        return distance;
    }

    private static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    private static class Node {
        int vertex;
        int distance;

        public Node(int vertex, int distance) {
            this.vertex = vertex;
            this.distance = distance;
        }
    }
}

public class ShortestPathDijkstra {
    public static void main(String[] args) {
        int vertices = 5;
        Graph graph = new Graph(vertices);

        graph.addEdge(0, 1, 2);
        graph.addEdge(0, 3, 4);
        graph.addEdge(1, 2, 1);
        graph.addEdge(1, 3, 3);
        graph.addEdge(2, 4, 5);
        graph.addEdge(3, 4, 1);

        int startNode = 0;
        int[] shortestDistances = graph.shortestPath(startNode);

        System.out.println("Shortest distances from node " + startNode + ":");
        for (int i = 0; i < vertices; i++) {
            System.out.println("To node " + i + ": " + shortestDistances[i]);
        }
    }
}

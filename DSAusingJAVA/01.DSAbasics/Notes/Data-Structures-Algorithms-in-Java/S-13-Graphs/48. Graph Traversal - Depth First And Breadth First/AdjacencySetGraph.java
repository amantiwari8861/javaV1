package com.loonycorn;

import java.util.*;

public class AdjacencySetGraph implements Graph {

    private List<Node> vertexList = new ArrayList<>();
    private GraphType graphType = GraphType.DIRECTED;
    private int numVertices = 0;

    public AdjacencySetGraph(int numVertices, GraphType graphType) {
        this.numVertices = numVertices;
        for (int i = 0; i < numVertices; i++) {
            vertexList.add(new Node(i));
        }
        this.graphType = graphType;
    }

    @Override
    public void addEdge(int v1, int v2) {
        if (v1 >= numVertices || v1 < 0 || v2 >= numVertices || v2 < 0) {
            throw new IllegalArgumentException("Vertex number is not valid: " + v1 + ", " + v2);
        }

        vertexList.get(v1).addEdge(v2);
        if (graphType == GraphType.UNDIRECTED) {
            vertexList.get(v2).addEdge(v1);
        }
    }

    @Override
    public List<Integer> getAdjacentVertices(int v) {
        if (v >= numVertices || v < 0) {
            throw new IllegalArgumentException("Vertex number is not valid: " + v);
        }

        return vertexList.get(v).getAdjacentVertices();
    }

    public static class Node {

        private int vertexNumber;
        private Set<Integer> adjacencySet = new HashSet<>();

        public Node(int vertexNumber) {
            this.vertexNumber = vertexNumber;
        }

        public int getVertexNumber() {
            return vertexNumber;
        }

        public void addEdge(int vertexNumber) {
            adjacencySet.add(vertexNumber);
        }

        public List<Integer> getAdjacentVertices() {
            List<Integer> sortedList = new ArrayList<>(adjacencySet);

            Collections.sort(sortedList);

            return sortedList;
        }
    }
}

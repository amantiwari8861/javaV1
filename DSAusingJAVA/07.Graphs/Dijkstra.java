import java.util.*;

class Edge 
{
    int vertexValue, weight;
    Edge(int vertexValue, int weight) 
    {
        this.vertexValue = vertexValue;
        this.weight = weight;
    }
}
class Graph 
{
	private int Vertices;
	private List<List<Edge>> allVertices;

    //memory initialization of nested arraylist
	Graph(int Vertices) 
    {
		this.Vertices = Vertices;
		allVertices = new ArrayList<>();//memory initialization of outer arraylist
		for (int i = 0; i < Vertices; i++) 
			allVertices.add(new ArrayList<>());//memory initialization of all 9 indexes in outer arraylist
	}

	void addEdge(int u, int v, int w) 
    {
		allVertices.get(u).add(new Edge(v, w));
		allVertices.get(v).add(new Edge(u, w));
	}

	void shortestPath(int src) 
    {
		PriorityQueue<Edge> pq = new PriorityQueue<>(Vertices,Comparator.comparingInt(o -> o.vertexValue));
		int[] dist = new int[Vertices];
		Arrays.fill(dist, Integer.MAX_VALUE);

		pq.add(new Edge(0, src));
		dist[src] = 0;//setting distance of first node from first node

		while (!pq.isEmpty()) {
			int u = pq.poll().weight;

			for (Edge v : allVertices.get(u)) 
			{
				if (dist[v.vertexValue] > dist[u] + v.weight) {
					dist[v.vertexValue] = dist[u] + v.weight;
					pq.add(new Edge(dist[v.vertexValue], v.vertexValue));
				}
			}
		}
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < Vertices; i++) {
			System.out.println(i + "\t\t" + dist[i]);
		}
	}

}
public class Dijkstra 
{
    public static void main(String[] args) {
        int Vertices = 9;
		Graph g = new Graph(Vertices);

		g.addEdge(0, 1, 4);
		g.addEdge(0, 7, 8);
		g.addEdge(1, 2, 8);
		g.addEdge(1, 7, 11);
		g.addEdge(2, 3, 7);
		g.addEdge(2, 8, 2);
		g.addEdge(2, 5, 4);
		g.addEdge(3, 4, 9);
		g.addEdge(3, 5, 14);
		g.addEdge(4, 5, 10);
		g.addEdge(5, 6, 2);
		g.addEdge(6, 7, 1);
		g.addEdge(6, 8, 6);
		g.addEdge(7, 8, 7);

		g.shortestPath(0);
    }
}

import java.util.*;

class Pair 
{
    int destn, weight;
    Pair(int destn, int weight) 
    {
        this.destn = destn;
        this.weight = weight;
    }
}
class Graph 
{
	private int vertices;
	private List<List<Pair>> allVertices;
    //memory initialization of nested arraylist
	Graph(int vertices) 
    {
		this.vertices = vertices;
		allVertices = new ArrayList<>();//memory initialization of outer arraylist
		for (int i = 0; i < vertices; i++) 
			allVertices.add(new ArrayList<>());//memory initialization of all 9 indexes in outer arraylist
	}

	void addEdge(int u, int v, int w) 
    {
		allVertices.get(u).add(new Pair(v, w));
		allVertices.get(v).add(new Pair(u, w));
	}

	void shortestPath(int src) 
    {
		PriorityQueue<Pair> pq = new PriorityQueue<>(vertices,Comparator.comparingInt(o -> o.destn));
		int[] dist = new int[vertices];
		Arrays.fill(dist, Integer.MAX_VALUE);

		pq.add(new Pair(src, 0));
		dist[src] = 0;//setting distance of first node from first node

		while (!pq.isEmpty()) {
			int u = pq.poll().weight;

			for (Pair v : allVertices.get(u)) 
			{
				if (dist[v.destn] > dist[u] + v.weight) {
					dist[v.destn] = dist[u] + v.weight;
					pq.add(new Pair(dist[v.destn], v.destn));
				}
			}
		}
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < vertices; i++) {
			System.out.println(i + "\t\t" + dist[i]);
		}
	}

}
public class Dijkstra 
{
    public static void main(String[] args) {
        int vertices = 9;
		Graph g = new Graph(vertices);

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

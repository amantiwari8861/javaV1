import java.util.*;

class Pair implements Comparable<Pair>
{
    int destn, weight;
    Pair(int destn, int weight) 
    {
        this.destn = destn;
        this.weight = weight;
    }
	@Override
	public int compareTo(Pair o) 
	{
		if (this.weight<o.weight) 
		{
			return -1;
		}
		else if(this.weight>o.weight)
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	@Override
	public String toString() {
		return "Pair [destn=" + destn + ", weight=" + weight + "]";
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
		showAdjancyList();
		PriorityQueue<Pair> pq = new PriorityQueue<>(vertices);
		int[] dist = new int[vertices];
		Arrays.fill(dist, Integer.MAX_VALUE);

		pq.add(new Pair(src, 0));
		dist[src] = 0;//setting distance of first node from first node

		while (!pq.isEmpty()) 
		{
			System.out.println("Removing top :"+pq.peek());
			int u = pq.poll().weight;
			System.out.println("u is :"+u);
			for (Pair v : allVertices.get(u)) 
			{
				System.out.print(v);
				if ( dist[u] + v.weight < dist[v.destn] )
				{
					dist[v.destn] = dist[u] + v.weight;
					System.out.println("   ->"+dist[v.destn]);
					pq.add(new Pair(dist[v.destn], v.destn));
				}
				System.out.println("Priority Queue:"+pq);
			}
		}
		System.out.println("Vertex Distance from Source");
		for (int i = 0; i < vertices; i++) 
		{
			System.out.println(i + "\t\t" + dist[i]);
		}
	}
	void showAdjancyList()
	{
		System.out.println("The Adjancy List is :");
		for (int i = 0; i < allVertices.size(); i++) 
		{
			List<Pair> src=allVertices.get(i);
			System.out.print("Source ("+i+") :");
			if(src!=null)
			{
				src.forEach(pr->{
					System.out.print("    ("+pr.destn+","+pr.weight+")");
				});
			}
			System.out.println();
		}
	}
	void deleteVertex(int vertexToDelete) 
	{
        if (vertexToDelete < 0 || vertexToDelete >= vertices) 
		{
            System.out.println("Invalid vertex index.");
            return;
        }

        // Remove the vertex and its edges
		allVertices.set(vertexToDelete, null);
        for (List<Pair> adjList : allVertices) 
		{
			if(adjList!=null)
			{
				adjList.removeIf(pair -> pair.destn == vertexToDelete);
			}
        }

    }   // Depth-First Search (DFS)
    void dfs(int startVertex) 
	{
        boolean[] visited = new boolean[vertices];
        dfsUtil(startVertex, visited);
    }
    private void dfsUtil(int vertex, boolean[] visited) 
	{
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (Pair v : allVertices.get(vertex)) 
		{
            if (!visited[v.destn]) 
			{
                dfsUtil(v.destn, visited);
            }
        }
    }
    // Breadth-First Search (BFS)
    void bfs(int startVertex) 
	{
        boolean[] visited = new boolean[vertices];
        Queue<Integer> queue = new LinkedList<>();
        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) 
		{
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (Pair v : allVertices.get(vertex)) 
			{
                if (!visited[v.destn]) 
				{
                    visited[v.destn] = true;
                    queue.add(v.destn);
                }
            }
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

		// g.shortestPath(0);
		// g.deleteVertex(3);
		g.showAdjancyList();
		// g.bfs(0);
		// System.out.println();
		g.dfs(0);
    }
}

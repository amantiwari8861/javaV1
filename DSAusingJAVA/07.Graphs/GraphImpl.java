import java.util.ArrayList;

class Edge<E>
{
    E source;
    E destination;
    public Edge(E source, E destination) {
        this.source = source;
        this.destination = destination;
    }
    public E getSource() {
        return source;
    }
    public void setSource(E source) {
        this.source = source;
    }
    public E getDestination() {
        return destination;
    }
    public void setDestination(E destination) {
        this.destination = destination;
    }
    @Override
    public String toString() {
        return "Edge [source=" + source + ", destination=" + destination + "]";
    }
}
class Graph<E>
{
    ArrayList<ArrayList<Edge<E>>> allVertices;
    Graph(int total)
    {
        allVertices=new ArrayList<>(total);
        for (int i = 0; i < total; i++) 
        {
            allVertices.add(i, new ArrayList<>());    
        }
    }
    void add(int pos,Edge<E> edge)
    {
        allVertices.get(pos).add(edge);
    }
    void print()
    {
        for (int i = 0; i < allVertices.size(); i++) 
        {
            ArrayList<Edge<E>> edges=allVertices.get(i);
            System.out.println("At "+i+"th Position:");
            for (int j = 0; j < edges.size(); j++) 
            {
                System.out.println("\t"+edges.get(j));
            }
        }
    }
}
public class GraphImpl 
{
    public static void main(String[] args) 
    {
        Graph<String> graph=new Graph<>(4);
        graph.add(0,new Edge<>("Sector 62 Noida","Mayur Vihar phase 1"));
        graph.add(0,new Edge<>("Sector 62 Noida","Yamuna Bank"));
        graph.add(1,new Edge<>("Mayur Vihar phase 1","Anand Vihar"));
        graph.add(2,new Edge<>("Anand Vihar","Yamuna Bank"));
        graph.add(2,new Edge<>("Anand Vihar","Shiv vihar"));
        graph.add(3,new Edge<>("Yamuna Bank","Sector 62 Noida"));
        graph.add(3,new Edge<>("Yamuna Bank","Rajiv Chowk"));

        graph.print();
    }
}
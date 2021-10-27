import java.util.*;
//**********GRAPH CREATION***************//
class Graph
{
    ArrayList<ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer> >();
    int V;
    Graph(int vertex)
    {
        V = vertex;
        for(int i=0 ; i<V ; i++)
        {
            graph.add(new ArrayList<Integer>());//******create list for every node******//
        }
    }
    void AddEdge(int v, int u)//******Adding every single edge******//
    {
        graph.get(v).add(u);//******for directed grapgh need only one******//
        graph.get(u).add(v);//******for undirected need both******//
    }
    void Printgraph()//******Printing adj list for every node******//
    {
        for(int i=0; i<V ;i++)
        {
            System.out.println("node i :"+i);
            System.out.print("head");
            for(int X:graph.get(i))
            {
                System.out.print("->"+X);//******elements of adjacency list******//
            }
            System.out.println();
        }
    }



//**********IMPLEMENTING BFS***************//
    void Bfs(int Source)
    {
        boolean[] visited = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<Integer>();
        
        queue.add(Source);
        System.out.println("BFS TRAVERSAL: ");
        visited[Source]=true;

        while(queue.isEmpty()==false)
        {
            int node = queue.poll();
            System.out.print(node+" ");

            
            for(int x:graph.get(node))
            {
                if(!visited[x])
                {
                    visited[x]=true;
                    queue.add(x);
                }
            }
        }
        System.out.println();
        
    }

}
//******MAIN CLASS******//
//******Must be saved as Graph1 coz this is public******//
public class Graph1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter no of vertices");
        int ver = scan.nextInt();
        Graph g = new Graph(ver);
        System.out.println("Enter no of Edges");
        int edge = scan.nextInt();
        for(int i=0 ; i<edge ; i++)
        {
            //******Adding every single edge******//
            System.out.println("Edge as v1 to v2");
            System.out.print("v1: ");
            int v1 = scan.nextInt();
            System.out.print("v2: ");
            int v2 = scan.nextInt();
            g.AddEdge(v1,v2);//******add edge******//
        }
        g.Printgraph();//******Printing adj list for every node******//
        System.out.println();
        g.Bfs(3);
    }
}









//**************************************************************************************************************************************//
/*
Enter no of vertices
5
Enter no of Edges
6
Edge as v1 to v2
v1: 0
v2: 1
Edge as v1 to v2
v1: 0
v2: 2
Edge as v1 to v2
v1: 0
v2: 4
Edge as v1 to v2
v1: 1
v2: 3
Edge as v1 to v2
v1: 2
v2: 3
Edge as v1 to v2
v1: 2
v2: 4
node i :0
head->1->2->4
node i :1
head->0->3
node i :2
head->0->3->4
node i :3
head->1->2
node i :4
head->0->2

BFS TRAVERSAL: 
3 1 2 0 4 
*/
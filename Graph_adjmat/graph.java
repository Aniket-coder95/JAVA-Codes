/*
adjucency list of vertex0
Head->1->2->4

 adjucency list of vertex1
Head->0->3

 adjucency list of vertex2
Head->0->3->4

 adjucency list of vertex3
Head->1->2

 adjucency list of vertex4
Head->0->2

*/
import java.util.*;
class Graph
{
    public static void main(String[] args)
    {
        int V = 5;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >(V);
        for(int i=0; i<V ; i++)
        {
            adj.add(new ArrayList<Integer>());
        }
        
        addElement(adj, 0, 1);
        addElement(adj, 0, 2);
        addElement(adj, 0, 3);
        //addElement(adj, 1, 0);
        addElement(adj, 1, 2);
        addElement(adj, 1, 4);
        //addElement(adj, 2, 0);
        //addElement(adj, 2, 1);
        addElement(adj, 2, 4);
        //addElement(adj, 3, 0);
        addElement(adj, 3, 4);
        //addElement(adj, 4, 1);
        //addElement(adj, 4, 2);
        printG(adj);
    }
    public static void addElement(ArrayList<ArrayList<Integer> > adj, int u,int v)
    {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }
    public static void printG(ArrayList<ArrayList<Integer> > adj)
    {
        for(int i=0; i<adj.size() ; i++)
        {
            System.out.println("\n adjucency list of vertex"+i);
            System.out.print("Head");
            for(int j=0; j<adj.get(i).size() ; j++)
            {
                System.out.print("->"+adj.get(i).get(j));
            }
            System.out.println();
        }        
    }
}
package SP_Dijkshtar;

public class Dijkstra 
{
	static final int V=6;
	public static void main(String[] args) 
	{
		int[][] graph= {{ 0 , 20 , 5 , 8 , 16 , 60 },
						{ 0 , 0 , 9 , 3 , 3 , 6 },
						{ 0 , 3 , 0 , 2 , 15 , 19 },
						{ 0 , 0 , 0 , 0 , 9 , 4 },
						{ 0 , 0 , 0 , 6 , 0 , 4 },
						{ 0 , 0 , 0 , 0 , 0 , 0 }};
		Dijkstra kk = new Dijkstra();
		kk.dkstra(graph,0);
	}

	private void dkstra(int[][] graph, int src) {
		int[] dist = new int[V];
		Boolean[] sptset = new Boolean[V];
		for(int i=0 ; i<V ; i++) 
		{
			dist[i]=Integer.MAX_VALUE;
			sptset[i]=false;
		}
		dist[src]=0;
		for(int j=0 ; j<V-1 ;j++) 
		{
			int u=mindistance(dist , sptset);
			sptset[u]=true;
			for(int v=0  ;  v < V  ;  v++ ) 
			{
				if(!sptset[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && dist[u]+graph[u][v]<dist[v]) 
				{
					dist[v]=dist[u]+graph[u][v];
				}
			}
		}
		printsol(dist,V);
	}

	private void printsol(int[] dist, int v2) {
		System.out.println("Distances from source");
		for(int i=0 ; i<V ;i++) {
			System.out.println("distance from-to 0-"+ i+"------------"+dist[i]);
		}
		
	}

	private int mindistance(int[] dist, Boolean[] sptset) {
		int min=Integer.MAX_VALUE ,minIndex =-1;
		for(int k=0 ; k<V ;k++) 
		{
			if(dist[k]<min && sptset[k]==false) 
			{
				min=dist[k];
				minIndex=k;
			}
		}
		return minIndex;
	} 

}

package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Matrixgraph {
	int matrix[][];
	int size;
	
	Matrixgraph(int v){
		matrix=new int[v][v];
		this.size=v;
		}
	//dst->destinaton
//	public void addEdges(int source,int dst) {
//		matrix[source][dst]=1;
//		matrix[dst][source]=1;
//	}
//	public void addEdges(int source,int dst,int weight) {
//	matrix[source][dst]=weight;
//	matrix[dst][source]=weight;
//}
	public void addEdge(int source, int destination) {

		matrix[source][destination]=1;
		matrix[destination][source]=1;
		}
	
	public void printMatrix() {
		System.out.println("printing matrix");
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				System.out.print(matrix[i][j]+"  ");
			}
			System.out.println(" ");
		}
		
	}
	public void printGraph() {
		for(int i=0;i<size;i++) {
			System.out.print(i + " is connected to:");
			for (int j=0;j<size;j++) {
				if(matrix[i][j]!=0) {
					System.out.print(j+" ");
				}
				
			}
			System.out.println();
		}
	}
	//modify bfs
	public List<Integer>getadjNodes(int i){
		ArrayList<Integer> adjlist=new ArrayList<Integer>();
				for (int j=0;j<size;j++) {
					if(matrix[i][j]!=0) {
						adjlist.add(j);
					}
					
				}
				return adjlist;
			}
		
	public void dijaskastra(int source,int dst){
//		queueee q=new queueee(4);
		int[] path=new int[size];
		int[] distance=new int[size];
		boolean[] visited=new boolean[size];
		
		for(int i=0;i>size;i++	) {
			path[i]=-1;
		}
		distance[source]=0;
		for(int i=0;i<size;i++) {
			distance[i]=Integer.MAX_VALUE;
			path[i]=1;
		}
		distance[source]=0;
		for(int i=0;i<size;i++){
			int minvertex=findMinVertex(distance,visited);
			visited[minvertex]=true;
			for(int j=0;j<size;j++) {
				//j=0
				if(matrix[minvertex][j]!=0&&!visited[j]) {
					int newdistance=distance[minvertex]+matrix[minvertex][j];
					if(newdistance<distance[j]) {
					distance[j]=newdistance;
					path[j]=minvertex;
				}
			}
			}}
	}
	
	public int findMinVertex(int[] distance,boolean [] visited) {
		int minvertex=-1;
		for(int i=0;i<distance.length;i++) {
			if(!visited[i] && (minvertex==-1 ||distance[i]<distance[minvertex])) {
				minvertex=i;
				//minvertex=0
			}
		}
		return minvertex;
	}
	public void shortpath(int source, int dst) {
		queueee q=new queueee(5);
		int[] path=new int[size];
		int[] distance=new int[size];
		boolean[] visited=new boolean[size];
	
	
	for (int i=0;i<size;i++) {
		path[i]=-1;
		distance[i]=-1;
	}
	distance[source]=0;
	q.enqueue(source);
	visited[source]=true;
	
	while(!q.isempty()){
		int u=q.dequeue();
		Iterator<Integer>iterator=getadjNodes(u).iterator();
		while(iterator.hasNext()) {
			int v=iterator.next();
			if(!visited[v]) {
				distance[v]=distance[u]+1;
				path[v]=u;
				q.enqueue(v);
				visited[v]=true;
			}
		}
		}
	System.out.print("the min distance from"+source+"to destination:");
	System.out.println(distance[dst]);
	int crawl=dst;
	LinkedListtt prevpath=new LinkedListtt();
	prevpath.addNode(dst );
	//crawl=5
	while(path[crawl]!=-1){
		prevpath.addNode(crawl);
		crawl=path[crawl];
	}
	System.out.println("");
	System.out.print("and the shorteest path is");
	for(int i=prevpath.getsize();i>0;i--) {
		System.out.print(prevpath.getDataAtPos(i));
		
	}
	}
		
	public static void main(String [] args) {
		Matrixgraph  aa=new Matrixgraph (5);
//		aa.addEdges(0, 1,20);
//		aa.addEdges(0, 2,30);
//		aa.addEdges(0, 3,0);
//		aa.addEdges(1, 0,50);
//		aa.addEdges(1, 3,60);
		aa.addEdge(0, 1);
		aa.addEdge(0, 2);
		aa.addEdge(1, 4);
		aa.addEdge(2, 3);
		aa.addEdge(3, 4);
		aa.printMatrix();
		aa.printGraph();
		aa.shortpath(0, 4);
	}

}

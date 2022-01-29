package Graph;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listgraph {
	
	LinkedListtt[] list;
	int size;
	listgraph(int v){
		list= new LinkedListtt[v];
		this.size=v;
//		creating linked list for each nodes
		for (int i=0;i<v;i++) {
			list[i]=new LinkedListtt();
		}
	}

	public void addedges(int source,int destination) {
		
		list[source].addNode(destination);
		list[destination].addNode(source);
	}
	
	public void printGraph() {
		for(int i=0;i<size;i++) {
			System.out.print(i + " is connected to ");	
			if(list[i].getsize()>0) {
				for(int j=1;j<=list[i].size;j++) {
					System.out.print(list[i].getDataAtPos(j)+" ");
					
				}
			}
//		list[i].printlist();
			
			System.out.println(" ");
			
		}
		
		
	}
	//getadjnodes(0) i=0;
	public List<Integer> getadNodes(int i){
		ArrayList<Integer> adjlist=new ArrayList<Integer>();
		for(int j=1;j<=list[i].size;j++) {
			//System.out.print(list[i].getDataAtPos(j)+" ");
			adjlist.add(list[i].getDataAtPos(j));
		}
		
		return adjlist;
		
	}
	
	public void BFS(int rootnodes) {
		queueee queuee=new queueee(6);
		boolean [] visited=new boolean[size];
		
		
		visited[rootnodes]=true;
		queuee.enqueue(rootnodes);
		
		while(!queuee.isempty()) {
			int x=queuee.dequeue();
			System.out.println(x);
			Iterator<Integer> iterator=getadNodes(x).iterator();
			while(iterator.hasNext()) {
				int adjval=iterator.next();
				if(!visited[adjval]) {
					queuee.enqueue(adjval);
					visited[adjval]=true;
				}
			}
		}
	}
	
	
	public void DepthFirstSearch(int rootnode){
		System.out.println("printing result");
		boolean[] visited=new boolean[size];
		dfs(rootnode, visited);
	
	
	}
	public void dfs(int rootnode,boolean visited []) {
		visited[rootnode]=true;
		System.out.println(rootnode);
		Iterator<Integer> iterator=getadNodes(rootnode).iterator();
		while(iterator.hasNext()) {
			int adjval=iterator.next();
			if(!visited[adjval]) {
				dfs(adjval,visited);
		}
			}
	
	}
	public static void main(String[] args) {
	listgraph a=new listgraph(6);
	a.addedges(0, 1);
	a.addedges(0, 2);
	a.addedges(1, 3);
	a.addedges(1, 4);
	a.addedges(2, 3);
	a.addedges(3,4);
	a.BFS(0);
	a.DepthFirstSearch(0);
	a.printGraph();
	}
	
}



















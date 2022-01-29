package linlklisttt;

import java.util.HashMap;
//Important question //advance algorithm
public class LRUCaching {
	int capacity;
	HashMap<Integer,Node>map;
	
	LRUCaching(int capacity){
		this.capacity=capacity;
		map=new HashMap<>();
	}
	public void put(int key, int value) {
		if(map.containsKey(key)) {// to  check if key is already exist
			Node node=map.get(key);
			remove(node);
			insert(node);
			//remove element from map and linkedlist
			//insert element
			//update
		}
		else if(map.size()==capacity) {
			remove(tail);
		}
		else {
			Node newnode=new Node(key,value) ;
			insert(newnode);
		}
		
	}
	public int get(int key) {
		Node node=map.get(key);
	if(node==null) {
		return-3;
	}
	else {
		remove (node);
		insert (node);
		return node.value;
	}
	}
	
	public void remove(Node node) {
		map.remove(node.key);
		if(node==tail) {
			tail.prev.next=null;
			tail=tail.prev;
			node.prev=null;
		}
		else if(node==head) {
			head=head.next;
			node.next=null;
			head.prev=null;
			
		}
		else if(head==tail && node==head) {
			head=tail=null;
			
		}
		else {
			node.prev.next=node.next;
			node.next.prev=node.prev;
			node.next=null;
			node.prev=null;
		}
	}
	
	Node head=null;
	Node tail=null;
	
	public void insert(Node newnode) {
		map.put(newnode.key, newnode); //insert in hash map
		if(head==null) {
			head=tail=newnode;
		}
		else {
			head.prev=newnode;
			newnode.next=head;    //insert left side
			head=newnode;
		}
	}
	
	
	public static class Node{
		int key;
		int value;
		Node next;
		Node prev;
		
		Node(int key,int value){
			this.key=key;
			this.value=value;
			this.next=null;
			this.prev=null;
		}
		
	}

}

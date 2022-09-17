
public class Basics {
	
	public static void traverse(Node head) {
		Node cur = head;
		while(cur != null) {
			System.out.println(cur.data);
			cur = cur.next;
		}
	}
	
	static void insert(int data, Node head, int pos) {
		
		Node toAdd = new Node(data);
		
		if(pos == 0) {
			toAdd.next = head;
			head = toAdd;
			return; 
		}
		
		Node prev = head;
		for(int i=0; i<pos-1; i++) {
			prev = prev.next;
		}
		toAdd.next = prev.next;
		prev.next = toAdd;
		return;
		
	}
	
	static void delete() {
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = null;
		
		// Traversing Linked List
		traverse(head);
		
		System.out.println();
		
		//Inserting in lInkedList
		insert(40,head,2);
		traverse(head);

	}

}

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
	}
}


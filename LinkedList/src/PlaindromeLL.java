
public class PlaindromeLL{
	
	
	static void traverse(Node head) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Node n1 = new Node('r');
		Node n2 = new Node('a');
		Node n3 = new Node('c');
		Node n4 = new Node('e');
		Node n5 = new Node('c');
		Node n6 = new Node('a');
		Node n7 = new Node('r');
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = n6;
		n6.next = n7;
		n7.next = null;
		
		traverse(head);
	}

}

//class Node {
//	char data;
//	Node next;
//	Node(char data){
//		this.data = data;
//	}
//}


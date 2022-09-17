
public class ReverseLinkedList extends Basics{
	
	//Reversing Iteratively
	static Node reverse(Node head) {
		
		Node cur = head;
		Node prev = null;
		Node temp = cur.next;
		
		while(cur != null) {
			temp = cur.next;
			cur.next = prev;
			prev = cur;
			cur = temp;
		}
		return prev;
		
	}
	
	//Reversing Recursively
	static Node recursiveReverse(Node head) { 
		if(head == null || head.next == null) {
			return head;
		}
		
		Node newHead = reverse(head.next);
		Node headNext = head.next;
		headNext.next = head;
		head.next = null;
		
		
		return newHead;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node n1 = new Node(10);
		Node n2 = new Node(20);
		Node n3 = new Node(30);
		Node n4 = new Node(40);
		Node n5 = new Node(50);
		
		Node head = n1;
		head.next = n2;
		n2.next = n3;
		n3.next = n4;
		n4.next = n5;
		n5.next = null;
		
		head = recursiveReverse(head);
		traverse(head);
		
		
	}

}


//final class Node{
//	int data;
//	Node next;
//	Node(int data){
//		this.data = data;
//	}
//}
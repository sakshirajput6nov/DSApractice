package gfg;

public class deleteAtHead {

	static Node deleteAtHead(Node head) {
		
		if(head==null) {
			System.out.println("empty list");
			return null;
		}
		head=head.next;
		
		
		
		return head;
	}
	static void display(Node head) {
		Node temp=head;
		if(temp==null) {
			return;
		}
		System.out.println(temp.val);
		display(temp.next);
		//System.out.println(temp.val); used to print from last node 15 13 11 10
		
		
	}
	public static void main(String[]args) {
		Node a=new Node(10);

		Node b=new Node(11);
		Node c=new Node(13);
		Node d=new Node(15);
		b.next=c;
		c.next=d;
		a.next=b;
		Node k=deleteAtHead(a);
		display(k);
	}
}

package gfg;

public class LinkedListUsingRecursion {
	static void display(Node head) {
		Node temp=head;
		if(temp==null) {
			return;
		}
		System.out.println(temp.val);
		display(temp.next);
		//System.out.println(temp.val); used to print from last node 15 13 11 10
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(10);

		Node b=new Node(11);
		Node c=new Node(13);
		Node d=new Node(15);
		b.next=c;
		c.next=d;

		a.next=b;
		display(a);
	}

}

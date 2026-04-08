package gfg;
// since formed in same package can use Node class 
public class DisplayLinkedListUsingFor_WhileLoop {
	static void display(Node head) {
// using while loop 
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.val);
			temp=temp.next;
		}
		return ;
// using for loop 
//		for(Node temp=head;temp!=null;temp=temp.next) {
//			System.out.println(temp.val);
//		}
//		return;
		
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

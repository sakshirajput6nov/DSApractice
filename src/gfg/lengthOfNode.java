package gfg;

public class lengthOfNode {
	static int length(Node head) {
		Node temp=head;
		if(head==null) {
			return 0;
		}
		int count=0;
		while(temp!=null) {
			temp=temp.next;
			count++;
		}
		return count;
		
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
		System.out.println(length(a));
	}

}

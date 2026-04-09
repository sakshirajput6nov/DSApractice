package gfg;

public class deleteIndex {
	static Node deleteAtHead(Node head) {
		if(head==null) {
			System.out.println("empty list");
			return null;
		}
		head=head.next;
		return head;
		
	}
	static Node deleteAtTail(Node head) {
		if(head==null ||head.next==null) {
			//for empty list and single node list which become empty after deletion
			return null;
		}
		Node temp=head;
		while(temp.next.next!=null) {
			//for second last node
			temp=temp.next;
		}
		temp.next=null;
		return head;
		
	}
	static Node delete(Node head,int idx) {
		Node temp=head;
		int size=length(head);
		if(idx>=size || idx<0) {
			System.out.println("invalid index");
			return head;
		}
		if(idx==0) {
			return deleteAtHead(head);
		}
		temp=head;
		if(idx==size-1) {
			return deleteAtTail(head);
		}
		temp=head;
		
		for(int i=1;i<=idx-1;i++) {
			temp=temp.next;
		}
		temp.next=temp.next.next;
		
		
		return head;
	}
	
	static void display(Node head){
		Node temp=head;
		if(temp==null) {
			return;
		}
		System.out.println(temp.val);
		display(temp.next);
		//System.out.println(temp.val); used to print from last node 15 13 11 10
		
		
	}
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
		  Node a = new Node(10);
	        Node b = new Node(11);
	        Node c = new Node(13);
	        Node d = new Node(15);

	        a.next = b;
	        b.next = c;
	        c.next = d;
	        int target=2;
	       Node g=delete(a,target);
	       display(g);

	}

}

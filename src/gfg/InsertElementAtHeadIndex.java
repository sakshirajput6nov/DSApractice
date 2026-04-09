package gfg;

public class InsertElementAtHeadIndex {
//	class Node{
//		int val;
//		Node next;
//		Node(int x){
//			this.val=x;
//			next =null;
//		}
//	}
	
		
		static void display(Node head) {
			Node temp=head;
			if(temp==null) {
				return;
			}
			System.out.println(temp.val);
			display(temp.next);
			//System.out.println(temp.val); used to print from last node 15 13 11 10
			
			
		}
		
		
	static Node insertAtHead(int val,Node head) {
		Node t=head;
		Node temp=new Node(val);
		
		
		
		if(head==null) {
			head=temp;
			
		}
		else {
			temp.next=head;
			head=temp;
		}
		return head;
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(10);
		Node b=new Node(11);
		Node c=new Node(13);
		Node d=new Node(15);
		Node l=new Node(11);
		b.next=c;
		c.next=d;
		a.next=b;
		int val=12;
		Node k=insertAtHead(val,a);
		display(k);
	
		
	}

}

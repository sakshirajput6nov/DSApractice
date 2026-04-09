package gfg;
//class Node{
//	int val;
//	Node next;
//	Node(int x){
//		this.val=x;
//		next =null;
//	}
//}
public class isValuePresent {
	
	static boolean search(Node head,int target) {
		Node temp=head;
		if(temp==null) {
			return false;
		}
		while(temp!=null) {
			if(target==temp.val) {
				
				return true;
				
			}
			temp=temp.next;
		}
		return false;
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
		int target=115;
		System.out.println(search(a,target));
		
	}

}

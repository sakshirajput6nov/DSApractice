package gfg;

public class valuePresentAtIndex {



//class Node{
//	int val;
//	Node next;
//	Node(int x){
//		this.val=x;
//		next =null;
//	}
//}

	
	static int search(Node head,int target) {
		Node temp=head;
		if(temp==null) {
			return -1;
		}
		int idx=-1;
		while(temp!=null) {
			if(target==temp.val) {
				
				return idx;
				
			}
			idx++;
			temp=temp.next;
		}
		return -1;
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
		int target=15;
		System.out.println(search(a,target));
		/// based on indexing from 0
		
	}

}
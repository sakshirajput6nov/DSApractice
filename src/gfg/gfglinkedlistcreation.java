// create a linked list from scratch
package gfg;
class Node{
	int val;
	Node next;
	Node(int x){
		this.val=x;
		next =null;
	}
}

public class gfglinkedlistcreation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node a=new Node(10);
		System.out.println(a);
		Node b=new Node(11);
		Node c=new Node(13);
		Node d=new Node(15);
		b.next=c;
		c.next=d;
		System.out.println(b);
		a.next=b;
		System.out.println(a.val +" "+ b.val);
		System.out.println(a.next +" "+ b.next+" "+ a.next.val);
		System.out.println(c.next +" "+ d.next+" "+ c.next.val);
		
		
		System.out.println(b.next.val);
		//System.out.println(d.next.val);
		// this gives error 
	}

}

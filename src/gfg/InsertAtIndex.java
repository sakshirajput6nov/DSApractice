
//package gfg;
////class Node{
////int val;
////Node next;
////Node(int x){
////	this.val=x;
////	next =null;
////}
////}
//
//public class InsertAtIndex {
//	static Node insertAtTail(int value,Node head) {
//		Node tail=new Node(value);
//		if(head==null) {
//			head=tail;
//			return head;
//		}
//		
//		Node temp=head;
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		temp.next=tail;
//		return head;
//	}
//	static Node insertAtIndex(Node head,int idx,int value) {
//		Node t=new Node(value);
//		Node temp=head;
//		int size=length(temp);
//		temp=head;
//		if(idx>size ||idx<0) {
//			System.out.println("invalid index");
//			return head;
//		}
//		if(idx==0) {
//			if(head==null) {
//			t.next=temp;
//			temp=t;
//			return temp;
//			}
//			else {
//				t.next=head;
//				head=t;
//				return head;
//			}
//		}
//		temp=head;
//		if(idx==size) {
//			insertAtTail(value,temp);
//			return temp;
//		}
//		temp=head;
//		for(int i=1;i<=idx-1;i++) {
//			temp=temp.next;
//		}
//		t.next=temp.next;
//		temp.next=t;
//		return head;
//		
//	}
//		
//	static void display(Node head) {
//		Node temp=head;
//		if(temp==null) {
//			return;
//		}
//		System.out.println(temp.val);
//		display(temp.next);
//		//System.out.println(temp.val); used to print from last node 15 13 11 10
//		
//		
//	}
//		
//		
//
//	static int length(Node head) {
//		Node temp=head;
//		if(head==null) {
//			return 0;
//		}
//		int count=0;
//		while(temp!=null) {
//			temp=temp.next;
//			count++;
//		}
//		return count;
//		
//	}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Node a=new Node(10);
//
//		Node b=new Node(11);
//		Node c=new Node(13);
//		Node d=new Node(15);
//		b.next=c;
//		c.next=d;
//		a.next=b;
//		int target=17;
//		int index=2;
//		
//		insertAtIndex(a,index,target);
//		display(a);
//	}
//
//}
package gfg;

public class InsertAtIndex {

    static Node insertAtTail(int value, Node head) {
        Node newNode = new Node(value);

        if (head == null) return newNode;

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = newNode;
        return head;
    }

    static Node insertAtIndex(Node head, int idx, int value) {
        Node newNode = new Node(value);

        int size = length(head);

        if (idx > size || idx < 0) {
            System.out.println("Invalid index");
            return head;
        }

        //  Insert at head
        if (idx == 0) {
            newNode.next = head;
            return newNode;
        }

        //  Insert at tail
        if (idx == size) {
            return insertAtTail(value, head);
        }

        //  Insert in middle
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }

    static void display(Node head) {
        while (head != null) {
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    static int length(Node head) {
        int count = 0;
        while (head != null) {
            count++;
            head = head.next;
        }
        return count;
    }

    public static void main(String[] args) {

        Node a = new Node(10);
        Node b = new Node(11);
        Node c = new Node(13);
        Node d = new Node(15);

        a.next = b;
        b.next = c;
        c.next = d;

        int index = 2;
        int value = 17;

        a = insertAtIndex(a, index, value); 

        display(a);
    }
}

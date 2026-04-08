package gfg;

public class getElementFromIndex {
	static int get(Node head,int idx) {
		// node =[10,11,13,15]
		Node temp=head;
		int len=0;
		while(temp!=null) {
			temp=temp.next;
			len++;
		}
		temp=head;
		if(idx<0 ||idx >=len) {
			return -1;
		}
		
		for(int i=0;i<idx;i++) {
			temp=temp.next;
		}
		return temp.val;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Node a=new Node(10);

				Node b=new Node(11);
				Node c=new Node(13);
				Node d=new Node(15);
				b.next=c;
				c.next=d;

				a.next=b;
				int targetindex=-1;
				int result=get(a,targetindex);
				System.out.println(result);
				
				 targetindex=7;
				 result=get(a,targetindex);
				System.out.println(result);
				
				targetindex=3;
				 result=get(a,targetindex);
				System.out.println(result);

	}

}

package Qspider;
//copy constructor
public class Q1_Copy_Constructor {
	String name;
	int price;
	String color;
	Q1_Copy_Constructor(int x){
		price=x;
	}
//	Q1(Q1 p){
//		this.price=p.price;
//	}
	Q1_Copy_Constructor(Q1_Copy_Constructor p){
		this(p.price);
	}
public static void main(String[]args) {
	Q1_Copy_Constructor q=new Q1_Copy_Constructor(2);
	Q1_Copy_Constructor q1=new Q1_Copy_Constructor(q);
	//copy constructor
	System.out.println(q.price);
	System.out.println(q1.price);

}
}

package Qspider;
// shallow and deep copy 
public class Q2_deep_shallow_copy {
	//class object refer to other class object
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// normally this happen when different object simple objects		
//		student s=new student("sakshi",53,new Address("Noida",121,"UP"));
//		student s1=new student("Rajput",00,new Address("gzb",00,"Uk"));
//		System.out.println(s.name);
//		System.out.println(s.rollNo);
//		System.out.println(s.a.city);
//		System.out.println(s.a.pin);
//		System.out.println(s.a.state);
//		
//		System.out.println(s1.name);
//		System.out.println(s1.rollNo);
//		System.out.println(s1.a.city);
//		System.out.println(s1.a.pin);
//		System.out.println(s1.a.state);
				
		student s=new student("sakshi",53,new Address("Noida",121,"UP"));
		student s1=new student(s);
		System.out.println(s.name);
		System.out.println(s.rollNo);
		System.out.println(s.a.city);
		System.out.println(s.a.pin);
		System.out.println(s.a.state);
		
		System.out.println(s1.name);
		System.out.println(s1.rollNo);
		System.out.println(s1.a.city);
		System.out.println(s1.a.pin);
		System.out.println(s1.a.state);
		// make change in address  
		s1.a.city="ramnagar";
		s1.rollNo=1000;
		System.out.println(s1.a.city);//ramnagar
		System.out.println(s.a.city);//ramnagar
		System.out.println(s1.rollNo);//1000 here not change in both bcz not shallow copy
		System.out.println(s.rollNo);//53
		
	}
}
class student{
	String name;
	int rollNo;
	Address a;
	student(String name,int rollNo,Address a){
		this.name=name;
		this.rollNo=rollNo;
		this.a=a;
	}
	student(student s){//copy constructor 
		this.name=s.name;
		this.rollNo=s.rollNo;
//		this.a=s.a;// for shallow copy
		this.a=new Address(s.a.city,s.a.pin,s.a.state);//for deep copy
		
	}
}
class Address{
	String city;
	int pin;
	String state;
	Address(String city,int pin ,String state){
		this.city=city;
		this.pin=pin;
		this.state=state;
		
	}
}


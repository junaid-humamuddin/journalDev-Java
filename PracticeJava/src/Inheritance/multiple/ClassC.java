package Inheritance.multiple;

//this is just an assumption to explain the diamond problem
//this code won't compile
/*public class ClassC extends ClassA, ClassB{

	public void test(){
		//calling super class method
		doSomething();
	}

}*/

public class ClassC{
	SuperClass obj;
	
	public ClassC(SuperClass o){
		this.obj = o;
	}
	public void test(){
		obj.doSomething();
	}
	
	public static void main(String args[]){
		ClassC obj1 = new ClassC(new ClassA());
		ClassC obj2 = new ClassC(new ClassB());
		
		SuperClass a = new ClassA();
		SuperClass b = new ClassB();
		
		obj1.test();
		obj2.test();
		a.doSomething();
		b.doSomething();
	}
}
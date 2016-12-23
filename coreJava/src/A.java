class B extends A {
	
	
	public void print(B b) {
		System.out.println("B");
	}
	
	
	public void print(A a) {
		System.out.println("A");
	}

}


public class A {

	public static void main(String[] args) {
		B b = new B();
		b.print(new B());
	}
}


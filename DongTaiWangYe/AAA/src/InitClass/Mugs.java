package InitClass;
	
class Mug{
	Mug(int marker)
	{
		System.out.println("Mug("+marker+")");
	}

}


public class Mugs
{
	int i = printNumber(8);
	Mug mug1;
	Mug mug2;
	{
		mug1 = new Mug(1);
		mug2 = new Mug(2);
	}
	
	Mugs(){
		System.out.println("Mugs()");
	}
	
	Mugs(int n)
	{
		System.out.println("Mugs("+n+")");
	}
	
	int printNumber(int n)
	{
		System.out.println(n);
		return n;
	}
	public static void main(String[] args) {
		System.out.println("new Mugs(): ");
		new Mugs();
		
		System.out.println("\nnew Mugs(n): ");
		new Mugs(6);
	}
}


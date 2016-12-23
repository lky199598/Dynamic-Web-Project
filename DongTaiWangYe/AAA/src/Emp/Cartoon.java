package Emp;

class Art{
	Art(){
		System.out.println("Art constructor");
	}
}

class Drawing extends Art
{
	Drawing(int i)
	{
		System.out.println("Drawing constructor");
	}
}


public class Cartoon extends Drawing{
	Cartoon() {
		super(6);
		System.out.println("Cartoon constructor");
	}
	
	public static void main(String[] args) {
		final int[] a = {1,2,3,4,5};
		for(int i=0; i<a.length; i++)
		{
			a[i]++;
			System.out.print(a[i]);
		}
		
	}

}






















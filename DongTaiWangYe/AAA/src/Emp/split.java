package Emp;

public class split {

	public static void main(String[] args)
	{

		String s=".aaa.bbb.ccc.ddd.eee";
		String[] str=s.split("\\.",3);
		System.out.println(str.length);
		
		for(String st : str)
			System.out.print(st+"\t");
	}
}

package FrameWork;

import java.lang.reflect.Proxy;
import java.util.*;

class StringCount extends HashMap<String, Integer>
{
	private List<String> list = new ArrayList<String>(Arrays.asList("aaa", "bbb", "ccc"));
	private Random rand  = new Random(47);
	String randomPerson()
	{		
		return list.get(rand.nextInt(list.size()));
	}
	
	void add(String str)
	{
		Integer n = get(str);
		put(str, n==null ? 0:n+1);
	}
	
	
	void createString(int size)
	{
		for(int i=0; i<size; i++)
		{
			String str = randomPerson();
			add(str);
		}
	}
	
	void print()
	{
		Set<Map.Entry<String, Integer>> entry = this.entrySet();
		
		for(Map.Entry<String, Integer> e:entry)
			System.out.println(e.getKey()+"  "+e.getValue());
	}

}

public class StudentExtendsMap{
	
	public static void main(String[] args) {
		
	}
}

package FrameWork;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapClass {

	public static void put(TreeMap<Students, Integer> treemap) {
		treemap.put(new Students("aaa", 18), 1);
		treemap.put(new Students("aaa", 18), 2);
		treemap.put(new Students("aaa", 20), 3);
		treemap.put(new Students("aaa", 19), null);

	}

	public static void query1(TreeMap<Students, Integer> treemap) {
		Set<Entry<Students, Integer>> entry = treemap.entrySet();
		for (Entry<Students, Integer> e : entry) {
		
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		System.out.println();
	}

	public static void query2(TreeMap<Students, Integer> treemap)
	{
		Iterator<Entry<Students, Integer>> iterator  = treemap.entrySet().iterator();
	    while(iterator.hasNext())
	    {
	    	Entry<Students, Integer> entry = iterator.next();
	    	System.out.println(entry.getKey()+"\t"+entry.getValue());
	    	
	    }
	}
	
	public  static void query3(TreeMap<Students, Integer> treemap)
	{
		Set<Students> setStudent =  treemap.keySet();
		for(Students stu:setStudent)
		{
			System.out.println(stu+"\t"+treemap.get(stu));
		}
	}
	
	public static void query4(TreeMap<Students, Integer> treemap)
	{
		Iterator<Students> iterator =  treemap.keySet().iterator();
		while(iterator.hasNext())
		{
			Students stu = iterator.next();
		    System.out.println(stu+"\t"+treemap.get(stu));
		}
	}
	
	public static void main(String[] args) {
     TreeMap<Students, Integer> treemap = new TreeMap<Students, Integer>(new StudentsComparator());
     put(treemap);
     query1(treemap);
     query2(treemap);
     query3(treemap);
     query4(treemap);
	}

}


class StudentsComparator implements Comparator<Students>
{

	@Override
	public int compare(Students o1, Students o2) {
		int num = new Integer(o1.getAge()).compareTo(o2.getAge());
        return num==0 ? o1.getName().compareTo(o2.getName()) : num;
	}
}

class Students{
	private int age;
	private String name;

	Students(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		return name + "::" + age;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
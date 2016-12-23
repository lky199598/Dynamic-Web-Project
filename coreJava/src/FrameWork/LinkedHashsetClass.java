package FrameWork;

import java.util.Iterator;
import java.util.LinkedHashSet;


public class LinkedHashsetClass {
	
	public static void add(LinkedHashSet<Student> hash)
	{
		//存入Set的每个元素都必须是唯一的，因为Set不保存重复元素
		Student[] s = new Student[4];
		s[0] = new Student(1);
	    s[1] = new Student(2);
		s[2] = new Student(3);
		s[3] = new Student(3);
		for(int i=0; i<4; i++)
			hash.add(s[i]);
		
		//集合元素可以是null,但只能放入一个null
		hash.add(null);
		hash.add(null);
	}
	
	public static void remove(LinkedHashSet<Student> hash)
	{
		hash.remove(hash);
	}
	
	public static void query1(LinkedHashSet<Student> hash)
	{
		//当遍历该集合时候，LinkedHashSet将会以元素的添加顺序访问集合的元素
		System.out.println("hash.size(): "+hash.size());
		for(Student s:hash)	
		{
			System.out.print(s);
			if(s!=null)
				System.out.print(", id: "+s.id);
			System.out.println();
		}
		System.out.println();
	}
	
	public static void query2(LinkedHashSet<Student> hash)
	{
		//当遍历该集合时候，LinkedHashSet将会以元素的添加顺序访问集合的元素
		System.out.println("hash.size(): "+hash.size());
		
		//返回对此 set 中元素进行迭代的迭代器
		Iterator<Student> stu = hash.iterator();
		while(stu.hasNext())
		{
			Student s = stu.next();
			System.out.print(s);
			if(s != null)
				System.out.print(", id: "+s.id);
			System.out.println();
		}
		System.out.println();
	}
	
public static void main(String[] args) {

	LinkedHashSet<Student> hash = new LinkedHashSet<Student>();
	
	add(hash);
	query1(hash);
	query2(hash);

}


}
/*
class Student
{
	int id;
	String name;
	double grade;
	
	public Student(int id)
	{
		this.id = id;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(grade);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + id;
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
		Student other = (Student) obj;
		if (Double.doubleToLongBits(grade) != Double
				.doubleToLongBits(other.grade))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

*/
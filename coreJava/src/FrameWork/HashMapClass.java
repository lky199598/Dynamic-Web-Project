package FrameWork;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapClass {
	public static void put(Map<Students, Integer> goods)
	{
		Students s1 = new Students("aaa", 18);
		Students s2 = new Students("aaa", 18);
		Students s3 = new Students("aaa", 18);
		Students s4 = new Students("bbb", 21);
		
		goods.put(s1, 1);
		goods.put(s2, 1);
		goods.put(s3, 2);//键相同，值覆盖
		goods.put(s4, 3);
		goods.put(s3, null);
		goods.put(null, null);
		
	}
	
	public static void query1(Map<Students, Integer> goods)
	{	
		//entrySet() 返回此映射所包含的映射关系的 Set 视图
		Set< Entry<Students, Integer> > entry = goods.entrySet();
		
		for (Entry<Students, Integer> e : entry) {
			System.out.println(e.getKey() + "\t" + e.getValue());
		}
		System.out.println();
	}
	
	
	public static void query2(Map<Students, Integer> goods)
	{	

		//第二种方法
		Iterator< Map.Entry<Students, Integer> > iterator=goods.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Students, Integer> entry = iterator.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		System.out.println();
	}
	
	public static void query3(Map<Students, Integer> goods)
	{	
		
		 
		//第三种方法,　效率低,以后尽量少使用！
		// Set<K> keySet()    返回此映射中所包含的键的 Set 视图。 
		Set<Students> set  = goods.keySet();
		
		for (Students key : set) {
		System.out.println(key+"\t"+goods.get(key));
		}
		System.out.println();
	}
	
	public static void query4(Map<Students, Integer> goods)
	{	

		//第四种方法,效率低,以后尽量少使用！
		Iterator<Students> interator = goods.keySet().iterator(); 
		while(interator.hasNext())
		{
			Students stu = interator.next();
			System.out.println(stu+"\t"+goods.get(stu));
		}
	}
	
	 /*对于keySet其实是遍历了2次，一次是转为iterator，一次就从hashmap中取出key所对于的value。
	 而entryset只是遍历了第一次，他把key和value都放到了entry中，所以就快了。*/
	
	public static void main(String[] args)
	{	
	Map<Students, Integer> goods = new HashMap<Students, Integer>();
	put(goods);
	query1(goods);
	query2(goods);
	query3(goods);
	query4(goods);
	}
	// Set<Map.Entry<K,V>> entrySet() 返回此映射所包含的映射关系的 Set 视图。	
}


/*class Students
{
    private int age;
    private String name;
    
    Students(String name,int age)
    {
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


	public String toString()
    {
        return name+"::"+age;
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
*/




package FrameWork;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListClass {
	public  void add(ArrayList<String> list)
	{
		list.add("CCC");
		for(String s:list)
			System.out.print(s+"  ");
		System.out.println("\n");
	}
	
	public void print(ArrayList<String> list)
	{
		Iterator<String> i = list.iterator();
		
	}
	
	public void print(ArrayList<Integer> list)
	{
		
	}
	
	
	public static void remove(ArrayList<String> list)
	{
		list.remove(2);
		for(int i=0; i<list.size(); i++)
			System.out.print(list.get(i)+"  ");		
		System.out.println("\n");
	}
	
	
	
	
public static void main(String[] args) {
	/*ArrayList<Students> list = new ArrayList<Students>();
	list.add(new Students("aaa", 18));
	list.add(new Students("aaa", 18));
	list.add(new Students("aaa", 19));
	for(Students stu:list)
		System.out.println(stu);*/
	
	
	ArrayList<String> arrayList1=new ArrayList(); //第一种 情况
	arrayList1.add("aaa");
	arrayList1.add(18);
	
	
	ArrayList arrayList2=new ArrayList<String>();//第二种 情况
	arrayList2.add("aaa");
	arrayList2.add(18);
	
	
	/*System.out.println(ArrayList.class);
	System.out.println(new ArrayList<Integer>().getClass());	
	System.out.println(new ArrayList<String>().getClass());*/
	
}
}




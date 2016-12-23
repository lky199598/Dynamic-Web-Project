package Emp;

import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;

public class HashMapIterator {

	public static void main(String[] args) 
	{
	    HashMap hashmap = new HashMap();
		for(int i = 0; i < 1000; i++) 
		{
		¡¡¡¡hashmap.put("i" , "thanks");
		¡¡}
		
		¡¡¡¡long bs = Calendar.getInstance().getTimeInMillis();
		¡¡¡¡Iterator iterator = hashmap.keySet().iterator();
		¡¡¡¡while (iterator.hasNext()) {
		¡¡¡¡System.out.print(hashmap.get(iterator.next()));
		¡¡¡¡}
		¡¡¡¡System.out.println();
		¡¡¡¡System.out.println(Calendar.getInstance().getTimeInMillis() - bs);
		¡¡¡¡listHashMap();
		¡¡¡¡}
	
		¡¡¡¡public static void listHashMap()
		{
		¡¡¡¡java.util.HashMap hashmap = new java.util.HashMap();
		¡¡¡¡for (int i = 0; i < 1000; i ){
		¡¡¡¡hashmap.put("" i, "thanks");
		¡¡¡¡}
		¡¡¡¡long bs = Calendar.getInstance().getTimeInMillis();
		¡¡¡¡java.util.Iterator it = hashmap.entrySet().iterator();
		¡¡¡¡while (it.hasNext()){
		¡¡¡¡java.util.Map.Entry entry = (java.util.Map.Entry) it.next();
		¡¡¡¡entry.getKey()// ·µ»ØÓë´ËÏî¶ÔÓ¦µÄ¼ü
		¡¡¡¡entry.getValue() //·µ»ØÓë´ËÏî¶ÔÓ¦µÄÖµ
		¡¡¡¡System.out.print(entry.getValue());
		¡¡¡¡}
		¡¡¡¡System.out.println();
		¡¡¡¡System.out.println(Calendar.getInstance().getTimeInMillis() - bs);
		¡¡¡¡}
}

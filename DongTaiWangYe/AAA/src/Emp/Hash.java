package Emp;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Hash {

	public static void main(String args[]) {
		
		String s1 = "aaa";
		String s2 = "aaa";
		
		Map<String, Integer> goods = new HashMap<String, Integer>();
		goods.put(s1, 1);
		goods.put("bbb", 2);
		goods.put(s2, 6);

		// Set<Map.Entry<K,V>> entrySet() ���ش�ӳ����������ӳ���ϵ�� Set ��ͼ��
		
		//��һ�ַ���
		for (Entry<String, Integer> entry : goods.entrySet()) {
			System.out.println(entry.getKey() + "\t" + entry.getValue());
		}
		System.out.println();
		
		
		
		/*
		//�ڶ��ַ���
		Iterator<Map.Entry<String, Integer>> iterator=goods.entrySet().iterator();
		while(iterator.hasNext())
		{
			Map.Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}
		
		
		//�����ַ���
		// Set<K> keySet()    ���ش�ӳ�����������ļ��� Set ��ͼ�� 
		System.out.println();
		for (String key : goods.keySet()) {
		System.out.println(key+"\t"+goods.get(key));
		}
		
		//�����ַ���
		System.out.println();
		Set<Entry<String, Integer>> entrySet = goods.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey()+"\t"+entry.getValue());
		}*/
	}

}

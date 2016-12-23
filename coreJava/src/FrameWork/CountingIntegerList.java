package FrameWork;

import java.util.AbstractList;

public class CountingIntegerList extends AbstractList<Integer>{

	@Override
	public Integer get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	public void print() throws Exception
	{
		Class c = new Integer(8).getClass();
		try {
			c.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
			  throw new Exception();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

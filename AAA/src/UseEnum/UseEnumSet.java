package UseEnum;

import java.util.EnumMap;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map.Entry;

public class UseEnumSet {
	public static void main(String[] args)
	{
		// EnumSet��ʹ��
        EnumSet<EnumTest> weekSet = EnumSet.allOf(EnumTest.class);
        
        for(EnumTest day : weekSet)
        {
            System.out.println(day);
        }
 
        // EnumMap��ʹ��
        EnumMap<EnumTest, String> weekMap = new EnumMap(EnumTest.class);
        
        weekMap.put(EnumTest.MON, "����һ");
        weekMap.put(EnumTest.TUE, "���ڶ�");
        
        // ... ...
        for(Iterator< Entry<EnumTest, String> > iter = weekMap.entrySet().iterator(); iter.hasNext();)
        {
            Entry<EnumTest, String> entry = iter.next();
            System.out.println(entry.getKey().name() + ":" + entry.getValue());
        }
	}
}

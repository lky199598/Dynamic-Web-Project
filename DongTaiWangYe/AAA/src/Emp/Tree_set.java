package Emp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;


 
class Tree_set 
{
    public static void main(String[] args)  
    {
     List<Student> list = new ArrayList<Student>();
     list.add(new Student("aaa", 60));
     list.add(new Student("aaa", 80));
     list.add(new Student("aaa", 70));
     //����  Collections.sort(list)����;������Student�ఴ��ʵ�ֵĽӿڣ�����洢��List������
     Collections.sort(list);
     for(Student stu:list)
    	 System.out.println(stu);
    }
}
 
//ͬ����ͬ�����ѧ����Ϊͬһ��ѧ��������ѧ������������
class Student implements Comparable
{
    private int age;
    private String name;
    Student(String name,int age)
    {
        this.age = age;
        this.name = name;
    }
 
    public int compareTo(Object obj)
    {
        
        Student stu = (Student)obj;
        
        int num = new Integer(this.age).compareTo(new Integer(stu.age));
 
        return num==0?this.name.compareTo(stu.name):num;
 
        
     /*   if(this.age>stu.age)
            return 1;
        if(this.age==stu.age)
            return this.name.compareTo(stu.name);
        return -1;
        */
        
        
    }
    
 
    public int getAge()
    {
        return age;
    }
    @Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + "]";
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
		Student other = (Student) obj;
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

 


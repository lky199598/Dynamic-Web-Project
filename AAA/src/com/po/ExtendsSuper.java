package com.po;

import java.util.ArrayList;
import java.util.List;

class Food{}
class Fruit extends Food{}
class Apple extends Fruit{}
class RedApple extends Apple{}


public class ExtendsSuper {
  public static void main(String[] args) {
	 List<? extends Fruit> flist = new ArrayList<? extends Fruit>();
	
	 flist.add(RedApple);
    flist.add(new Apple());

	flist.add(null); // only work for null
	String str = new String();
	str.indexOf(str)
}
}

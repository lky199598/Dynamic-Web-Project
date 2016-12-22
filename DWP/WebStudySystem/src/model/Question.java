package model;

import java.util.ArrayList;

public class Question{
	
   private int questionID;
   private String content;//问题内容
   
   private ArrayList<String> options;//选项
   
   private ArrayList<Character> correct;//正确答案
   
   private double score;//每题分数
   
   public Question(){}
   
}

package test;


import java.util.Random;

public class RandomClass {
	
public static void main(String[] args) {
	Random rand =  new Random(10);
	for(int i=0; i<5; i++)
		System.out.println(rand.nextInt(8));
	System.out.println("\n");
	Random rand1 = new Random(10);
	for(int i=0; i<5; i++)
		System.out.println(rand1.nextInt(8));
	
	System.out.println("Test.........");
}
}

package com.comparable;

import java.util.Arrays;

public class FruitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruit[] f=new Fruit[3];
		f[0]=new Fruit(1,"Kesar Mango","Kokan Special",200);
		f[1]=new Fruit(2, "Grapes","Nashik Special", 30);
		f[2]=new Fruit(3, "Banana", "Indian Fruit", 250);
		
		System.out.println("before sorting fruit");
		for (Fruit fruit : f) {
			System.out.println(fruit.toString());
		}
		Arrays.sort(f);
		System.out.println("After sorting fruit");
		for (Fruit fruit : f) {
			System.out.println(fruit);
		}

	}

}

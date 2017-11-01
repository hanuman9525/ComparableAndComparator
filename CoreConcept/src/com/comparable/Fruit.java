package com.comparable;

import java.util.Comparator;

public class Fruit implements Comparable<Fruit>{
private int fruitId;
private String fruitName;
private String fruitDesc;
private int quantity;

public Fruit(int fruitId, String fruitName, String fruitDesc, int quantity) {
	super();
	this.fruitId = fruitId;
	this.fruitName = fruitName;
	this.fruitDesc = fruitDesc;
	this.quantity = quantity;
}
public int getFruitId() {
	return fruitId;
}
public void setFruitId(int fruitId) {
	this.fruitId = fruitId;
}
public String getFruitName() {
	return fruitName;
}
public void setFruitName(String fruitName) {
	this.fruitName = fruitName;
}
public String getFruitDesc() {
	return fruitDesc;
}
public void setFruitDesc(String fruitDesc) {
	this.fruitDesc = fruitDesc;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
@Override
public String toString() {
	return "Fruit [fruitId=" + fruitId + ", fruitName=" + fruitName + ", fruitDesc=" + fruitDesc + ", quantity="
			+ quantity + "]";
}
@Override
public int compareTo(Fruit object) {
	// TODO Auto-generated method stub
	return this.quantity-object.quantity;
}

}

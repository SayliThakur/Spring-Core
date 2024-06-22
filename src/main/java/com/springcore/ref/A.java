package com.springcore.ref;

public class A 
{
private int Id;
private String Name;
private B Address;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public B getAddress() {
	return Address;
}
public void setAddress(B address) {
	Address = address;
}
public A(int id, String name, B address) {
	super();
	Id = id;
	Name = name;
	Address = address;
}
public A() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "A [Id=" + Id + ", Name=" + Name + ", Address=" + Address + "]";
}


}

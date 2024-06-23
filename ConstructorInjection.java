package com.springcore.constructorinjection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class ConstructorInjection 
{
private int Id;
private List<String> Name;
private Set<String> Address;
private Map<String, Integer> Course;

public ConstructorInjection(int Id, List<String> Name, Set<String> Address, Map<String, Integer> Course) {
	
	this.Id = Id;
	this.Name = Name;
	this.Address = Address;
	this.Course = Course;
}

@Override
public String toString() {
	return "ConstructorInjection [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Course=" + Course + "]";
}


}

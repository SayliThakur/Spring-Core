package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Collection 
{
private int Id;
private List<String> Name;
private Set<String> Address;
private Map<String, String> Course;
public int getId() {
	return Id;
}
public void setId(int id) {
	Id = id;
}
public List<String> getName() {
	return Name;
}
public void setName(List<String> name) {
	Name = name;
}
public Set<String> getAddress() {
	return Address;
}
public void setAddress(Set<String> address) {
	Address = address;
}
public Map<String, String> getCourse() {
	return Course;
}
public void setCourse(Map<String, String> course) {
	Course = course;
}
public Collection(int id, List<String> name, Set<String> address, Map<String, String> course) {
	super();
	Id = id;
	Name = name;
	Address = address;
	Course = course;
}
public Collection() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Collection [Id=" + Id + ", Name=" + Name + ", Address=" + Address + ", Course=" + Course + "]";
}


}

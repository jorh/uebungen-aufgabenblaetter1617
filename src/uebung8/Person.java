package uebung8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Person {
	
	private String name;
	private int alter;
	private boolean hungry;
	
	public Person(String name, int alter){
		this.name = name;
		this.alter = alter;
	}
	
	@Override
	public String toString(){
		return name+": "+alter;
	}
	
	public void altern(){
		this.alter++;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person peter = new Person("Peter",25);
		Person paula = new Person("Paula",34);
		Person paul = new Person("Paul",12);
		Map<String, Person> personMap = new HashMap();
		personMap.put(peter.name, peter);
		personMap.put(paula.name, paula);
		personMap.put(paul.name, paul);
		
		System.out.println("Anzahl Einträgen: "+personMap.size());
		
	}

}

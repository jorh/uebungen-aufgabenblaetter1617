package uebung8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Person {
	
	private String name;
	private int alter;
	private boolean hungry = true;
	
	
	public Person(String name, int alter){
		this.name = name;
		this.alter = alter;
	}
	
	public void setHungry(boolean hungry) {
		this.hungry = hungry;
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
		personMap.put(paul.name, paul);
		personMap.put(paula.name, paula);
		
		
		System.out.println("Anzahl Einträgen: "+personMap.size());
		personMap.get("Peter").setHungry(false);
		for (Person p: personMap.values()){
			System.out.println(p.name+" Hunger?: "+p.hungry);
		}
		
		for(String str: personMap.keySet()){
			
		}
		
		for(Entry<String, Person> entry: personMap.entrySet()){
			entry.getValue();
		}
		
		System.out.println("Ist Paula noch enthalten? "+personMap.containsKey("Paula"));
		personMap.remove("Paula");
		System.out.println("Ist Paula noch enthalten? "+personMap.containsKey("Paula"));
		//Wenn man sich nicht über die Existents des Keys sicher ist
		Person p = personMap.get("abcde");
		if(p!= null){
			p.altern();
		}
	}

}

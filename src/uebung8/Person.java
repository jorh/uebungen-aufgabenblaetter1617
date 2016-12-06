package uebung8;

import java.util.ArrayList;
import java.util.List;

public class Person {
	
	private String name;
	private int alter;
	
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
//		System.out.println(peter);
//		peter.altern();
//		System.out.println(peter);
		List<Person> personen = new ArrayList<>();
		personen.add(peter);
		personen.add(paul);
		personen.add(paula);		
		Person olaf = new Person("Olaf", 99);
		Person inge = new Person("Inge", 75);
		personen.add(0, olaf);
		personen.add(4, inge);
		
		for(Person p : personen){
			System.out.println(p);
		}
		
		System.out.println("Länge der Liste: "+personen.size());
//		System.out.println(personen.isEmpty());
		System.out.println(personen.contains(inge));
		if(personen.contains(inge)){
			personen.remove(inge);
		}
		System.out.println(personen.contains(inge));
		
		personen.remove(personen.indexOf(paul));
		
		for(Person p : personen){
			System.out.println(p);
		}
	}

}

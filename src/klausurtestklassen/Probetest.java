package klausurtestklassen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sun.management.resources.agent;

class Probetest {
	private static void zähler (){
		for (int k=0; k<20; k=k+2){
			if (k%3 ==1){
				System.out.print(k+" ");
			}
		}
	}
	private static void liste() {
		List<AgentI> agents = new ArrayList<>();
		for(int i = 0; i<5;i++){
			agents.add(new Adult(i));
			agents.add(new Dog(i));
		}
		for(Iterator<AgentI> it=agents.iterator(); it.hasNext();){
			AgentI ag = it.next();
			ag.move();
			if(ag instanceof CanBark){
				((CanBark) ag).bark();
				it.remove();
			}
		}
		for(AgentI ag : agents){
			ag.move();
		}
	}
	
	
	public static void main (String[]args){
//		zähler();
//		System.out.print("\n");
//		A a = new A();
//		A b = new B();
//		a.printMessage();
//		b.printMessage();
//		List<String> liste = new ArrayList<>();
//		liste.add("falsch");
//		liste.add("10");
//		System.out.println(liste.size());
		
//		Adult aa = new Adult(1);
//		AgentI bb = new Dog(2);
//		aa.speak();
//		((Dog) bb).bark();
//		liste();
		System.out.println("|-------------------|");
		System.out.println("|   Dies ist ein    |");
		System.out.println("|     Songtext      |");
		for(int i=0;i<10;i++){
			System.out.println("|"+HelloWorld.sayHelloGoodbye()+"|");
		}
		System.out.println("|-------------------|");


	}
}

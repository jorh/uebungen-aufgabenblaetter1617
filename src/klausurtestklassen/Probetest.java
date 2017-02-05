package klausurtestklassen;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import sun.management.resources.agent;

class Probetest {
	private static void z�hler (){
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
	
	private static void wurzelZiehen (long wurzel){
		long i = 1;
		while(i*i < wurzel){
			i++;
			if(wurzel<=0){
				System.err.println("Negative Zahl!");
				break;
			}
			if(i*i==wurzel){
				System.out.println("Die Wurzel von "+wurzel+" ist "+i);
			}
		}
	}
	
	public static void main (String[]args){
//		z�hler();
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
//		wurzelZiehen(25);
		wurzelZiehen(-5);
		wurzelZiehen(0);
		wurzelZiehen(23689267);
	}
}

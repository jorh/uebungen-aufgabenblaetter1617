package uebung7;

import java.util.ArrayList;
import java.util.List;

public class TransportSimulator {
	
	private List<Movable> passengerFleet = new ArrayList<>();
	
	public void increaseSpeedByRandom(Movable mov){
		if(mov instanceof CanMoveHorizontally){
			((CanMoveHorizontally) mov).increaseHorizontalSpeed(Math.random()*100);
		}
		if(mov instanceof CanMoveVertically){
			((CanMoveVertically) mov).increaseVerticalSpeed((Math.random()-0.5)*10);
		}
	}
	
	public void simulate(int steps){
		for(int i=0; i<steps;i++){
			for(Movable mov : passengerFleet){
				increaseSpeedByRandom(mov);
				if(mov instanceof CanMoveHorizontally&&Math.random()<=0.25){
					((CanMoveHorizontally)mov).turnBy(Math.PI/2);
				}
				mov.move();
				System.out.println(mov); //Ruft die toString Methode auf
			}
		}
	}
	
	 public static void main(String[] args){
		 TransportSimulator simulator = new TransportSimulator();
		 simulator.passengerFleet.add(new Elevator("Fahrstuhl 1", 5));
		 simulator.passengerFleet.add(new Ship("Schiff 1", 0, 0));
		 simulator.passengerFleet.add(new Helicopter("Heli 1", 10, 10, 10));
		 simulator.simulate(10);
	 }
}

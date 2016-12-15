package aufgabenblatt4;

import gridworld.framework.actor.Actor;

public class CarSource extends Actor {
	
	//Gut!
	
	//besser: private
	double wkeit;
	
	public CarSource (){
		super.setDirection(90);
		wkeit=0.2;
	}
	
	public CarSource (double wkeit){
		super.setDirection(90);
		this.wkeit=wkeit;
	}
	
	@Override
	public void act(){
		if(Math.random()<wkeit){
			Car car = new Car(1);
			car.putSelfInGrid(getGrid(), getLocation().getAdjacentLocation(getDirection()));
		}
	}
}

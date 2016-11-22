package testGridworld;

import gridworld.framework.actor.Bug;
import java.awt.Color;

public class DisposableBug extends Bug {
	
	private int z = 0;
	
	public DisposableBug(){
		super(Color.BLUE);
	}
	
	@Override
	public void act(){
		super.act();
		if (Math.random() <= 0.4){
			this.turn();
		}
		if (z>=25 && Math.random() <= 0.8){
			this.removeSelfFromGrid();
		}
		z++;
 
	}
}

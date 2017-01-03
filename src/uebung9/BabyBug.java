package uebung9;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Critter;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends Critter {

	private int flowersEaten = 0;

	public BabyBug() {
		this.setColor(Color.YELLOW);
	}

	@Override
	public void act() {
		super.act();
		if (flowersEaten >= 3) {
			Location location = getLocation();
			Grid grid = getGrid();
			removeSelfFromGrid();
			if (Math.random() <= 0.5) {
				Breeder breeder = new Breeder();
				breeder.putSelfInGrid(grid, location);
			} else {
				DisposableBug bug = new DisposableBug();
				bug.putSelfInGrid(grid, location);
			}
		}
	}
	
	@Override
	public void processActors(ArrayList<Actor> actors){
		
		List<Flower> flowers = new ArrayList<>();
		
		for(Actor actor : actors){
			if(actor instanceof Flower){
				flowers.add((Flower) actor); 
			}
		}
	}
}

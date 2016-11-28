package testGridworld;
//UE6
import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

public class BabyBug extends DisposableBug {
	
	private int z = 0;
	
	public BabyBug (){
		setColor(Color.YELLOW);
		
	}
	
	@Override 
	
	public void act (){
		super.act();
		if (z==4){
			 Grid<Actor> gr = getGrid();
			 Location loc = getLocation();
			 this.removeSelfFromGrid();
			if(Math.random()<= 0.5){
				DisposableBug dBug = new DisposableBug();
				dBug.putSelfInGrid(gr, loc);
			}
			else {
				Breeder breeder = new Breeder();
				breeder.putSelfInGrid(gr, loc);
			}
		}
		//z++;
	}
	
	@Override
    public void move()
    {
        Grid<Actor> gr = getGrid();
        if (gr == null)
            return;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (gr.isValid(next))
            moveTo(next);
        else
            removeSelfFromGrid();
    }
	@Override
	public boolean canMove()
    {
		Grid<Actor> gr = getGrid();
        if (gr == null)
            return false;
        Location loc = getLocation();
        Location next = loc.getAdjacentLocation(getDirection());
        if (!gr.isValid(next))
            return false;
        Actor neighbor = gr.get(next);
        if (neighbor instanceof Flower) z++;
        return (neighbor == null) || (neighbor instanceof Flower);  
       
    }
}

package aufgabenblatt4;
import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

//Autor: Jonathan Rhode

public class Car extends Actor {
	
	int speed = 5;
	
	public Car (){
		super.setDirection(180);
	}
	
	//@override
	public void act (){
		int z = 1;
		if( z <= speed){
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
	}
	
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
        return (neighbor == null);
    }

}

package aufgabenblatt4;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Rock;
import gridworld.framework.grid.BoundedGrid;
import gridworld.framework.grid.Location;

public class RunCarGridWorld {

	public static void main(String[] args) {
		// create the world
		ActorWorld world = new ActorWorld();
		// define the size of the grid
        world.setGrid(new BoundedGrid<Actor>(10,50));
        // add a car at the leftmost position
        int  z=0;
        while(z<10){
        	if(Math.random()*2+(z*0.1)>=1.1){
        		world.add(new Location(z,1), new Car());
        	}
        	z++;
        }
       
        
        // here you may add other things to the grid
         z=0;
        while(z<10){
        	world.add(new Location(z,0), new CarSource(0.3));
        	z++;
        }
        // visualize the world
        world.show();
	}

}

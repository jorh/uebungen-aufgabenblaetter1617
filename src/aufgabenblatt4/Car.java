package aufgabenblatt4;
import java.awt.Color;

import gridworld.framework.actor.Actor;
import gridworld.framework.actor.Flower;
import gridworld.framework.grid.Grid;
import gridworld.framework.grid.Location;

//Autor: Jonathan Rhode

public class Car extends Actor {
	
	int speed = 5;
	
	public Car (){
		super.setDirection(90);
		super.setColor(Color.BLACK);
	}
	
	public Car (int speed){
		this.speed=speed;
		super.setDirection(90);
		super.setColor(Color.BLACK);
	}
	
	 public void act(){
		 	fahren();
		 	beschleunigen();
		 	troedeln();
	    }

	 public void fahren(){
		 int z=1;
			while(z<=speed&&canMove()==true){
				move();
				z++;
			}
	 }
	 
	 public void beschleunigen(){
		 if(speed<5)speed++;
	 }
	 
	 public void troedeln(){
		 if(Math.random()<=0.2){
			 speed--;
		 }
	 }
	 
	 public void move(){
		 	Grid<Actor> grid = getGrid();
	        if (grid == null){
	        	removeSelfFromGrid();
	        	return;
	        }
	        Location location = getLocation();
	        Location next = location.getAdjacentLocation(getDirection());
	        if (grid.isValid(next))
	            moveTo(next);
	        else
	            removeSelfFromGrid();
	    }
	 
	 public boolean canMove(){
	        Grid<Actor> grid = getGrid();
	        if (grid == null){
	        	removeSelfFromGrid();
	        	return false;
	        }
	           
	        Location location = getLocation();
	        Location next = location.getAdjacentLocation(getDirection());
	        if (!grid.isValid(next)){
	        	removeSelfFromGrid();
	        	return false;
	    }
	        Actor neighbor = grid.get(next);
	        return (neighbor == null);
	    }

}

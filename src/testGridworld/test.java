package testGridworld;
import java.awt.Color;

import gridworld.framework.actor.ActorWorld;
import gridworld.framework.actor.Bug;
import gridworld.framework.actor.Rock;

public class test {
	
	public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
        DisposableBug käfer = new DisposableBug();
      //  world.add(käfer);
        Breeder breeder = new Breeder();
        world.add(breeder);
        world.show();
    }

}
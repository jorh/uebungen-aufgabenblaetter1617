package uebung7;

public class Elevator implements CanMoveVertically{
		
		private String name;
		private double z;
		private double speed = 0;
		
		public Elevator (String name, double z){
			this.name = name;
			this.z = z;
		}
		
		@Override
		public void increaseVerticalSpeed(double by){
			speed = speed + by;
		}
		
		@Override
		public void move(){
			z = z+speed;
			if (z == 0){
				System.out.println("Sie sind im Erdgeschoﬂ angekommen!");
			}
		}
		
		@Override
		public String getName(){
			return name;
		}
		@Override
		public String toString(){
			return ("Name: "+getName()+" Position: "+z);
		}
		
}

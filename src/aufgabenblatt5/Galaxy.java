package aufgabenblatt5;

import java.util.ArrayList;

class Galaxy {

	public static void main(String[] args) {
		
		//Erzeugen der Element
		ArrayList<GalaxyElement> universum = new ArrayList<GalaxyElement>();
		Sun alphaCentauri = new Sun("Alpha Centauri", 200000000, 2472344,3945656);
		Sun sonne = new Sun("Sonne", 5000, 1000,1000);
		Planet erde = new Planet("Erde", 2000, sonne, 500);
		Planet merkur = new Planet("Merkur",1000, sonne);
		SpaceShip voyagerI = new SpaceShip("Voyager I");
		SpaceShip voyagerII = new SpaceShip("Voyager II", 3, -4000,-2000, -50,30);
		// Hinzufügen zur Liste
		universum.add(sonne);
		universum.add(merkur);
		universum.add(erde);
		universum.add(alphaCentauri);
		universum.add(voyagerI);
		universum.add(voyagerII);
		for(int i=0;i<=10;i++){
			ausgeben(universum);
		}
		
	}
	
	private static void ausgeben(ArrayList<GalaxyElement> universum) {
		ArrayList<SpaceShip> destroyed = new ArrayList<SpaceShip>();
		for(GalaxyElement ge : universum){
			System.out.println(ge);
			if(ge instanceof Moveable){
				((Moveable) ge).move();
			}
			if(ge instanceof Destroyable){
				((Destroyable) ge).hit(Math.random()*25);
				if(((Destroyable) ge).isDestroyed()){
					destroyed.add((SpaceShip) ge);
				}
			}
		}
		for (SpaceShip s : destroyed){
			universum.remove(s);
		}
		System.out.println("-------------------------------------------");
	}

}

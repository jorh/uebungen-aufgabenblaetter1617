package aufgabenblatt5;

import java.util.ArrayList;

class Galaxy {

	public static void main(String[] args) {
		
		//Erzeugen der Element
		ArrayList<GalaxyElement> universum = new ArrayList();
		Sun alphaCentauri = new Sun("Alpha Centauri", 200000000, 2472344,3945656);
		Sun sonne = new Sun("Sonne", 5000, 1000,1000);
		Planet erde = new Planet("Erde", 2000, sonne, 500);
		Planet merkur = new Planet("Merkur",1000, sonne);
		// Hinzufügen zur Liste
		universum.add(sonne);
		universum.add(merkur);
		universum.add(erde);
		universum.add(alphaCentauri);
		// Ausgabe
		for(GalaxyElement ge : universum){
			System.out.println(ge);
		}
		erde.move();
		for(GalaxyElement ge : universum){
			System.out.println(ge);
		}
		
	}

}

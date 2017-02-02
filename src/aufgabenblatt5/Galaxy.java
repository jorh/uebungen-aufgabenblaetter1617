package aufgabenblatt5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


class Galaxy {
	
	//Sehr gut

	public static void main(String[] args) {
		
		//Erzeugen der Element
		ArrayList<GalaxyElement> universum = new ArrayList<GalaxyElement>();
		Map<String, GalaxyElement> sonnensystem = new TreeMap<String, GalaxyElement>();
		Sun alphaCentauri = new Sun("Alpha Centauri", 200000000, 2472344,3945656);
		Sun sonne = new Sun("Sonne", 5000, 1000,1000);
		Planet erde = new Planet("Erde", 2000, sonne, 500);
		Planet merkur = new Planet("Merkur",1000, sonne);
		SpaceShip voyagerII = new SpaceShip("Voyager II", 1, -4000,-2000, -50,30);
		SpaceShip voyagerI = new SpaceShip("Voyager I");
		//arrayList(universum, alphaCentauri, sonne, erde, merkur, voyagerII, voyagerI);
		//ausgabe(universum);
		/*
		 * TreeMap sortiert die Element nach ihrem Key, in diesem Fall also 
		 * alphabetisch
		 */
		
		map(sonnensystem, alphaCentauri, sonne, erde, merkur, voyagerII, voyagerI);
		ausgabe(sonnensystem);
		
		
		
	}

	private static void map(Map<String, GalaxyElement> sonnensystem, Sun alphaCentauri, Sun sonne, Planet erde,
			Planet merkur, SpaceShip voyagerII, SpaceShip voyagerI) {
		sonnensystem.put(alphaCentauri.getName(), alphaCentauri);
		sonnensystem.put(sonne.getName(), sonne);
		sonnensystem.put(erde.getName(), erde);
		sonnensystem.put(merkur.getName(), merkur);
		sonnensystem.put(voyagerII.getName(), voyagerII);
		sonnensystem.put(voyagerI.getName(), voyagerI);
	}
	
	private static void arrayList(ArrayList<GalaxyElement> universum, Sun alphaCentauri, Sun sonne, Planet erde,
			Planet merkur, SpaceShip voyagerII, SpaceShip voyagerI) {
		// Hinzufügen zur Liste
		universum.add(sonne);
		universum.add(merkur);
		universum.add(erde);
		universum.add(alphaCentauri);
		universum.add(voyagerII);
		universum.add(voyagerI);
	}

	private static void ausgabe(ArrayList<GalaxyElement> universum) {
		ausgeben(universum);
		Collections.sort(universum);
		//Mehrfachausgabe
		for(int i=0;i<=1;i++){
			ausgeben(universum);
		}
	}
	
	private static void ausgabe(Map<String, GalaxyElement> sonnensystem) {
		ausgeben(sonnensystem);
		//Mehrfachausgabe
		for(int i=0;i<=1;i++){
			ausgeben(sonnensystem);
		}
	}
	
	private static void ausgeben(Map<String, GalaxyElement> sonnensystem) {
		ArrayList<SpaceShip> destroyed = new ArrayList<SpaceShip>();
		for(GalaxyElement ge : sonnensystem.values()){
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
			sonnensystem.remove(s.getName());
		}
		System.out.println("-------------------------------------------");
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

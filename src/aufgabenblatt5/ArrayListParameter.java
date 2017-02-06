package aufgabenblatt5;

import java.util.ArrayList;

public class ArrayListParameter {
	public ArrayList<GalaxyElement> universum;
	public Sun alphaCentauri;
	public Sun sonne;
	public Planet erde;
	public Planet merkur;
	public SpaceShip voyagerII;
	public SpaceShip voyagerI;

	public ArrayListParameter(ArrayList<GalaxyElement> universum, Sun alphaCentauri, Sun sonne, Planet erde,
			Planet merkur, SpaceShip voyagerII, SpaceShip voyagerI) {
		this.universum = universum;
		this.alphaCentauri = alphaCentauri;
		this.sonne = sonne;
		this.erde = erde;
		this.merkur = merkur;
		this.voyagerII = voyagerII;
		this.voyagerI = voyagerI;
	}
}
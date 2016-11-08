package uebung4;

public class Cow {
	private String name = "Ich habe noch keinen Namen"; // Name der Kuh
	private int alter;
	
	// Konstruktor 
	public Cow(String name, int alter){
		this.name = name;
		this.alter = alter;
	}
	public Cow(int alter){
		this.alter = alter;
	}
	public Cow(String name){
		this.name = name;
	}
	//Get-Methoden
	public String getName(){
		return this.name;
	}
	public int getAlter(){
		return this.alter;
	}
	
}

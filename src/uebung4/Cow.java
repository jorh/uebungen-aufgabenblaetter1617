package uebung4;

class Cow {
	private static int cowCounter = 0;
	private String name = "Ich habe noch keinen Namen"; // Name der Kuh
	private int alter;
	private boolean hungry = true;
	
	// Konstruktor 
	public Cow(String name, int alter){
		this.name = name;
		this.alter = alter;
		cowCounter++;
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
	public int getcowCounter(){
		return cowCounter;
	}
	public void fuettern (){
		hungry = false;
	}
	public void toggleHungry(){
		hungry = !hungry;
	}
	public boolean getHungry(){
		return hungry;
	}
	
}

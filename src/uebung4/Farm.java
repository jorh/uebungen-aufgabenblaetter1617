package uebung4;


class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Erzeugen der Kühe
		Cow cow1 = new Cow("Peter", 24); 
		Cow cow2 = new Cow("Anneliese", 30);
		Cow cow3 = new Cow("Olaf", 12);
		Cow cow4 = new Cow(33);
		// Ausgeben der Kuhnamen und des Alters
		System.out.println(cow1.getName()+" ist "+cow1.getAlter()+" Monate alt.");
		System.out.println(cow2.getName()+" ist "+cow2.getAlter()+" Monate alt.");
		System.out.println(cow3.getName()+" ist "+cow3.getAlter()+" Monate alt.");
		System.out.println(cow4.getName()+" ist "+cow4.getAlter()+" Monate alt.");
		// Übung 5
		
		Cow cow5 = new Cow("Peter", 24); 
		Cow cow6 = new Cow("Anneliese", 30);
		Cow cow7 = new Cow("Olaf", 12);
		System.out.println("CowCounter: "+cow7.getcowCounter());
		Farmer bauer = new Farmer();
		System.out.println("Hungerstatus der Kuh: "+ cow7.getHungry());
		bauer.feedCow(cow7);
		System.out.println("Hungerstatus der Kuh: "+ cow7.getHungry());
		System.out.println("Hungerstatus der Kuh: "+ cow1.getHungry());
		bauer.feedCow(cow1);
		System.out.println("Hungerstatus der Kuh: "+ cow1.getHungry());
	}

}

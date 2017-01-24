package uebung13;

import java.util.Arrays;
import java.util.List;

public class Freihand {
	
	public static double mean (List<Double> myNumbers){
		double summe=0;
		double mean;
		int anzahl = 0;
		for(Double de : myNumbers){
			summe = summe+de;
			anzahl++;
		}
		mean = summe/anzahl;
		return mean;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> myNumbers =  Arrays.asList(2.3,5.0, 1.2, -3.4, Math.PI, 0.0);
		System.out.println("Der Durchschnitt meiner Zahlen ist: "+ mean(myNumbers));
	}

}

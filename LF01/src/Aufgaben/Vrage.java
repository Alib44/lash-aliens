package Aufgaben;

import java.io.IOException;

import oop.IO;

public class Vrage {

	public static void main(String[] args) throws IOException {



		

		double [] tage = new double[7];
		for (int i = 0; i < tage.length; i++) {
			System.out.print("Geben Sie die Temperatur der "+(i+1) +" Tage eins zu eins ein: ");
			tage[i]=IO.readDouble();

		}

		double summe = tage [0]+tage [1]+tage [2]+tage [3]+ tage[4]+tage[5]+tage[6];
		double mittelweert =summe/7;
		//oder double mittelwertt =(tage [0]+tage [1]+tage [2]+tage [3]+ tage[4]+tage[5]+tage[6])/tage.length

		double maximal=Math.max(Math.max(tage [0], tage [1]),Math.max(tage [2],tage [3]));
		double maximal2=Math.max(Math.max(tage [4],tage[5]),Math.max(tage[6],tage [1]));
		double max= Math.max(maximal,maximal2);
		System.out.println("Das Mittelwert lautet: "+ mittelweert);
		System.out.println("Das Maximale Wert lautet: "+ max);

	}

}



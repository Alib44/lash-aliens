package Aufgaben;

import java.io.IOException;

import oop.IO;

public class Zellwachstum {

	public static void main(String[] args) throws IOException {


		//Eingabe in der Console
		while (true) {
			Boolean weiter = true;
			System.out.println("Bitte die aktuelle Zellmenge eingeben:" );
			double zellmenge = oop.IO.readDouble();
			System.out.println("Bitte den Wachstumsfaktor eingeben:" );
			double wachstumsfaktor = IO.readDouble();
			System.out.println("Bitte die Laufzeit der Hochrechnung in Tagen eingeben:" );
			double laufzeit = IO.readDouble();
			System.out.println("Tage      Zellmenge");

			//Verarbeitung in der Console

			for (int i=0 ; i <= laufzeit ; i++) {

				double formel = zellmenge* Math.pow(wachstumsfaktor, i);
				System.out.println(i+ "         " + formel);
			}

			//Ausgabe in der Console

			System.out.println("Soll die Berechung wiederholt werdn?");
			String eingabe = IO.readString();

			if (eingabe.equalsIgnoreCase("Ja")) {
				weiter = true;

			} else {
				break;


			}	
		}
	}


}



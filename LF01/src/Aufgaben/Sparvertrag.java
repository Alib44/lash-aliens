package Aufgaben;

import java.io.IOException;

import oop.IO;

public class Sparvertrag {

	public static void main(String[] args) throws IOException {

		while (true) {
			Boolean weiter = true;
			System.out.println("Bitte kapital eingeben:" );
			double kapital  = oop.IO.readDouble();
			System.out.println("Bitte den zinssatz eingeben:" );
			IO.readDouble();
			System.out.println("Bitte die Laufzeit in Jahren eingeben:" );
			double jahren  = IO.readDouble();
			System.out.print("\nJahr\t");
			System.out.print("Anfangskapital\t");
			System.out.print("Zinsbetrag\t");
			System.out.print("Jahresendbetrag\t");
			System.out.println();
			//rechnung

			for (int i=0 ; i <= jahren ; i++) {


				double ali = kapital/100*3;
				double formel = ali+kapital;
				kapital=formel;


				kapital = kapital * 100;
				kapital= Math.round(kapital);
				kapital = kapital/ 100; 

				formel = formel * 100;
				formel = Math.round(formel);
				formel = formel/ 100; 

				ali = ali * 100;
				ali = Math.round(ali);
				ali = ali/ 100;



				System.out.println(i+"\t"+kapital+"\t\t"+ali+"\t\t"+formel);
			}

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

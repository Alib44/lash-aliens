package aufgaben;

import java.io.IOException;

public class Fuehrerschein {

	public static void main(String[] args) throws IOException {


		System.out.print("Geben sie ihre alter ein: ");
		int alter = oop.IO.readInteger();


		//ausgabe

		if ( alter <= 14) {
			System.out.println("Du darfst Bobby-Car oder Fahrrad fahren");
			return;
		}
		else if ( alter <= 16 ) {
			System.out.println("Du darfst schon 50er fahren. ");
			return;
		}
		else if ( alter <= 18 ) {
			System.out.println("Du darfst schon 125er fahren, aber noch kein Auto. ");
			return;
		}
		else if ( 18 < alter  ) {
			System.out.println("Du darfst jetzt auch Auto fahren ");
			return;
		}

	}

}

package aufgaben;

import java.io.IOException;

public class Alterspruefung {

	public static void main(String[] args) throws IOException {

		System.out.println("geben sie ihre alter ein: ");
		int alter = oop.IO.readInteger();
		
		
		//ausgabe
		
		if ( 18 <= alter) {
			System.out.println("sie sind vollj�ghrig");
			return;
		}
		else if ( alter < 18 ) {
			System.out.println("du bist nicht vollj�ghrig, mach pc aus hau ab ");
			return;
		}

	}

}

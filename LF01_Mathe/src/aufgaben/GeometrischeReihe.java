package aufgaben;

import java.io.IOException;

public class GeometrischeReihe {

public static void main(String[] args) throws IOException {

		System.out.println("Geben sie bitte Ihre Endzzahl ein: ");

	int index = oop.IO.readInteger();

    double ergebnis = 0;

    for (int i = 0; i <= index; i++) {

    	ergebnis = (1 / Math.pow(2, i)) + ergebnis;

    	System.out.println("Das Index ist: " + i);

    	System.out.println("Das Ergebnis lautet: " + ergebnis);

    }

	}



}

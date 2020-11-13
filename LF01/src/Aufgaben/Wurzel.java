package Aufgaben;

import java.io.IOException;

public class Wurzel {

		public static void main(String[] args) throws IOException {
		System.out.println("Bitte gebe eine zahl ein");
		int wert1 = oop.IO.readInteger();
		
		System.out.println("bitte geben sie die endzahl ein");
		double wert2 = oop.IO.readDouble();
		
		for (int i = wert1; i <= wert2; i++) {
			
			System.out.println(i + " - " + Math.sqrt(i));
			
		}
		

	}

}

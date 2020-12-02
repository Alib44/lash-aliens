package Aufgaben;

import java.io.IOException;

import oop.IO;

public class Kino {

	public static void main(String[] args) throws IOException {

		String[][] kino = erzeugenSaal();
		anzeigenSaal(kino);
		boolean beenden = false;
		do {
			System.out.println("sie haben folgende möglichkeiten: ");
			System.out.println("0: programm beenden.");
			System.out.println("1: platz reservieren.");
			System.out.println("2: platz stronieren");
			int auswahl = IO.readInteger();
			if (auswahl == 0) {
				System.out.println("auf wiedersehen");
			beenden = true;
			}
			else if (auswahl == 1 ) {
				reservierenPlatz(kino);
				anzeigenSaal(kino); 
			}
			else if (auswahl ==2 ) {
				StornierenPlatz(kino);
				anzeigenSaal(kino);
			}
			else {
				System.out.println("gultige befehl angeben");
			}
		} while(beenden == false);
	}

	
	private static String[][] erzeugenSaal() throws IOException {

		System.out.println("Wie groß ist Ihre Kinosaal? (Bitte Anzahl der Spalten eingeben) ");
		int spalte = IO.readInteger();
		System.out.println("Wie groß ist Ihre Kinosaal? (Bitte Anzahl der Reihen eingeben) ");
		int reihe = IO.readInteger();        

		String[][] saal = new String [reihe][spalte];
		System.out.println();
		for(int i=0; i<saal.length; i++) {
			for (int j=0; j < saal[i].length; j++) {
				saal[i][j] = "O";
			}	
		}
		return saal; 
	}
	private static void anzeigenSaal (String[][] saal) {
		for(int i=0; i<saal.length; i++) {
			for (int j=0; j < saal[i].length; j++) {
				System.out.print(saal[i][j] + "\t");
			}	
			System.out.println();

		}
	}

	private static void reservierenPlatz (String[][] saal) throws IOException {

		System.out.println("welche reihe werden sie gerne reservieren? ");
		int r = IO.readInteger() - 1;
		System.out.println("welche spalte werden sie gerne haben? ");
		int s = IO.readInteger() - 1;
		if (  saal[r][s].equalsIgnoreCase("X")) {

			System.err.println("es gibt kein platz. setzt dich auf dem boden");
		}
		else {
			saal[r][s] = "X";

		}
	}
		private static void StornierenPlatz (String[][] saal) throws IOException {

			System.out.println("welche reihe werden sie gerne stronieren? ");
			int r = IO.readInteger() - 1;
			System.out.println("welche spalte werden sie gerne stronieren? ");
			int s = IO.readInteger() - 1;
			if (saal[r][s].equalsIgnoreCase("O")) {

				System.err.println("der platz ist frei");
			}
			else {
				saal[r][s] = "O";

			}
		}
	}

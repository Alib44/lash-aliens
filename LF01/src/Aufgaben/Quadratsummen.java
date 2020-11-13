package Aufgaben;

import java.io.IOException;

public class Quadratsummen {
 
	public static void main(String[] args) throws IOException {

		System.out.print("Geben sie bitte ihre Zahl ein:");

		int endezahl = oop.IO.readInteger();

		double summe =0 ;

		

		for (int i=0; i <= endezahl; i++) {

			summe += i*i ;

		}

		System.out.println("Das Ergebniss lautet "+summe);

	}

}
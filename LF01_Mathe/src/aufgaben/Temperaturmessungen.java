package aufgaben;

import java.io.IOException;

import oop.IO;

public class Temperaturmessungen {

	public static void main(String[] args) throws IOException {

		System.out.println("Bitte geben sie die Temperatur Tag 1 ein");
		double tag1  = oop.IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 2 ein" );
		double tag2  = IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 3 ein" );
		double tag3  = IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 4 ein" );
		double tag4  = IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 5 ein" );
		double tag5  = IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 6 ein" );
		double tag6  = IO.readDouble();
		System.out.println("Bitte geben sie die Temperatur Tag 7 ein" );
		double tag7  = IO.readDouble();

		//rechnung

		double ali = tag1+tag2+tag3+tag4+tag5+tag6+tag7;
		double m = ali/7;
		System.out.println("mittelwert" + m);


		double maximal=Math.max(Math.max(tag1, tag2),Math.max(tag3,tag4));
		double maximal8=Math.max(Math.max(tag5,tag6),Math.max(tag7,tag6)); 
		double maximal9= Math.max(maximal8,maximal);


		System.out.println("Der Maximalwert lautet "+ maximal9);

	}



}



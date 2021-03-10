package aufgaben;

import java.io.IOException;

public class Muttern {
	public static void main(String[] args) throws IOException {
		System.out.println("Wie viele Schrauben wollen Sie Bestellen?: " );
		int schrauben = oop.IO.readInteger();
		System.out.println("Wie viele Muttern wollen Sie Bestellen?: " );
		int muttern = oop.IO.readInteger();
		System.out.println("Unterlegscheiben wollen Sie Bestellen?: " );
		int unterlegscheiben = oop.IO.readInteger();
		double rechnung = schrauben*0.05 + muttern*0.03 + unterlegscheiben*0.01;

		if (schrauben == muttern) {
			System.out.println("Die Rechnung Betr�gt:" + rechnung + "�"); 
		} else
			System.out.println("Sie m�ssen das gleiche Anzahl an Muttern und Schrauben bestellen");

	}



}

 
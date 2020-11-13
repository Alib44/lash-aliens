package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Summe021 {

	
	
		public static void main(String[] args) throws IOException {
				int summe = 0;
				BufferedReader br = new BufferedReader(new InputStreamReader(System. in));
				
				// Eingabe
				System.out.print("Geben Sie die zahl ein:");
				String eingabe = br.readLine();
				// double a = Double.parseDouble(eingabe.trim().replace(',', '.'));;
				int ende = Integer.parseInt(eingabe);
				
				// Verarbeitung 
				for (int zahl = 0; zahl <= ende; zahl++) {
					summe = summe + zahl;
				}
				
				// Ausgabe
				System.out.println("Die Summe durch for-Schleife:" + summe);
				
			}

	}


	
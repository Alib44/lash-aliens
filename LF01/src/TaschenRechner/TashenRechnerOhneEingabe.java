package TaschenRechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TashenRechnerOhneEingabe {
	// Eingabe in Console
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {

		boolean weiter = true;
		do {
			// Menü
			schreibeMenue();
			
		}while(weiter == true);

		System.out.print("Geben Sie x ein=");
		String eingabe = br.readLine();
		double x = Double.parseDouble(eingabe.replace(',', '.')) ;
		System.out.print("Geben Sie y ein=");
		eingabe = br.readLine();
		double y = Double.parseDouble(eingabe.replace(',', '.')) ;
		double summe=x+y;
		double multiplizieren = x*y;
		double divison = x/y;
		double differenz = x-y;
		double pot=Math.pow(x,y);

		if(x>=0 && x<=100) {
			if (y>=0 && y<=100) {
				System.out.println("Summe="+summe);
				System.out.println("Multiplizieren="+multiplizieren);
				System.out.println("Division="+ divison);
				System.out.println("Differenz= "+ differenz);
				System.out.println("Potenzieren="+ pot);
				System.out.println();
			} else {
				System.out.println("Brechnung nicht möglich, da y nicht passend ist!");
			}
		} else {
			System.out.println("Brechnung nicht möglich, da x nicht passend ist!");

		}

	}

	private static void schreibeMenue() {
		System.out.println("p = Potenzieren");
		System.out.println("w = Quadratishe Würzel");
		System.out.println("+ = Summe");
		System.out.println("- = Differenz");
		System.out.println("/ = Quotient");
		System.out.println("* = Produkt");
		
	}

}
package taschenrechner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Taschenrechner_1 {
static  BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args) throws IOException {
		
		boolean weiter = false;

		do {
			schreibeMenue();
			
			addiere();






			System.out.println();		
			System.out.println("Soll das Programm wiederholt werden?");
			String text = bufferedReader.readLine();
			if (text.equalsIgnoreCase("Ja")) {
				weiter = true;
			} else {
				weiter = false;
			}
		}while(weiter == true);
	}




	private static void addiere() throws IOException {
		String auswahl = bufferedReader.readLine();

		if (auswahl.equals("+")) {
			System.out.print("Bitte geben Sie den ersten Summanden ein: ");
			double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
			System.out.print("Bitte geben Sie den zweiten Summanden ein: ");
			double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
			double summe = zahl1 + zahl2;
			System.out.println("Die Summe betr�gt " + summe);
		} else if (auswahl.equals("-")) {
			System.out.print("Bitte geben Sie den Minuend ein: ");
			double zahl1 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
			System.out.print("Bitte geben Sie den Subtrahend ein: ");
			double zahl2 = Double.parseDouble(bufferedReader.readLine().replace(',', '.'));
			double differenz = zahl1 - zahl2;
			System.out.println("Die Differenz betr�gt " + differenz);
		}
	}





	private static void schreibeMenue() {
		System.out.println("Folgende Rechenarten stehen zur Verf�gung:");
		System.out.println("[+] f�r Addition");
		System.out.println("[-] f�r Subtraktion");
		System.out.println("[*] f�r Multiplikation");
		System.out.println("[/] f�r Division");
		System.out.println("[p] f�r Potenzieren");
		System.out.println("[w] f�r Wurzelziehen");
		System.out.println();
	}

}



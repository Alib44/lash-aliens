package scratch2java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dreieckegleichung {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Geben sie bitte die seiten l�nge a an:");
		String eingabe = br.readLine();
		double a = Double.parseDouble(eingabe.trim().replace(',', '.'));

		System.out.println("Geben sie bitte die seiten l�nge b an:");
		eingabe = br.readLine();
		double b = Double.parseDouble(eingabe.trim().replace(',', '.'));

		System.out.println("Geben sie bitte die seiten l�nge c an:");
		eingabe = br.readLine();
		double c = Double.parseDouble(eingabe.trim().replace(',', '.'));
		double u = a + c + b;

		double s = u / 2;
		double value = u * (s - a) * (s - b) * (s - c);
		double f = Math.sqrt(value);
		double summe1 = a+b;
		double summe2 = a+c;
		double summe3 = b+c;

		if (summe1 <= c) {
			System.out.println("das dreieck ist nicht m�glich");
			return;
		}
		if (summe2 <= b) {
			System.out.println("das dreieck ist nicht m�glich");
			return;
		}
		if (summe3 <= a) {
			System.out.println("das dreieck ist nicht m�glich");
			return;
		}
	}
}

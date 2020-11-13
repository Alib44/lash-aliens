package Aufgaben;

import java.io.IOException;

public class PQ_Formel {

	public static void main(String[] args) throws IOException {

		System.out.println("Bitte geben sie P zahl ein");
		double p = oop.IO.readDouble();

		System.out.println("bitte geben sie q zahl ein");
		double q = oop.IO.readDouble();



		double x1 = -p/2 + Math.sqrt((p/2 * p/2)-q);
		double x2 = -p/2 - Math.sqrt((p/2 * p/2)-q);



		System.out.println("erste Nullstelle lautet" +x1);
		System.out.println("zweite nullstelle lautet" +x2);

	}

}

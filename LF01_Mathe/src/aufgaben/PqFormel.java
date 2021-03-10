package aufgaben;

import java.io.IOException;

public class PqFormel {

	public static void main(String[] args) throws IOException {

		System.out.println("Bitte geben sie P zahl ein");
		double p = oop.IO.readDouble();

		System.out.println("bitte geben sie q zahl ein");
		double q = oop.IO.readDouble();

		// rechnung
		double d = Math.sqrt((p/2 * p/2)-q);
		double x1 = -p/2 + (d);
		double x2 = -p/2 - (d);

		System.out.println("erste Nullstelle lautet" + x1);
		System.out.println("zweite nullstelle lautet" + x2);

	}

}
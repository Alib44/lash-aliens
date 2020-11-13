package scratch2Java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Noten {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Geben sie bitte die prozente ohne das prozentzeichen ein:");
		String eingabe = br.readLine();
		double prozent = Double.parseDouble(eingabe.trim().replace(',', '.').replace('%', ' '));
		
		if(prozent >= 85){
			System.out.println("Note 1");
		}
		else if (prozent >= 73){
			System.out.println("Note 2");
		}
		else if (prozent >= 59){
			System.out.println("Note 3");
		}
		else if (prozent >= 45){
			System.out.println("Note 4");
		}
		else if (prozent >= 27){
			System.out.println("Note 5");
		}	
		else {
			System.out.println("Note 6");
		}
		

	}

}

import java.util.*;


public class App {

	
	public static void main(String[] args) {
		
		euclidOld eO = new euclidOld();
		Scanner myScanner = new Scanner(System.in);
		int eingabe1;
		int eingabe2;

		
		System.out.println("Willkommen beim Euclidschen Rechner :)");
		
		System.out.println("Bitte gib deine erste Zahl ein:");
		eingabe1=myScanner.nextInt();
		eO.setA(eingabe1);
		System.out.println("Bitte gib deine zweite Zahl ein:");
		eingabe2 = myScanner.nextInt();
		eO.setB(eingabe2);
		
		Ausgabe.ausgabe(eO.getA(), eO.getB(), eO.berechne());
		
		myScanner.close();
		System.exit(1);
		

	}

}

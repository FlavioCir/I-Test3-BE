import java.util.Scanner;

public class Main_es2 {

	public static void main(String[] args) {
		
		conversioneInLettere();

	}
	
	public static void conversioneInLettere() {
		
		Scanner reader = new Scanner(System.in);
		System.out.println( "Digita un numero e premi invio: " );
		int num = reader.nextInt();
		
		switch(num) {
			case 0:
				System.out.println("Zero");
				break;
			case 1:
				System.out.println("Uno");
				break;
			case 2:
				System.out.println("Due");
				break;
			case 3:
				System.out.println("Tre");
				break;
			default:
				System.out.println( "Error Message: Inserisci un numero da 0 a 3" );
		}
		
	}

}

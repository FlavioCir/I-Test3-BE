import java.util.Scanner;

public class Main_es4 {

	public static void main(String[] args) {
		
		contoAllaRovescia();

	}
	
	public static void contoAllaRovescia() {
	
		Scanner reader = new Scanner(System.in);
		
		System.out.println( "Digita un numero e premi invio: " );
		int num = reader.nextInt();
		
		for(int i = num; i >= 0; i--) {
			System.out.println( i );
		}
		
		System.out.println( "Conto alla rovescia terminato!" );
		
	}

}

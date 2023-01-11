import java.util.Scanner;

public class Main_es3 {

	public static void main(String[] args) {
		
		dividiString();

	}
	
	public static void dividiString() {
		
		int t = 0;
		
		String p;
		
		do {
			Scanner reader = new Scanner(System.in);
			System.out.printf( "%nDigita una parola e premi invio: " );
		    p = reader.nextLine();
		    for (int i = 0; i < p.length(); i++) {
		    	System.out.print(p.charAt(i) + ", ");
		    }
		} while (!p.equals(":q"));
		
	}

}

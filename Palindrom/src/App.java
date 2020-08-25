import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			
			System.out.println("Auswahl treffen");
	        System.out.println("-------------------------");
	        System.out.println("Option 1 - Palindrom");
	        

	        int auswahl = sc.nextInt();
	        
	        if(auswahl == 1) {
			
			System.out.println("Bitte geben Sie deine Zeichenfolge eine die auf ein Palindrom ueberprueft werden soll:");
			String eingabe = sc.next();
			String rueckwerts = "";
			
			for (int i = 0; i < eingabe.length(); i ++ ){
				rueckwerts =  eingabe.charAt(i) + rueckwerts;
			}
					
			if (rueckwerts.equals(eingabe) ) {
				System.out.println("true");
			}else {
				System.out.println("false");
			}
			
	        }
		}
			
		
	}

}

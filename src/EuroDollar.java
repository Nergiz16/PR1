import java.util.*;

public class EuroDollar {

	public static void main(String[] args) {
		// currency translation
		
		Scanner sc = new Scanner(System.in);
		String menupunkt = "Ja";
		do{
			System.out.println("W�hlen Sie bitte einen Men�punkt aus \n 1. Euro in Dollar \n 2. Dollar in Euro");
			
			float i = sc.nextFloat();
			// Choose an option from the menu
			
			if (  i ==1 ) {
				// The first option
				System.out.println(" (1) Bitte geben Sie einen Eurobetrag ein:");
				float euro = sc.nextFloat();
				// calculation
				float dollar = euro * 1.34f;
				System.out.println(" Der Eurobetrag betr�gt:" + dollar + "$");
			}
			
			else if ( i == 2) {
				// The second option
				System.out.println("Bitte geben Sie einen Dollerbetrag ein:");
				float dolla = sc.nextFloat();
				// calculation
				float eur = dolla * 1 /1.34f;
				System.out.println(" Der Eurobetrag betr�gt:" + eur + "�" );
				
			}
			System.out.println("Wollen Sie eine weitere Umrechnung durchf�hren ?");
			menupunkt = sc.next();
			
		}while ( menupunkt.equals("Ja"));
		}
		
		{
		System.out.println("Bitte geben Sie einen Eurobetrag an");
		
		}
	}



import java.util.Scanner;

public class HouseBuild {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
      // Taking User inputs
		System.out.println("Choose Option");
		String s = sc.nextLine();
		System.out.println("Enter the value of length");
		String length1 = sc.nextLine();
		System.out.println("Enter the value of width");
		String width1 = sc.nextLine();
		
		double length = Double.parseDouble(length1);
		double width = Double.parseDouble(width1);
		
		int integer1 = (int)length;
		double decimal1 = length - integer1;
		double convertToInch1 = integer1 * 12 + decimal1*10;
		System.out.println("In Inches: " + (int)convertToInch1);
		
		int integer2 = (int)width;
		double decimal2 =  width - integer2;
		double convertToInch2 = integer2 * 12 + decimal2*10;
		System.out.println("In Inches: " + (int)convertToInch2);
		
		
		
		// find Aya  as per choose
		if (s.equals("Foot")) {
		 double area = length * width;
		System.out.println("Area: " + (int)area);
int remainder = (int)( area) % 8;

if (length % 2 != 0 && width % 2!= 0) {
	System.out.println("Good Aya");
} else  {
	System.out.println("Not a good Aya");
}

		
		// differentiating Aya based on Aya using remainder
	switch (remainder) {
	
	case 1: 
		System.out.println("Dhwajaya");
		break;
	case 2: 
		System.out.println("Dhumraya");
		break;
	case 3: 
		System.out.println("Simhayaya");
		break;
	case 4: 
		System.out.println("Shunakrayaya");
		break;
	case 5: 
		System.out.println("Vrushabhaya");
		break;
	case 6: 
		System.out.println("Kharaya");
		break;
	case 7: 
		System.out.println("Gajaya");
		break;
	default: 
		System.out.println("Vayasaya or Ushtraya");
		break;
	}
	// Dhana-Runa
	double dhana1 = area * 8;
	double dhana2 = Math.round(dhana1)/12;
	double dhana3 = dhana2 * 12;
	double dhana = dhana1 - dhana3;
	System.out.println("Dhana: " + (int)dhana);
	
	double runa1 = area  * 4;
	double runa2 = Math.round(runa1)/8;
	double runa3 = runa2 * 8;
	double runa = runa1 - runa3;
	System.out.println("Runa: " + (int)runa);
	
	if (runa > dhana) {
		System.out.println("Dhana-runa: Ashubha");
	} else {
		System.out.println("Dhana-runa: Shubha");
	}
	
	// call all the calculations
	
	CalculationsOfBulidHouse.findAyushya(area);
	CalculationsOfBulidHouse.findtithi(area);
	CalculationsOfBulidHouse.findVar(area);
	CalculationsOfBulidHouse.findNakshatra(area);
	CalculationsOfBulidHouse.fingYoga(area);
	CalculationsOfBulidHouse.findAnsh(area);
	CalculationsOfBulidHouse.findDikpalaka(area);
	
		} 
		else if (s.equals("Inch")) {
			 int areaInInches = (int) (convertToInch1 * convertToInch2);
			 System.out.println("Area: " + (int)areaInInches);
			 
			 int remainder = ( areaInInches) % 8;
			 
			 if (length % 2 != 0 && width % 2!= 0) {
					System.out.println("Good Aya");
				} else  {
					System.out.println("Not a good Aya");
				}
				
				
				// differentiating Aya based on Aya using remainder
			switch (remainder) {
			
			case 1: 
				System.out.println("Dhwajaya");
				break;
			case 2: 
				System.out.println("Dhumraya");
				break;
			case 3: 
				System.out.println("Simhayaya");
				break;
			case 4: 
				System.out.println("Shunakrayaya");
				break;
			case 5: 
				System.out.println("Vrushabhaya");
				break;
			case 6: 
				System.out.println("Kharaya");
				break;
			case 7: 
				System.out.println("Gajaya");
				break;
			default: 
				System.out.println("Vayasaya or Ushtraya");
				break;
			}
			// Dhana-Runa
			int dhana1 = areaInInches * 8;
			int dhana2 = dhana1/12;
			int dhana3 = dhana2 * 12;
			int dhana = dhana1 - dhana3;
			System.out.println("Dhana: " + dhana);
			
			int runa1 = areaInInches * 4;
			int runa2 = runa1/8;
			int runa3 = runa2 * 8;
			int runa = runa1 - runa3;
			System.out.println("Runa: " + runa);
			
			if (runa > dhana) {
				System.out.println("Dhana-runa: Ashubha");
			} else {
				System.out.println("Dhana-runa: Shubha");
			}
			
			// call all the calculations
			
			CalculationsOfBulidHouse.findAyushya(areaInInches);
			CalculationsOfBulidHouse.findtithi(areaInInches);
			CalculationsOfBulidHouse.findVar(areaInInches);
			CalculationsOfBulidHouse.findNakshatra(areaInInches);
			CalculationsOfBulidHouse.fingYoga(areaInInches);
			CalculationsOfBulidHouse.findAnsh(areaInInches);
			CalculationsOfBulidHouse.findDikpalaka(areaInInches);
			
		}
		
		
		
	}

}

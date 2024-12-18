import java.util.Scanner;

public class HouseBuild {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value oh width");
		int width = sc.nextInt();
		System.out.println("Enter the value oh width");
		int height = sc.nextInt();
		
		int area = width * height;
		if (width % 2 != 0 && height % 2!= 0) {
			System.out.println("Good Aya");
		} else  {
			System.out.println("Not a good Aya");
		}
		
		int remainder = area % 8;
		
		
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
	
	int dhana = (area * 8)/12;
	
	int runa = (area  * 4)/8;
	
	int ayushya = (area * 6)/120;
	
	if (ayushya >= 60) {
		System.out.println("Ayushya: Shubha");
	} else {
		System.out.println("Ayushya: Ashubha");
	}
	
	int tithi = (area * 8)/30;
	
	if (tithi == 4 || tithi == 6 || tithi == 14 || tithi == 30) {
		System.out.println("Tithi: Shubha");
	} else {
		System.out.println("Tithi: Ashubha");
	}
	
	int var = (area * 6)/7;
	
	if (var == 2 || var == 4 || var == 5 || var == 6) {
		System.out.println("Var: Uttama");
	} else {
		System.out.println("Var: Not Uttama");
	}
	
	int nakshatra = (area * 8)/27;
	
	if (nakshatra == 2 || nakshatra == 3 || nakshatra == 9 || nakshatra == 10 || nakshatra == 11 || nakshatra == 16 || nakshatra == 18 || nakshatra == 19 || nakshatra == 20 || nakshatra == 25) {
		System.out.println("Nakshatra: Ashubha");
	} else {
		System.out.println("Nakshatra: Shubha");
	}
	
	int yoga = (area * 4)/27;
	
	if (yoga == 1 || yoga ==  6|| yoga == 9 || yoga == 10 || yoga == 13 || yoga == 15 || yoga == 17 || yoga == 19 || yoga == 27) {
		System.out.println("Yoga: Ashubha");
	} else {
		System.out.println("Yoga: Shubha");
	}
	
	int  ansh = (area * 6)/9;
	
	if (ansh == 2 || ansh == 3 || ansh == 7 || ansh == 8 || ansh == 9) {
		System.out.println("Ansh: Shubha");
	} else {
		System.out.println("Ansh: Ashubha");
	}
	
	int dikpalaka = ayushya / 8;
	
	if (dikpalaka == 1 || dikpalaka == 5 || dikpalaka == 7 || dikpalaka == 8) {
		System.out.println("dikpalaka: Uttama");
	} else {
		System.out.println("dikpalaka:Not Uttama");
	}
	}

}

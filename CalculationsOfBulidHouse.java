
public class CalculationsOfBulidHouse {
	public static void findAyushya(double area) {
		
		double ayushya1 = area * 9;
		double ayushya2 = Math.round(ayushya1)/120;
		double ayushya3 = ayushya2 * 120;
		double ayushya = ayushya1 - ayushya3;
		
		if (ayushya > 60) {
			System.out.println((int)ayushya + " Ayushya: Shubha");
		} else if(ayushya == 60) {
			System.out.println((int)ayushya + " Ayushya: Sadharana");
		} else {
			System.out.println((int)ayushya + " Ayushya: Ashubha");
		}
	}

	
	public static void findtithi(double area) {
		double tithi1 = (area * 8);
		double tithi2 = Math.round(tithi1)/30;
		double tithi3 = tithi2 * 30;
		double tithi = tithi1 - tithi3;
		
		if (tithi == 4 || tithi == 9 || tithi == 14 || tithi == 30) {
			System.out.println((int)tithi +" Tithi: Ashubha");
		} else {
			System.out.println((int)tithi + " Tithi: Shubha");
		}
		
	}
	
	public static void findVar(double area) {
		double var1 = (area * 9);
		double var2 = Math.round(var1)/7;
		double var3 = var2*7;
		double var = var1 - var3;
		
		if (var == 2 || var == 4 || var == 5 || var == 6) {
			System.out.println((int)var +" Var: Shubha");
		} else {
			System.out.println((int)var +  " Var: Ashubha");
		}
	}
	
	public static void findNakshatra(double area) {
		double nakshatra1 = (area * 8);
		double nakshatra2 = Math.round(nakshatra1)/27;
		double nakshatra3 = nakshatra2 * 27;
		double nakshatra = nakshatra1 - nakshatra3;
		
		if (nakshatra == 2 || nakshatra == 3 || nakshatra == 9 || nakshatra == 10 || nakshatra == 11 || nakshatra == 16 || nakshatra == 18 || nakshatra == 19 || nakshatra == 20 || nakshatra == 25) {
			System.out.println((int)nakshatra + " Nakshatra: Ashubha");
		} else {
			System.out.println((int)nakshatra + " Nakshatra: Shubha");
		}
		
	}
	
	public static void fingYoga(double area) {
		double yoga1 = (area * 4);
		double yoga2 = Math.round(yoga1)/27;
		double yoga3 = yoga2*27;
		double yoga = yoga1-yoga3;
		
		if (yoga == 1 || yoga ==  6|| yoga == 9 || yoga == 10 || yoga == 13 || yoga == 15 || yoga == 17 || yoga == 19 || yoga == 27) {
			System.out.println((int)yoga + " Yoga: Ashubha");
		} else {
			System.out.println((int)yoga + " Yoga: Shubha");
		}
		
	}

	
	public static void findAnsh(double area) {
		double  ansh1 = (area * 6);
		double  ansh2 = Math.round(ansh1)/9;
		double  ansh3 = ansh2 * 9;
		double  ansh = ansh1 - ansh3;
		
		if (ansh == 2 || ansh == 3 || ansh == 7 || ansh == 8 || ansh == 9) {
			System.out.println((int)ansh + " Ansh: Shubha");
		} else {
			System.out.println((int)ansh + " Ansh: Ashubha");
		}
	}
	
	public static void findDikpalaka(double area) {

		double ayushya1 = area * 9;
		double ayushya2 = Math.round(ayushya1)/120;
		double ayushya3 = ayushya2 * 120;
		double ayushya = ayushya1 - ayushya3;
		
		double dikpalaka1 = (int)ayushya / 8;
		double dikpalaka2 = dikpalaka1 * 8;
		double dikpalaka = ayushya - dikpalaka2;
		
		
		if (dikpalaka == 1 || dikpalaka == 5 || dikpalaka == 7 || dikpalaka == 8) {
			System.out.println((int)dikpalaka + " dikpalaka: Shubha");
		} else {
			System.out.println((int)dikpalaka + " dikpalaka:Ashubha");
		}
	}
}

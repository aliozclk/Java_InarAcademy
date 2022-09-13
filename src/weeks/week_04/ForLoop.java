package weeks.week_04;

public class ForLoop {
	
	public static void main(String[] args) {
		
		
		sadeceUnluHarfler("aliozcelik");
		sadeceUnsuzHarfler("aliozcelik");

		
	}
	
	public static void sadeceUnluHarfler(String ds) {
		
		int l = ds.length();
		
		for (int i = 0; i < l; i++) {
			char harf = ds.toLowerCase().charAt(i);
			
			
			if(harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u') {
				System.out.print(harf);
				
			}
		}
		System.out.println();
	}

	public static void sadeceUnsuzHarfler(String s) {
		
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			char harf = s.toLowerCase().charAt(i);
		
		
			
			if(!(harf == 'a' || harf == 'e' || harf == 'i' || harf == 'o' || harf == 'u')) {
				
				result += s.charAt(i); 
				
			}
			
		}
	
		System.out.println(result);
	}
	
	
}

package weeks.week_04;

public class LiveClass {
	public static void main(String[] args) {
		/*	 * 1 - Anlat
		 * 2 - Ornekle
		 * 3 - Algoritmani sozel 
		 * 	4 - Test case olustur
		 * 5 - Kod yaz
		 * 6 - test et
		 */
		
		
		//String str = "Java is Fun";
		
		//interview1();
		//interview2(str);
		//interview3("afasdfghnjfdhj");
		//interview3("adanaanada");
		//interview4("academy");
		//interview4("AliAliAliAli");
		
	}
	
	public static void interview1() {
		
	
		int value = 8465 ;
		int negativeValue = -8423 ;
	 
		String num = Integer.toString(value);
		String negNum = Integer.toString(negativeValue);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(num);
		System.out.println(negNum);
	 
 	}
	
	public static void interview2(String a) {
		
	
		
	
		String newStr = a.replace('a', 'X');
		newStr = newStr.replace('e', 'X');
		newStr = newStr.replace('i', 'X');
		newStr = newStr.replace('o', 'X');
		newStr = newStr.replace('u', 'X');

		System.out.println(newStr);
	}
	
	public static void interview3(String s) {
		
		boolean isPalindrome = true ;
		
		for (int i = 0; i < s.length()/2 ; i++) {
			
			if(s.charAt(i) != s.charAt(s.length()- ++i)){
				isPalindrome = false ;
			}
		
			
		}
		
		if(isPalindrome) {
			System.out.println(s + " is palindrom");
					
		}else {
			System.out.println(s + " is not palindrom");
		}
	}
	
	public static void interview4(String s) {
	
		String result = "";
		
		for (int i = 0; i < s.length(); i++) {
			String d = Character.toString(s.charAt(i));
			if(!result.contains(d)){
				result += d ;
			}
				
		}
		System.out.println(result);
					
	}
	
}

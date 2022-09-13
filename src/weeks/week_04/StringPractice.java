package weeks.week_04;

public class StringPractice {
	public static void main(String[] args) {
		
		//length();
		//substring();
		//equalsIgnoreCase();
		//contains();
		//trim();
		//charAt();
		//toLowerCase();
		//toUpperCase();
		
		
		
		
	}
	public static void substring() {
		String temp = "Inar Academy";
		String yeni = temp.substring(3, 9);
		System.out.println(temp);
		System.out.println(yeni);
	}
	
	public static void length() {
		
		String temp = "I love Inar Academy";
		
		int length = temp.length();
		
		System.out.println(length);
	}
	
	public static void equalsIgnoreCase() {
		
		String s1 = "I love Java";
		String s2 = "I love JAVA";
		System.out.println(s1.equalsIgnoreCase(s2));
		
	}
	
	public static void contains() {
		String s1 = "I love Java";
		String s2 = "Java";
		
		System.out.println(s1.contains(s2));
		
	}
	
	public static void trim() {
		
		String s1 = "    \t I love Inar    \n ";
		
		System.out.println(s1.trim());
	}
	public static void charAt() {
		String s1 = "    \t I love Inar    \n ";
		
		System.out.println(s1.trim().charAt(8));
	}
	
	public static void toLowerCase() {
		String s1 = " JaVa In A r";
		
		System.out.println(s1.toLowerCase());
	}
	public static void toUpperCase() {
		String s1 = " JaVa In A r";
		
		System.out.println(s1.toUpperCase());
	}
	
	
	
}

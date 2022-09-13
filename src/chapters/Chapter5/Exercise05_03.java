package chapters.Chapter5;

public class Exercise05_03 {

	public static void main(String[] args) {
		System.out.printf("%-15s%6s\n","Kilogram","Pounds");
		
		for (double i = 1; i < 200; i += 2 ) {
			System.out.printf("%-15.0f%6.1f\n",i,i*2.2);
			
		}
	}
}

package chapters.chapter5;

public class Exercise05_15 {
	public static void main(String[] args) {
		
		for(int i = (int) '!' , counter = 1 ; i <= (int) '~' ; i++, counter++ ) {
			System.out.print((char)i + " ");
			if(counter % 10 == 0) {
				System.out.println();
			}
		}
	}

}

package chapters.Chapter5;

public class Exercise05_13 {
	public static void main(String[] args) {
		
		int num = (int)Math.cbrt(12_000)+1;
		
		while (Math.pow(num, 3) > 12_000 ) {
			--num;
		}
		System.out.println(num);
	}
}

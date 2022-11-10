package chapters.chapter5;

public class Exercise05_12 {
	public static void main(String[] args) {
		
		int num = (int)Math.sqrt(12_000);
		
		while(Math.pow(num, 2) < 12_000){
			num++;
		}
		
		
		System.out.println(num);
	}
	

}

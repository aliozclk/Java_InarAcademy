package chapters.Chapter4;

public class Exercise04_25 {
	public static void main(String[] args) {
		String plate = "";
		for (int i = 0; i < 3; i++) {
			int value =(int) (Math.random()*('Z' - 'A') + 'A');
			
			plate += (char)value ;
		}
		plate += " ";
		
		for (int i = 0; i < 4; i++) {
			int value =(int) (Math.random()*('9' - '1') + '1');
			plate += (char) value ;
		}
		
		System.out.println("The plate :" + plate);
	}

}

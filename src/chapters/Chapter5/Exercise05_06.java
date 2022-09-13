package chapters.Chapter5;

public class Exercise05_06 {
	public static void main(String[] args) {
		
		System.out.printf("%-10s%10s\t|\t%-10s%10s\n","Miles","Kilometers","Kilometers","Miles");
		
		for (int i = 1 , j = 20; i + j < 76; i++ , j += 5) {
			
			System.out.printf("%-10d%-10.3f\t|\t",i , i * 1.609);
			System.out.printf("%-10d%-10.3f\n",j , j/ 1.609);
		}
	}

}

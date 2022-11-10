package chapters.chapter5;

public class Exercise05_05 {
	public static void main(String[] args) {
		System.out.printf("%-15s%6s\t|\t%-6s%15s\n","Kilogram","Pounds","Pounds","Kilogram");
		
		for (int i = 1 , j = 20 ; i + j  < 716  ; i += 2 , j += 5 ) {
			
			
			System.out.printf("%-15d%6.1f\t|\t",i,i*2.2);
			
			System.out.printf("%-6d%15.2f\n",j,j/2.2);
			
		}
	}
}

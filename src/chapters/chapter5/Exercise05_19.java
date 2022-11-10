package chapters.chapter5;

public class Exercise05_19 {
	public static void main(String[] args) {
		
		for(int lines = 1 ; lines <= 8 ; lines++) {
			for(int j = 1 ; j <= 16-2*lines ; j++ ) {
				System.out.print("  ");
			}
			for(int k = 0 ; k < lines ; k++ ) {
				System.out.printf("%3d%s",(int)(Math.pow(2, k))," ");
			}
			for(int t = lines-2; t >= 0 ; t -- ) {
					System.out.printf("%3d%s",(int)Math.pow(2, t)," ");
				
			}
			System.out.println();
		}
	}

}

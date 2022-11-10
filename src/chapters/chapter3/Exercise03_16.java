package chapters.chapter3;

public class Exercise03_16 {
	public static void main(String[] args) {
		int posOrNegx = (int)(Math.random() * 2 );
		int posOrNegy = (int)(Math.random() * 2 );

		double x = (double)(Math.random()* 50);
		double y = (double)(Math.random() * 100 );
		
		if(posOrNegx == 0)
			x *= -1 ;
		if(posOrNegy == 0)
			y *= -1 ;
		System.out.println("The coordinate of the point is x: " +  x +
				", y " + y );
		
	}
}

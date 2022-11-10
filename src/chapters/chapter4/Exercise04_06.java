package chapters.chapter4;

public class Exercise04_06 {
	public static void main(String[] args) {
		
	
	double x1 = Math.random()*41;
	int negOrPos =(int) (Math.random()*2);
	if(negOrPos == 1 )
		x1 *= -1 ;
	
	double y1 = Math.sqrt(40 * 40 - x1 * x1);
	negOrPos = (int)(Math.random() * 2);
	if(negOrPos == 1 )
		y1 *= -1 ;
	
	double x2 = Math.random() * 41 ;
	negOrPos = (int)(Math.random() * 2);
	if(negOrPos == 1 )
		x2 *= -1 ;
	
	double y2 = Math.sqrt(40* 40 - x2 * x2);
	negOrPos = (int)(Math.random() * 2);
	if(negOrPos == 1 )
		y1 *= -1 ;
	
	double x3 = Math.random() * 41 ;
	negOrPos = (int)(Math.random() * 2);
	if(negOrPos == 1 )
		x3 *= -1 ;
	
	double y3 = Math.sqrt(40* 40 - x3 * x3);
	negOrPos = (int)(Math.random() * 2);
	if(negOrPos == 1 )
		y3 *= -1 ;
	
	System.out.println(" x1: " + x1 +" y1 : "+ y1 + " x2: " + x2+ " y2: " + y2 + " x3: "+ x3+ 
			" y3: " + y3);
	
	double side1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1 , 2));
	double side2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2 , 2));
	double side3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1 , 2));
	
	double angle1 = Math.toDegrees( Math.acos( (side2*side2 + side3*side3 - side1*side1) / (2 * side2 * side3)));
	double angle2 = Math.toDegrees( Math.acos( (side3*side3 + side1*side1 - side2*side2) / (2 * side3 * side1)));
	double angle3 = Math.toDegrees( Math.acos( (side1*side1 + side2*side2 - side3*side3) / (2 * side1 * side2)));
	
	System.out.println("angle1 : " + angle1 + " angle2 : " + angle2 + " angle3 : " + angle3);
	System.out.println("Total : " +( angle1 + angle2 + angle3));
	
	//cosA = b^2 + c^2 - a^2 / 2 * b *c
	
	
	
	
	}
	
}

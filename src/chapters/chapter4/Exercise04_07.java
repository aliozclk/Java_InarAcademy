package chapters.chapter4;

public class Exercise04_07 {
	public static void main(String[] args) {
		
		double radius = 100 ;
		
		double aX = radius * Math.sin(0) ;
		double aY = radius * Math.cos(0);
		
		double bX = radius * Math.sin(72) ;
		double bY = radius * Math.cos(72) ;
		
		double cX = radius * Math.sin(144) ;
		double cY = radius * Math.cos(144) ;
		
		double dX = radius * Math.sin(216) ;
		double dY = radius * Math.cos(216) ;
		
		double eX = radius * Math.sin(288) ;
		double eY = radius * Math.cos(288) ;
		
		String vertexA = "(" + Double.toString(aX) + "," + Double.toString(aY) + ")";
		String vertexB = "(" + Double.toString(bX) + "," + Double.toString(bY) + ")";
		String vertexC = "(" + Double.toString(cX) + "," + Double.toString(cY) + ")";
		String vertexD = "(" + Double.toString(dX) + "," + Double.toString(dY) + ")";
		String vertexE = "(" + Double.toString(eX) + "," + Double.toString(eY) + ")";
		
		System.out.println(vertexA + " \n " + vertexB + "\n" + vertexC + "\n" +
				vertexD + "\n" + vertexE + "\n");
	}

}

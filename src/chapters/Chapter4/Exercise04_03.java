package chapters.Chapter4;

public class Exercise04_03 {
	public static void main(String[] args) {
		
		double latitudeAtalanta = 33.748783;
		double longitudeAtalanta = -84.388168 ;
		double x1 = Math.toRadians(latitudeAtalanta);
		double y1 = Math.toRadians(longitudeAtalanta);
		
		double orlandoLatitude = 28.538336 ;
		double orlandoLongitude = -81.379234 ;
		double x2 = Math.toRadians(orlandoLatitude);
		double y2 = Math.toRadians(orlandoLatitude);
		
		double savannahLatitude = 32.083541 ;
		double savannahLongitude = -81.099834 ;
		double x3 = Math.toRadians(savannahLatitude);
		double y3 = Math.toRadians(savannahLongitude);
		
		double charlotteLatitude = 35.213890 ;
		double charlotteLongitude = -80.943054 ;
		double x4 = Math.toRadians(charlotteLatitude);
		double y4 = Math.toRadians(charlotteLongitude);
		
		double radius = 6371.01;
		double side1 = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) *  
				Math.cos(x2) * Math.cos(y1 - y2 )	);
		double side2 = radius * Math.acos(Math.sin(x2) * Math.sin(x3) + Math.cos(x2) *  
				Math.cos(x3) * Math.cos(y2 - y3)	);
		double side3 = radius * Math.acos(Math.sin(x3) * Math.sin(x4) + Math.cos(x3) *  
				Math.cos(x4) * Math.cos(y3 - y4 )	);
		double side4 = radius * Math.acos(Math.sin(x4) * Math.sin(x1) + Math.cos(x4) *  
				Math.cos(x1) * Math.cos(y4 - y1 )	);
		double side5 = radius * Math.acos(Math.sin(x3) * Math.sin(x1) + Math.cos(x3) *  
				Math.cos(x1) * Math.cos(y3 - y1 )	);
		
		
		double s = (side1 + side2 + side5)/ 2 ;
		double area1 = Math.pow((s*(s-side1)* (s- side2)* (s- side5)), 0.5);
		s = (side5 + side3 + side4)/ 2 ;
		double area2 = Math.pow((s*(s-side5)* (s- side3)* (s- side4)), 0.5);
		
		System.out.println("The area enclosed by four cities is  " + area1 + area2);
		
		
		
		
	}
}

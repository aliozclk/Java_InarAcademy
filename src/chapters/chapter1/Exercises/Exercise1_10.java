package chapters.chapter1.exercises;

public class Exercise1_10 {
	public static void main(String[] args) {
		double distanceKm = 14 ;
		double distanceMile = distanceKm/1.6 ;
		double timeSecond = 45*60 + 30 ;
		double distancePerSec = distanceMile / timeSecond ;
		System.out.println("Runner runs " + (distancePerSec * 60*60 ) + " mile per hour.");
	}
}

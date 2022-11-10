package chapters.chapter9.exercise09_13;

public class Location {
    public int row;
    public int column;
    public double maxValue;

    Location(){

    }

    public static Location locateLargest(double[][] a){
        Location location = new Location();
        for (int row = 0; row < a.length; row++) {
            for (int col = 0; col < a[row].length; col++) {
                if (a[row][col] > location.maxValue){
                    location.maxValue = a[row][col];
                    location.row = row;
                    location.column = col;
                }

            }

        }
        return location;
    }
}

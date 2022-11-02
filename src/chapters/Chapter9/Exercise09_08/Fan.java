package chapters.Chapter9.Exercise09_08;

public class Fan {
    final int SLOW = 1 ;
    final int MEDIUM = 2 ;
    final int FAST = 3 ;

    private int speed ;
    private boolean on ;
    private double radius;
    String color ;

    Fan(){
        speed = SLOW;
        on = false;
        radius = 5 ;
        color = "blue";
    }

    double getRadius() {
        return radius;
    }

    void setRadius(double radius) {
        this.radius = radius;
    }

    int getSpeed() {
        return speed;
    }

    void setSpeed(int speed) {
        this.speed = speed;
    }

    String getColor() {
        return color;
    }

    void setColor(String color) {
        this.color = color;
    }

    boolean getOn(){
        return on;
    }

    void setOn(boolean on) {
        this.on = on;
    }

    public String toString(){

        if(getOn()){
            return "Speed : " + Integer.toString(speed) +
                    "\nColor : " + color +
                    "\nRadius : " +Double.toString(radius);
        }

        return "fan is off";
    }
}

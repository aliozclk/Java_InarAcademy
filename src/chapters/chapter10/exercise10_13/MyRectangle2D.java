package chapters.chapter10.exercise10_13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(){
        this(0,0,1,1);
    }
    public  MyRectangle2D(double x , double y , double width, double height){
        this.x = x ;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return width * height ;
    }
    public double getPerimeter(){
        return 2 * (width + height);
    }

    public boolean contains(double x, double y){
        return x < this.x + width/2 && x > this.x - width/2 &&
                y < this.y + height/2 && y > this.y - height/2 ;
    }
    public boolean contains(MyRectangle2D myRectangle2D){
        if(myRectangle2D.height > this.height || myRectangle2D.width > this.width){
            return false;
        }
        double rectangleRight = this.x + width / 2 ;
        double rectangleLeft = this.x - width / 2 ;
        double rectangleTop = this.y + height / 2 ;
        double rectangleBottom = this.y - height / 2 ;

        double rectangleRight2 = myRectangle2D.x + myRectangle2D.width / 2 ;
        double rectangleLeft2 = myRectangle2D.x - myRectangle2D.width / 2 ;
        double rectangleTop2 = myRectangle2D.y + myRectangle2D.height / 2 ;
        double rectangleBottom2 = myRectangle2D.y - myRectangle2D.height / 2 ;

        return rectangleRight >= rectangleRight2 && rectangleLeft <= rectangleLeft2 &&
                rectangleTop >= rectangleTop2 && rectangleBottom <= rectangleBottom2 ;
    }

    public boolean overlaps(MyRectangle2D myRectangle2D){
        double rectangleRight = this.x + width / 2 ;
        double rectangleLeft = this.x - width / 2 ;
        double rectangleTop = this.y + height / 2 ;
        double rectangleBottom = this.y - height / 2 ;

        double rectangleRight2 = myRectangle2D.x + myRectangle2D.width / 2 ;
        double rectangleLeft2 = myRectangle2D.x - myRectangle2D.width / 2 ;
        double rectangleTop2 = myRectangle2D.y + myRectangle2D.height / 2 ;
        double rectangleBottom2 = myRectangle2D.y - myRectangle2D.height / 2 ;

        boolean isOutside =  rectangleRight < rectangleLeft2 || rectangleLeft > rectangleRight2 ||
                rectangleTop < rectangleBottom2 || rectangleBottom > rectangleTop2 ;
        return !isOutside && !contains(myRectangle2D);
    }
}

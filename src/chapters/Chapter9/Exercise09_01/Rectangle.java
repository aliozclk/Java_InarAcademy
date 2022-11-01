package chapters.Chapter9.Exercise09_01;

public class Rectangle {
    double width;
    double height;

    Rectangle(){
        this.width = 1 ;
        this.height = 1 ;
    }

    Rectangle(double width , double height){
        this.width = width;
        this.height = height ;
    }

    double getArea(){
        return height * width ;
    }

    double getPerimeter(){
        return 2 * (width + height);
    }
}

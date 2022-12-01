package chapters.chapter13.exercise13_06;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {

    ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(ComparableCircle o) {
        if(this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() == o.getArea()) {
            return 0;
        }else {
            return -1;
        }
    }
}

package chapters.chapter11.exercise11_06;

import javafx.scene.shape.Circle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class Exercise11_06 {
    public static void main(String[] args) {
       ArrayList<Object> list = new ArrayList<>();
       list.add(new Loan());
       list.add(new Date());
       list.add(new String("s"));
       list.add(new Circle());

       for (int i = 0; i < list.size() ; i++) {
            System.out.println(list.get(i).toString());
       }

    }
}

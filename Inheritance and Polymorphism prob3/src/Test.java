import java.text.DecimalFormat;

/**
 * Created by hp on 9/15/2019.
 */
public class Test {

    public static void main(String[] args) {

        ClosedCurve[] objects = {new Triangle(4, 5, 6),
                new Square(3),
                new Rectangle(3, 7),
                new Circle(3)};

        DecimalFormat df = new DecimalFormat("0.00");

        //compute areas
        for (ClosedCurve cc : objects) {
            System.out.println("The area of this " + cc.getClass().getName()+
                    " is " + df.format(cc.computeArea()));

        }

    }

}
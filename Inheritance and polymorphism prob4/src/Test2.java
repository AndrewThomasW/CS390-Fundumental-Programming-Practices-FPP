import java.text.DecimalFormat;

/**
 * Created by hp on 9/15/2019.
 */
public class Test2 {

    public static void main(String[] args) {

        Polygon [] objects = {
                new Square(3),
                new Triangle(4, 5, 6),
                new Rectangle(3, 4),
        };

        //output message
        for (Polygon p : objects) {
            System.out.println(
                    "For this " + p.getClass().getName() + "\n" +
                            "  Number of sides = " + p.getNumberOfSides() + "\n" +
                            "  Perimeter = " + p.computePerimeter()
            );

        }

    }

}
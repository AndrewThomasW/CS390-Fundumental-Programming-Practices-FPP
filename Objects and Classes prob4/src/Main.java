/**
 * Created by hp on 9/15/2019.
 */

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {

        Triangle triangle = new Triangle(4, 9);
        Rectangle rectangle = new Rectangle(5, 3);
        Circle circle = new Circle(4);

        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Area of Triangle is " + df.format(triangle.computeArea()));
        System.out.println("Area of Rectangle is " + df.format(rectangle.computeArea()));
        System.out.println("Area of Circle is " + df.format(circle.computeArea()));

    }

}
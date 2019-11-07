/**
 * Created by hp on 9/15/2019.
 */
public class Circle {
    //fields
    double radius;

    //constructor
    public Circle(double radius) {
        this.radius = radius;
    }

    //methods

    public double getRadius(){
        return radius;
    }

    public double computeArea() {
        return (Math.PI * radius * radius);
    }

}

/**
 * Created by hp on 9/15/2019.
 */
public class Rectangle extends ClosedCurve implements Polygon  {

    //fields
    private double width;
    private double length;

    //constructor
    public Rectangle(double width,double length){
        this.length = length;
        this.width = width;
    }

    public double computeArea(){
        return length * width;
    }

    public String getName(){
        return "Rectangle";
    }

    public int getNumberOfSides(){
        return 4;
    }

    public double computePerimeter(){
        return (2 * length) + (2 * width);
    }

}

/**
 * Created by hp on 9/15/2019.
 */
public class Rectangle extends  ClosedCurve {

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



}

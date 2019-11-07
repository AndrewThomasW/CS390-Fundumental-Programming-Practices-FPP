/**
 * Created by hp on 9/15/2019.
 */
public class Rectangle {

    //fields
    private double width;
    private double length;

    //constructor
    public Rectangle(double length,double width){
        this.length = length;
        this.width = width;
    }

    //methods
    public double getWidth(){
        return width;
    }

    public double getLength(){
        return length;
    }

    public double computeArea(){
        return length * width;
    }

}

/**
 * Created by hp on 9/15/2019.
 */
public class Square extends ClosedCurve implements Polygon{
    double side;
    public Square(Double side){
        this(side.doubleValue());
    }
    public Square(double side) {
        this.side = side;
    }
    double computeArea() {
        return(side*side);
    }

    String getName(){
        return "Square";
    }

    public int getNumberOfSides(){
        return 4;
    }

    public double computePerimeter(){
        return (4 * side);
    }
}

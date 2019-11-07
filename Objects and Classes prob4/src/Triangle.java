/**
 * Created by hp on 9/15/2019.
 */
// IGNORE many of the details in this file!

import java.util.Arrays;

public class Triangle {

    //fields
    private double base;
    private double height;

    //constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    //methods

    public double getBase() {
        return base;
    }

    public double getHeight(){
        return height;
    }

    public double computeArea() {
        return (0.5 * base * height);
    }

}

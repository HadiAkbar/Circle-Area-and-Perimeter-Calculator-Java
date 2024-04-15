/*********************************************************
 *  This is the circle object class
 *  Having methods to calculate Area and Perimeter
 *
 *  Author : Hadi Akbar
 *  Date   : 12/April/2024
 **********************************************************/
public class Circle
{
    //instance data
    protected double radius;

    //constructor
    public Circle()
    {

    }

    //accessor method for radius
    public double getRadius()
    {
        return radius;
    }

    //mutator method for radius
    public void setRadius(double radius)
    {
        if (radius < 0)
        {
            throw new IllegalArgumentException("Invalid input! Radius can only be a positive number");
        }
        this.radius = radius;
    }

    //toString method
    public String toString()
    {
        return String.format("Radius of the circle is => %.2f\n", radius);
    }

    //method to get area
    public double getArea()
    {
        return Math.PI*Math.pow(radius, 2);
    }

    //method to get perimeter
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
}

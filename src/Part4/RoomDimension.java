package Part4;

/**
 * Created by Nathan Bingham on 1/28/15.
 */

public class RoomDimension
{
    private double length;
    private double width;

    public RoomDimension(double length, double width)
    {
        this.length = length;
        this.width = width;
    }

    public double getArea()
    {
        return this.length * this.width;
    }

    public String toString()
    {
        return "L:"+length+",W:"+width;
    }
}
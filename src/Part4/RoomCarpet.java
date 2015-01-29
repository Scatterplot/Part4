package Part4;

/**
 * Created by Nathan Bingham on 1/28/15.
 */

public class RoomCarpet
{
    private RoomDimension dimension;
    private double carpetCost;

    public RoomCarpet(RoomDimension dimension, double cost)
    {
        this.dimension = dimension;
        this.carpetCost = cost;
    }

    public double getTotalCost()
    {
        return this.carpetCost * this.dimension.getArea();
    }
}

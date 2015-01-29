package Part4;

/**
 * Created by Nathan Bingham on 1/28/15.
 */

// Test

public class CarpetDriver
{
    public static void main(String[] args)
    {
        System.out.println("This file tests the RoomCarpet and RoomDimensions classes");

        RoomDimension room1 = new RoomDimension(5,6);
        RoomDimension room2 = new RoomDimension(4,3);

        System.out.println("Room 1 area: "+room1.getArea()+" feet");
        System.out.println("Room 2 area: "+room2.getArea()+" feet");

        RoomCarpet room1Carpet = new RoomCarpet(room1, 5);
        RoomCarpet room2Carpet = new RoomCarpet(room2, 10);

        System.out.println("With an area of "+room1.getArea()+", the carpet cost is $"+room1Carpet.getTotalCost());
        System.out.println("With an area of "+room2.getArea()+", the carpet cost is $"+room2Carpet.getTotalCost());
    }
}

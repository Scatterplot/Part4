package Part4;

import java.util.Scanner;

/**
 * Created by Nathan Bingham on 1/28/15.
 */

// Test

public class CarpetDriver
{
    static final double PLUSH_PRICE = 5;
    static final double SHAG_PRICE = 10;
    static final double SAXONY_PRICE = 15;

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("This program will calculate the price of the carpet for a room.");
        System.out.print("Please input the width of the room in feet: ");
        double roomWidth = scanner.nextDouble();
        System.out.print("Please input the length of the room in feet: ");
        double roomLength = scanner.nextDouble();

        RoomDimension roomSize = new RoomDimension(roomLength,roomWidth);
        RoomCarpet theRoom = new RoomCarpet(roomSize,PLUSH_PRICE);

        System.out.println("The total cost of the carpet for the room is $"+theRoom.getTotalCost()+".");

        // DEPRECATED CODE
//        System.out.println("This file tests the RoomCarpet and RoomDimensions classes");
//
//        RoomDimension room1 = new RoomDimension(5,6);
//        RoomDimension room2 = new RoomDimension(4,3);
//
//        System.out.println("Room 1 area: "+room1.getArea()+" feet");
//        System.out.println("Room 2 area: "+room2.getArea()+" feet");
//
//        RoomCarpet room1Carpet = new RoomCarpet(room1, 5);
//        RoomCarpet room2Carpet = new RoomCarpet(room2, 10);
//
//        System.out.println("With an area of "+room1.getArea()+", the carpet cost is $"+room1Carpet.getTotalCost());
//        System.out.println("With an area of "+room2.getArea()+", the carpet cost is $"+room2Carpet.getTotalCost());
    }
}

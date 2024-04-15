/*********************************************************
 *  This is the Main (Driver) class
 *  It is using the Circle object class and performing the
 *  tasks like asking the user to input the radius of the
 *  circle and then prints to the screen the Area and the
 *  Perimeter (circumference) of the circle.
 *
 *  Author : Hadi Akbar
 *  Date   : 12/April/2024
 **********************************************************/
import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        boolean validInput = false;

        System.out.println("******************************************************************************************************");
        System.out.println("* This program asks you the radius of a circle and calculates its Area and Perimeter (circumference) *");
        System.out.println("* Programmed by Hadi Akbar                                                                           *");
        System.out.println("******************************************************************************************************");

        do {
            do {
                try {
                    Circle circle1 = new Circle();

                    System.out.format("\nEnter the radius of the circle => ");
                    double radius = input.nextDouble();
                    circle1.setRadius(radius);

                    System.out.format("\n");
                    System.out.format(circle1.toString());
                    System.out.format("Area of the circle is => %.2f\n", circle1.getArea());
                    System.out.format("Perimeter (circumference) of the circle is => %.2f\n", circle1.getPerimeter());

                    validInput = true;
                } catch (IllegalArgumentException e) {
                    System.out.println(e.getMessage());
                    input.nextLine();
                } catch (Exception e) {
                    System.out.println("Invalid input! Radius can only be a positive number");
                    input.nextLine();
                }
            }
            while (!validInput);
        }
        while (true);
    }
}
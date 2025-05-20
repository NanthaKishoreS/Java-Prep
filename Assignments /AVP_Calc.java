import java.sql.SQLOutput;
import java.util.Scanner;

public class APV_Calc {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Quantity You want to Calculate (Area,Perimeter,Volume): ");
        String Quantity = scan.nextLine();
        double pi = 3.141592653589793;
        if (Quantity.equals("Area")) {
            double Area = 0;
            System.out.println("1 -> Circle \n2 -> Triangle \n3 -> Rectangle \nEnter The Shape For Which You Want to Calculate the Area : ");
            String Shape = scan.nextLine();
            if (Shape.equalsIgnoreCase("circle")) {
                System.out.print("Enter The Radius For Calculating the Area Of the Circle : ");
                float radius = scan.nextFloat();
                System.out.print("Enter The Type of Triangle for Which You want to Find the Area \n 1 -> Area Of Isosceles Triangle \n 2 -> Area Of Equilateral Triangle");
                Area = (pi * (radius * radius));
                System.out.println("The Area Of the Circle is : " + Area);
            } else if (Shape.equalsIgnoreCase("Triangle")) {
                System.out.println("Enter The Base Length For Calculating The Area Of the Triangle : ");
                float Base = scan.nextFloat();
                System.out.print("Enter The Height For Calculating The Area Of the Triangle : ");
                float Height = scan.nextFloat();
                Area = 0.5 * Base * Height;
                System.out.println("The Area Of the Triangle Is : " + Area);
            } else if (Shape.equalsIgnoreCase("Rectangle")) {
                System.out.println("Enter The Breath For Calculating The Area Of the Rectangle : ");
                float Breath = scan.nextFloat();
                System.out.println("Enter The Width For Calculating The Area Of the Rectangle : ");
                float Width = scan.nextFloat();
                Area = Breath * Width;
                System.out.println("The Area Of the Rectangle Is : " + Area);
            } else {
                System.out.println("Invalid Shape !!!");
            }
        } else if (Quantity.equalsIgnoreCase("Volume")) {
            double Volume = 0;
            System.out.print("1 -> Circle \n2 -> Cone \n3 -> Rectangle \nEnter The Shape For Which You Want to Calculate the Volume : ");
            String Shape = scan.nextLine();
            if (Shape.equalsIgnoreCase("circle")) {
                System.out.print("Enter The Radius For Calculating the Volume Of the Circle : ");
                float radius = scan.nextFloat();
                Volume = ((4/3)*pi*(Math.pow(radius,3)));
                System.out.println("The Volume Of the Circle is : " + Volume);
            } else if (Shape.equalsIgnoreCase("Cone")) {
                System.out.print("Enter The Radius For Calculating The Area Of the Triangle : ");
                float radius = scan.nextFloat();
                System.out.print("Enter The Height For Calculating The Area Of the Triangle : ");
                float Height = scan.nextFloat();
                Volume = (1/3)*pi*Math.pow(radius,2)*Height;
                System.out.println("The Area Of the Triangle Is : " + Volume);
            } else if (Shape.equalsIgnoreCase("Rectangle")) {
                System.out.println("Enter The Breath For Calculating The Volume Of the Rectangle : ");
                float Breath = scan.nextFloat();
                System.out.println("Enter The Width For Calculating The Volume Of the Rectangle : ");
                float Width = scan.nextFloat();
                System.out.println("Enter The Height For Calculating The Volume Of the Rectangle : ");
                float Height = scan.nextFloat();
                Volume = Breath * Width*Height;
                System.out.println("The Area Of the Rectangle Is : " + Volume);
            } else {
                System.out.println("Invalid Shape !!!");
            }
        }
    }
}

package nkfiles;

import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please Enter Temperature in C :");
        float tempC = scan.nextFloat();

        float tempF = tempC * (9.0f/5) + 32;
        System.out.println("Therefor, the Temperature in F is :" +tempF);

    }
}

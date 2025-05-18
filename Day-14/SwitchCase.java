import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Name of A Fruit");
        String fruit = scan.next();
        /*if(fruit.equalsIgnoreCase("Apple")){
            System.out.println("It keeps The Doctor Away");
        } else if (fruit.equalsIgnoreCase("Orange")) {
            System.out.println("It is Orange in Colour !!");
        } else if (fruit.equalsIgnoreCase("grapes")) {
            System.out.println("It was Tried to stolen By a Fox ");
        } else if (fruit.equalsIgnoreCase("Mango")) {
            System.out.println("It is Yellow in Colour");
        }else{
            System.out.println("Enter Any Other Fruit Name ");
        }*/

        switch(fruit){
            case "Mango":
                System.out.println("King of the Fruits");
                break;
            case "Apple":
                System.out.println("It Keeps the Doctor Away");
                break;
            case "Orange":
                System.out.println("It is Orange in Colour");
                break;
            default:
                System.out.println("Please Enter A Correct Fruit Name !!!");
        }
    }
}
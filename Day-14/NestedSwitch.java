import javax.swing.*;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        int empID = scan.nextInt();
        String Department = scan.next();

        switch(empID){
            case 119:
                System.out.println("Nantha Kishore ");
                switch (Department){
                    case "IT":
                        System.out.println("He is In IT Department");
                        break;
                    case "CSE":
                        System.out.println("He is In CSE Department");
                        break;
                }
                break;
            case 105:
                System.out.println("Mirthun KS");
                switch (Department){
                    case "IT":
                        System.out.println("He is In IT Department");
                        break;
                    case "CSE":
                        System.out.println("He is In CSE Department");
                        break;
                }
                break;
            case 118:
                System.out.println("Nanda Kishore Sreejith");
                switch (Department){
                    case "IT":
                        System.out.println("He is In IT Department");
                        break;
                    case "CSE":
                        System.out.println("He is In CSE Department");
                        break;
                }
                break;
        }
    }
}

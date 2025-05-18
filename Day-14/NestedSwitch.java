import javax.swing.*;
import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter A Roll Number For Displaying the Details Of the Student ");
        int empID = scan.nextInt();
        System.out.print("Enter The Department to Display The Details of the Student");
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
                    default:
                        System.out.println("No Department Entered !!");
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
                    default:
                        System.out.println("No Department Entered !!");
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
                    default:
                        System.out.println("No Department Entered !!");
                }
                break;
            default:
                System.out.println("No Roll Number Entered !!");
        }
    }
}
/*Ouput
/usr/lib/jvm/jdk-21.0.7-oracle-x64/bin/java -javaagent:/snap/intellij-idea-community/609/lib/idea_rt.jar=39545 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /home/nantha-kishore-s/IdeaProjects/Switch/out/production/Switch NestedSwitch
Enter A Roll Number For Displaying the Details Of the Student 119
Enter The Department to Display The Details of the StudentCSE
Nantha Kishore 
He is In CSE Department

Process finished with exit code 0
 */
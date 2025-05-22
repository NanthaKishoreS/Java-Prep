import java.util.Scanner;
public class Word_check {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Word To Check Whether the number is Vowel or not : ");
        char alpha = scan.next().trim().charAt(0);
        if(alpha=='a'||alpha=='e'||alpha=='i'||alpha=='o'||alpha=='u'||alpha=='A'||alpha=='E'||alpha=='I'||alpha=='O'||alpha=='U'){
            System.out.println("This is a Vowel");
        }else{
            System.out.println("This is Consonant");
        }
    }
}

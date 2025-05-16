import java.util.Scanner;

public class Largest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        /*if(a>b){
            if(a>c){
                System.out.println(a + "Is the Greatest Number ");
            }
            else{
                System.out.println(c +"  Is the Greatest Number ");
            }
        }
        else{
            if(b>c){
                System.out.println(b+ " Is the Greatest Number ");
            }
            else{
                System.out.println(c +"  Is the Greatest Number ");
            }
        }*/
        int max = a;
        if(b>max){
            max = b;
        }
        if (c>max) {
            max = c;
        }
        System.out.println("The Maximum Number is : "+ max);
    }
}

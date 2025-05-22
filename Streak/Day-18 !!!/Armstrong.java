import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a Number to Check whether it is A Amstrong Number Or Not :");
        int num = scan.nextInt();
        int originalnum = num;
        int calc = 0;
        while(num>0){
            int rem = num % 10;
            calc = calc + (rem*rem*rem);
            num = num / 10;
        }
        if(originalnum==calc){
            System.out.println("The Entered Number is A Armstrong Number !!");
        }
        else{
            System.out.println("The Entered Number is Not A Amstrong Number ");
        }
    }
}

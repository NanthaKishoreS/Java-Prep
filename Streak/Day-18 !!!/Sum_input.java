import java.util.Scanner;
//To Calculate the sum of
public class Sum_Of_n{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The No of Numbers You want to Add : ");
        int n = scan.nextInt();
        double sum = 0;
        for(int i= 0;i<n;i++){
            System.out.print("Enter The value for "+(i+1)+" number : ");
            int num = scan.nextInt();
            sum = sum + num;
        }
        System.out.println("The Sum of Numbers That you Entered is : "+sum);
    }
}

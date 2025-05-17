import java.util.Scanner;

public class Occurrence {
    public static void main(String[] args) {
        //Count the Occurrence of a number in the number
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter The Number : ");
        int num = scan.nextInt();
        System.out.print("Enter the Number Which You want to Count the Occurrence : ");
        int numc = scan.nextInt();
        int count  = 0;
        while(num>0){
            if(numc==(num%10)){
                count++;
            }
            num = num/10;
        }
        System.out.println(count);
    }
}

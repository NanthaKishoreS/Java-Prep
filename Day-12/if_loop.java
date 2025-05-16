import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int salary = scan.nextInt();
        if(salary>1000){
            salary = salary + 1000;
        } else if (salary<500) {
            salary = salary + 500;
            
        } else{
            System.out.println("No Increament !!!");
        }
        System.out.println(salary);
    }
}
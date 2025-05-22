import java.util.Scanner;
public class DAYS {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Choice For Checking The Odd Or Even Days in the Month : \n1 --> Odd Days Check \n2 --> Even Days Check");
        int Choice = scan.nextInt();
        scan.nextLine();
        System.out.println("Enter The Month For Checking The No of Odd Days ");
        String mon = scan.nextLine();
        if(Choice==1){
            if(mon.equalsIgnoreCase("January")||mon.equalsIgnoreCase("March")||mon.equalsIgnoreCase("May")||mon.equalsIgnoreCase("July")||mon.equalsIgnoreCase("August")||mon.equalsIgnoreCase("october")||mon.equalsIgnoreCase("December")){
                System.out.println("The Number of Odd Days in the Month Is 16");
            } else if (mon.equalsIgnoreCase("April")||mon.equalsIgnoreCase("June")||mon.equalsIgnoreCase("September")||mon.equalsIgnoreCase("November")){
                System.out.println("The Number of Odd Days in the Month Is 15");
            } else if (mon.equalsIgnoreCase("February")) {
                System.out.println("Enter a Year For Checking Whether it is Leap Year Not !! : ");
                int year = scan.nextInt();
                if(year%4==0||(year%100==0&&year%400==0)){
                    System.out.println("The Number of Odd Days in the Month Is 14");
                }
                else{
                    System.out.println("The Number of Odd Days in the Month Is 15");
                }
            }
        }
    }
}

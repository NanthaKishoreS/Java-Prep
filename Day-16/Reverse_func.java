import java.util.Scanner;
class Sudden{
        public static void main(String[] args){
                //Reverse a Number
                Scanner scan = new Scanner(System.in);
                int num = scan.nextInt(); 
                int r_num = Reverse(num);
                System.out.println(r_num);
        }
        static int Reverse(int num){
                int r_num = 0;
                while(num>0){
                        int rem = num %10;
                        r_num = (r_num)*10+rem;
                        num = num/10;
                }
                return r_num;

        }
}



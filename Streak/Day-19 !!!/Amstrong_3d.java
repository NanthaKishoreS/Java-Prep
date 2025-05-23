package Functions;

public class Armstrong {
    public static void main(String[] args) {
        int i=0;
        while(1>=100&&i<=999){
            while(i>0){
                int ori = i;
                int rem = ori%10;
                int num = 0;
                num = num + (rem*rem*rem);
                if(num==ori){
                    System.out.println(ori);
                }
                else{
                    continue;
                }
            }
            i++;
        }
    }
}

//https://leetcode.com/problems/richest-customer-wealth/
public class RichestCustumer {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        int sum = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                sum = sum + accounts[i][j];
            }
            if(sum>max){
                max = sum;
            }
            sum = 0;
        }
        return max;
    }
}
package Search;

import Arrays.Two_dim;

public class Searchin2d {
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4,5},
                {6,7,8,9,0}
        };
        int target = 0;
        String result  = Twodim(arr,target);
        if(result.equalsIgnoreCase("-1")){
            System.out.println("The Element Not Found !!!");
        }
        else{
            System.out.println(result);
        }
    }

    private static String Twodim(int[][] arr, int target) {
        if(arr.length==0){
            return "-1";
        }
        for(int i = 0;i<arr.length;i++){
            for (int j = 0; j < arr[i].length; j++) {
                if(target==arr[i][j]){
                    return "The Elements is At "+i+" Row and "+j+" Column";
                }
            }
        }
        return "-1";

    }


}

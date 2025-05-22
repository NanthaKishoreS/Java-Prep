package Functions;

import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2,3,4,5,6,7,8,9);
        multiple(2,3,"Hello World");
    }
    static void func(int ...v){
        System.out.println(Arrays.toString(v));
    }
    static void multiple(int a,int b,String ...v){

    }
}

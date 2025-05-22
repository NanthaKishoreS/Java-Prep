package Functions;

public class Overloading {
    public static void main(String[] args) {
        func(23);
        func("Hello World");
    }
    static void func(int a){
        System.out.println(a);
    }
    static void func(String n){
        System.out.println(n);
    }
}
  
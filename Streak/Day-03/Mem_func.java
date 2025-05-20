public class Laptop {
    String name = "";
    String processor = "";
    int ram = 0;
    int price = 0;

    public void display(Laptop l1){
        System.out.println(l1.name);
        System.out.println(l1.processor);
        System.out.println(l1.ram);
        System.out.println(l1.price);

    }
    public static void main(String[]args){
        Laptop lap1 = new Laptop();
        lap1.name = "Lenovo";
        lap1.processor="i1-6608U";
        lap1.ram=4;
        lap1.price=23000;
        lap1.display(lap1);
    }
    
}

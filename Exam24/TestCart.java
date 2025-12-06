package Exam24;
public class TestCart {
    public static void main(String[] args) {
        Product banana = new Product("Banana", 3.12);
        Product apple = new Product("Apple", 4.0);
        Product pendrive = new Product("Pendrive", 13.2);

        ProductBundle bundle = new ProductBundle();
        bundle.addItem(banana);
        bundle.addItem(apple);
        bundle.addItem(pendrive);

        System.out.println("getName Banana: "+banana.getName());
        System.out.println("getPrice Banana: "+banana.getPrice());
        System.out.println("getPrice Boundle: "+bundle.getPrice());
        System.out.println("---");
        System.out.println("toString banana: "+banana.toString());
        System.out.println("toString Boundle: "+bundle.toString());
        }

}


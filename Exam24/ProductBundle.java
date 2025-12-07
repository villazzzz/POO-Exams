package Exam24;
public class ProductBundle implements CartItem {
    private CartItem[] items;
    private int count;

    public ProductBundle(){
        this.items=new CartItem[40];
        this.count=0;
    }
    @Override
    public double getPrice(){
        double total=0;
        for(int i=0; i<this.count; i++){
            total+=this.items[i].getPrice();
        }
        return total;
    }
    @Override
    public String toString(){
        String result="(";
        for(int i=0; i<this.count-1; i++){
            this.items[i].toString();
            result+=this.items[i].toString()+";"+this.items[i].getPrice()+", ";
        }
        result+=this.items[count-1].toString()+";"+this.items[count-1].getPrice();

        result+=");";
        result+=getPrice();
        return result;
    }

    public void addItem(CartItem item){
        this.items[this.count]=item;
        this.count++;
    }
}

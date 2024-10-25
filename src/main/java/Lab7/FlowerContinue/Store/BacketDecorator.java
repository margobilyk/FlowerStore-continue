package Lab7.FlowerContinue.Store;

public class BacketDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice() {
        return 4 + item.price();
    }
    
}

package Lab7.FlowerContinue.Store;

public class RibbonDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice(){
        return 40 + item.price();
    }
}

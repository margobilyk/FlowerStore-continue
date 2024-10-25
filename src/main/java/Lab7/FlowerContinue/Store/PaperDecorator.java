package Lab7.FlowerContinue.Store;

public class PaperDecorator extends ItemDecorator {
    private Item item;

    @Override
    public String getDescription() {
        return item.getDescription();
    }

    public double getPrice(){
        return 13 + item.price();
    }
}

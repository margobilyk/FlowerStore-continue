package Lab7.FlowerContinue.Store;

import lombok.Getter;

public class RomashkaFlower extends Item {
    @Getter
    private double sepalLength;
    @Getter
    private FlowerColor color;
    @Getter
    private double price;

    public RomashkaFlower(double sepLength, FlowerColor flowerColor, double price) {
        this.sepalLength = sepLength;
        this.color = flowerColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Romashka{"
                + "sepalLength=" + getSepalLength()
                + ", color=" + getColor()
                + ", price=" + getPrice()
                + '}';
    }

    @Override
    public double price(){
        return getPrice();
    }
}

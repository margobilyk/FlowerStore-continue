package Lab7.FlowerContinue.Store;

import lombok.Getter;
import lombok.Setter;

@Getter@Setter
public class Flower extends Item {
    @Getter
    private double sepalLength;
    private FlowerColor color;
    @Getter
    private double price;
    @Getter
    private FlowerType flowerType;

    public Flower(double sepalLength, FlowerColor color, double price) {
        // this.flowerType = flowerType;
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
    }

    public String getColor() {
        return color.toString();
    }

    @Override
    public String toString() {
        return "Flower{"
                + "sepalLength=" + sepalLength
                + ", color=" + color
                + ", price=" + price
                + '}';
    }

    @Override
    public double price() {
        return getPrice();
    }

    // public double getPrice() {
    //     return price;
    // }

    // public FlowerType getFlowerType() {
    //     return flowerType;
    // }

}


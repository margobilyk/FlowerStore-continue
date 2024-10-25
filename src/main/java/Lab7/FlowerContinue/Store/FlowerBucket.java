package Lab7.FlowerContinue.Store;

import java.util.ArrayList;
import java.util.List;

public class FlowerBucket {
    private List<FlowerPack> flowerPacks;

    public FlowerBucket() {
        this.flowerPacks = new ArrayList<>();
    }

    public void add(FlowerPack flowerPack) {
        flowerPacks.add(flowerPack);
    }

    public double getPrice() {
        double totalPrice = 0;
        for (FlowerPack pack : flowerPacks) {
            totalPrice += pack.getPrice();
        }
        return totalPrice;
    }

    public List<FlowerType> getFlowerTypes() {
        List<FlowerType> types = new ArrayList<>();
        for (FlowerPack pack : flowerPacks) {
            FlowerType type = pack.getFlower().getFlowerType();
            if (!types.contains(type)) {
                types.add(type);
            }
        }
        return types;
    }
}

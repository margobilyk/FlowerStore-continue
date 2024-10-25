package Lab7.FlowerContinue.Store;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String  description;
    public abstract double price();
}

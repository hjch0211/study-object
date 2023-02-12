package item;
import item.Item;

public class IceCream extends Item {
    @Override
    private String type = "icecream";

    public IceCream(String name, Number price) {
        this.name = name;
        this.price = price;
    }
}

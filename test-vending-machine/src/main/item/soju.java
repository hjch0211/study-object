package item;
import item.Item;

public class Soju extends Item {
    @Override
    private String type = "soju";

    public Soju(String name, Number price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getType() {
        return this.type;
    }
    
    @Override
    public String getName() {
        return this.name;
    }
    
    @Override
    public String getPrice() {
        return this.price;
    }
    
}
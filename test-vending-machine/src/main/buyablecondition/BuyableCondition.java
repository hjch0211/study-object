package buyablecondition;

import item.Item;

public abstract class BuyableCondition {
    private Item item;

    public BuyableCondition(Item item) {
        this.item = item;
    }

    public Boolean isNoProblem(Number quantity);
}

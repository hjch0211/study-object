package menu;

import item.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private Item[] items;

    public Menu() {}

    // public void showItem(String toBuy) {
    //     for (Item item : items) if(item.getName() == toBuy) {
    //         System.out.println("name : " + this.name);
    //         System.out.println("type : " + this.type);
    //         System.out.println("price : " + this.price);
    //         System.out.println("stock : " + this.stock);
    //     }
    // }

    // [Todo] 디버깅해야 됨
    public void registerItem(Item item) {
        List<Item> list = new ArrayList<>(Arrays.asList(this.items));
        list.add(item);
        
        return list.toArray(new Item[0]);
    }

    public void buyItem(String toBuy, String howToPay) {
        cardBalance.payFor(toBuy);
    }
}

package menu;

import item.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Menu {
    private Item[] items;

    public Menu() {}

    public void showItem(String toBuy) {
        // toBuy가 있으면 ㄱ


        // 없으면 print error
    }

    // [Todo] 디버깅해야 됨
    public void registerItem(Item item) {
        List<Item> list = new ArrayList<>(Arrays.asList(this.items));
        list.add(item);
        
        return list.toArray(new Item[0]);
    }
}

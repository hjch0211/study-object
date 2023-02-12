import customer.Customer;
import menu.Menu;
import item.*;

public class App {
    public static void main(String[] args) throws Exception {
        Menu menu = new Menu();
        menu.registerItem(new IceScream('구구콘', 1200, 1));
        menu.registerItem(new Snack('꼬칼콘', 1500, 1));
        menu.registerItem(new Soju('참이슬', 1800, 1));

        String toBuy = "ice cream";
        Customer customer = new Customer(new Menu); // [Todo] 팩토리로 빼기
        customer.buyItem(toBuy);
    }
}

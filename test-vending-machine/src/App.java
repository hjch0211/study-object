import customer.Customer;

public class App {
    public static void main(String[] args) throws Exception {
        String toBuy = "ice cream";
        Customer customer = new Customer(); // [Todo] 팩토리로 빼기
        customer.buyItem(toBuy);
    }
}

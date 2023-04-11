import coffee.order.CoffeeOrderBoard;
import coffee.order.Order;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        board.add(new Order("John"));
        board.add(new Order("Alice"));
        board.add(new Order("Bob"));

        board.draw();

        board.deliver();

        board.deliver(2);

        board.draw();
    }
}

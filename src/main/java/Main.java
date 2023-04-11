package org.example;

public class Main {
    public static void main(String[] args) {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        // Add some orders
        board.add(new Order("John"));
        board.add(new Order("Alice"));
        board.add(new Order("Bob"));

        // Display the current order queue
        board.draw();

        // Deliver the first order
        board.deliver();

        // Deliver an order with a specific ID
        board.deliver(2);

        // Display the current order queue again
        board.draw();
    }
}

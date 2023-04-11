package coffee.order;

import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order> orderList;

    public CoffeeOrderBoard() {
        orderList = new ArrayList<>();
    }

    public void add(Order order) {
        int orderId = orderList.size() + 1;
        order.setOrderId(orderId);
        orderList.add(order);
    }

    public void deliver() {
        if (orderList.isEmpty()) {
            System.out.println("No orders to deliver.");
        } else {
            Order order = orderList.get(0);
            orderList.remove(0);
            System.out.println("Delivering order: " + order.toString());
        }
    }

    public void deliver(int orderId) {
        Order order = null;
        for (Order o : orderList) {
            if (o.getOrderId() == orderId) {
                order = o;
                break;
            }
        }
        if (order == null) {
            System.out.println("Order not found.");
        } else {
            orderList.remove(order);
            System.out.println("Delivering order: " + order.toString());
        }
    }

    public void draw() {
        if (orderList.isEmpty()) {
            System.out.println("No orders to display.");
        } else {
            System.out.println("Current order queue:");
            for (Order order : orderList) {
                System.out.println(order.toString());
            }
        }
    }
}

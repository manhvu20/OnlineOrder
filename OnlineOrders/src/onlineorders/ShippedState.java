package onlineorders;

public class ShippedState implements OrderState {
    @Override
    public void handleOrder(Order order, String action) {
        if ("Received".equalsIgnoreCase(action)) {
            System.out.println("Order has been delivered.");
            order.setState(new DeliveredState());
        } else {
            System.out.println("Order is shipped. Waiting for delivery confirmation...");
        }
    }

    @Override
    public String getStateName() {
        return "Shipped";
    }
}


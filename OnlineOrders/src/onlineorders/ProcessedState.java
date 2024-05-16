package onlineorders;

public class ProcessedState implements OrderState {
    @Override
    public void handleOrder(Order order, String action) {
        if ("yes".equalsIgnoreCase(action)) {
            System.out.println("Order is cancelled.");
            order.setState(new CancelledState());
        } else {
            System.out.println("Order has been processed. Shipping order now...");
            order.setState(new ShippedState());
        }
    }

    @Override
    public String getStateName() {
        return "Processed";
    }
}


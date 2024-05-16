package onlineorders;

public class PendingState implements OrderState {
    @Override
    public void handleOrder(Order order, String action) {
        if ("yes".equalsIgnoreCase(action)) {
            System.out.println("Order is cancelled.");
            order.setState(new CancelledState());
        } else {
            System.out.println("Order is pending. Processing order now...");
            order.setState(new ProcessedState());
        }
    }

    @Override
    public String getStateName() {
        return "Pending";
    }
}



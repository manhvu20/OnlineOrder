package onlineorders;

public class CancelledState implements OrderState {
    @Override
    public void handleOrder(Order order, String action) {
        System.out.println("Order is cancelled. No further actions can be taken.");
    }

    @Override
    public String getStateName() {
        return "Cancelled";
    }
}




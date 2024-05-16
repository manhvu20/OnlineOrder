package onlineorders;

public class DeliveredState implements OrderState {
    @Override
    public void handleOrder(Order order, String action) {
        System.out.println("Order has been delivered. Thanks for ordering");
    }

    @Override
    public String getStateName() {
        return "Delivered";
    }
}


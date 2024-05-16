package onlineorders;

public interface OrderState {
    void handleOrder(Order order, String action);
    String getStateName();
}


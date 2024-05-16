package onlineorders;

public class Order {
     private OrderState state;

    public Order() {
        state = new PendingState();
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public void processOrder(String action) {
        state.handleOrder(this, action);
    }

    public void printState() {
        System.out.println("Current order state: " + state.getStateName());
    }
}


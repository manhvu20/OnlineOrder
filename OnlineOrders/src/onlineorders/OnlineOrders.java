package onlineorders;

import java.util.Scanner;

public class OnlineOrders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to place an order? (yes/no): ");
        String response = scanner.nextLine();
        if ("yes".equalsIgnoreCase(response)) {
            Order order = new Order();
            order.printState();

            System.out.print("Do you want to cancel the order? (yes/no): ");
            response = scanner.nextLine();
            order.processOrder(response);
            order.printState();
            
            if (!"yes".equalsIgnoreCase(response)){
                System.out.print("Do you want to cancel the order? (yes/no): ");
                response = scanner.nextLine();
                order.processOrder(response);
                order.printState();
                
                if (!"yes".equalsIgnoreCase(response)){
                    System.out.print("Please enter (Received) if you have received the order: ");
                    response = scanner.nextLine();
                    while (!"Received".equalsIgnoreCase(response)){
                        order.processOrder(response);
                        System.out.print("Please enter (Received) if you have received the order: ");
                        response = scanner.nextLine();
                    }
                    order.processOrder(response);
                    order.printState();
                }
            } 
        } else {
            System.out.println("No order placed.");
        }
        scanner.close();
    }
}




package kg.megacom;

import kg.megacom.enums.Unit;
import kg.megacom.models.Order;
import kg.megacom.models.Product;
import kg.megacom.services.OrderService;

import java.util.List;

public class Main {


    public static void main(String[] args) {

        OrderService orderService = OrderService.INSTANCE;

        orderService.orderProduct("Молоко", 3, Unit.LTR);
        orderService.orderProduct("Сыр", 200, Unit.GRM);


        for (Order order: orderService.findOrders()) {
            System.out.println(order.getStartDate());
            System.out.println(order.getStatus());

            System.out.println("Список продуктов:");
            for (Product product:order.getProducts()) {
                System.out.println(product.getName() + " - " + product.getAmount() + " " + product.getUnit());
            }
        }
    }
}

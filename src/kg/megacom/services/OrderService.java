package kg.megacom.services;

import kg.megacom.enums.Unit;
import kg.megacom.models.Order;
import kg.megacom.services.impl.OrderServiceImpl;

import java.util.List;

public interface OrderService {

    OrderService INSTANCE = new OrderServiceImpl();

    void orderProduct(String productName, double amount, Unit unit);

    List<Order> findOrders();
}

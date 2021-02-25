package kg.megacom.services.impl;

import kg.megacom.enums.OrderStatus;
import kg.megacom.enums.Unit;
import kg.megacom.models.Order;
import kg.megacom.models.Product;
import kg.megacom.services.OrderService;

import java.util.ArrayList;
import java.util.List;

public class OrderServiceImpl implements OrderService {

    private ArrayList<Order> orders = new ArrayList<>();

    private Order findOpenOrder(){
        for (Order item:orders) {
            if (item.getStatus().equals(OrderStatus.OPEN)){
                return item;
            }
        }

        Order order = new Order();
        orders.add(order);
        return order;
    }


    @Override
    public void orderProduct(String productName, double amount, Unit unit) {
        Order order = findOpenOrder();
        Product product = new Product(productName, amount, unit);
        order.addProduct(product);
    }

    @Override
    public List<Order> findOrders() {
        return orders;
    }
}

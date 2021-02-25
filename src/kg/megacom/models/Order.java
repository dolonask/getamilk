package kg.megacom.models;

import kg.megacom.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;

public class Order {

    private double id;
    private Date startDate;
    private OrderStatus status;
    private ArrayList<Product> products;


    public Order() {
        id = Math.random();
        startDate = new Date();
        status = OrderStatus.OPEN;
        this.products = new ArrayList<>();
    }


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


    public void addProduct(Product product){
        products.add(product);
    }
}

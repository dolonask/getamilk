package kg.megacom.models;

import kg.megacom.enums.Unit;

public class Product {

    private double id;
    private String name;
    private double amount;
    private Unit unit;
    private String comment;

    public Product(String name, double amount, Unit unit, String comment) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
        this.comment = comment;
    }

    public Product(String name, double amount, Unit unit) {
        this.name = name;
        this.amount = amount;
        this.unit = unit;
    }


    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

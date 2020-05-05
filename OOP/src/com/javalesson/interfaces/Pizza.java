package com.javalesson.interfaces;

public class Pizza implements Pricable {
    private String name;
    private Size size;
    private int quantity;
    private int price;

    public Pizza(String name, Size size, int quantity, int price) {
        this.name = name;
        this.size = size;
        this.quantity = quantity;
        this.price = price;
    }

    @Override
    public int calcDeliveryPrice() {
        if (size == Size.XL || quantity > 1) {
            return 0;
        } else {
            return 7;
        }
    }

    public String getName() {
        return name;
    }

    public Size getSize() {
        return size;
    }

    public int getQuantity() {
        return quantity;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public int calcOrderPrice() {
        Pricable.doSmth();
        return quantity * price;
    }
}

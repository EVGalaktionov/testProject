package com.javalesson.interfaces;

public class InterfaceRunner {
    public static void main(String[] args) {
        Pricable pizza = new Pizza("Neapoletana", Size.L, 1, 20);
        Pricable phone = new CellPhone("Motorola", "XT1575", 1, 250);
        Pricable fridge = new Fridge("LG", "E9090", 1, 300);

        printDeliveryPrice(pizza);
        printDeliveryPrice(phone);
        printDeliveryPrice(fridge);
    }

    private static void printDeliveryPrice(Pricable pricable){
        System.out.println("Delivery price: " + pricable.calcDeliveryPrice());
        System.out.println("Order price: " + pricable.calcOrderPrice());
    }
}

package com.javalesson.interfaces;

public interface Pricable extends Deliveriable, Orderable {
    default int calcPrice(){
        return calcOrderPrice() + calcDeliveryPrice();
    }

    static void doSmth(){}
}

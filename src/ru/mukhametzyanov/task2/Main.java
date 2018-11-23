package ru.mukhametzyanov.task2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        BasketImpl basketImpl = new BasketImpl();
        basketImpl.addProduct("Telephone", 3);
        basketImpl.addProduct("I Pad", 341);
        basketImpl.addProduct("I Phone", 3234);
        basketImpl.printBasket();
        basketImpl.clear();
        basketImpl.printBasket();

//        basketImpl.printBasket();
//
//        basketImpl.updateProductQuantity("Telephone", 5);
//
//        basketImpl.printBasket();
//        basketImpl.removeProduct("Telephone");
//        basketImpl.printBasket();
    }
}

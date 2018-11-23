package ru.mukhametzyanov.task2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class BasketImpl implements Basket {

    private Map<String, Integer> products;

    public BasketImpl() {
        initMap();
    }

    @Override
    public void addProduct(String name, Integer quantity) {
        products.put(name, quantity);
    }

    @Override
    public void removeProduct(String name) {
        products.remove(name);
    }

    @Override
    public void updateProductQuantity(String product, Integer quantity) {
        products.replace(product, quantity);
    }

    @Override
    public void clear() {
        products.clear();
//        for (Iterator<Map.Entry<String, Integer>> iterator = products.entrySet().iterator(); iterator.hasNext(); ) {
//            Map.Entry<String, Integer> entry = iterator.next();
//            iterator.remove();
//            System.out.println("Element " + entry.getKey() + " is delete ");
//        }
//        System.out.println("Basket is empty");
    }

    @Override
    public void printBasket() {
        if (products.isEmpty()) {
            System.out.println("Basket is Empty");
        } else {
            for (Map.Entry<String, Integer> map : products.entrySet()) {
                System.out.println(map.getKey() + " " + map.getValue());
            }
            System.out.println("Print end!");
        }
    }

    private void initMap() {
        products = new HashMap<>();
    }
}

package ru.mukhametzyanov.task2;

public interface Basket {
    /**
     * Метод добавляет продукт в корзину
     *
     * @param name
     * @param quantity
     */
    void addProduct(String name, Integer quantity);

    /**
     * Метод удаляет продукт из корзины
     *
     * @param name по данному ключу идет удаление из корзины
     */
    void removeProduct(String name);

    /**
     * Метод увеличивает кол-во продуктов
     *
     * @param name
     * @param quantity
     */
    void updateProductQuantity(String name, Integer quantity);

    /**
     * Метод очищает корзину
     */
    void clear();

    /**
     * Метод распечатывает содержимое корзины
     */
    void printBasket();
}

package org.example.hw;
/*
Домашнее задание на закрепление:

1)Создать класс Товар, имеющий переменные имя, цена, рейтинг.
2)Создать класс Категория, имеющий переменные имя и массив товаров.
  Создать несколько объектов класса Категория.
3)Создать класс Basket, содержащий массив купленных товаров.
4)Создать класс User, содержащий логин, пароль и объект класса Basket.
  Создать несколько объектов класса User.
5)Вывести на консоль каталог продуктов. (все продукты магазина)
6)Вывести на консоль покупки посетителей магазина.
  (После покупки у пользователя добавляется товар, а из магазина - удаляется)

Всё вышеуказанное создать согласно принципам ООП, пройденным на семинаре

Формат сдачи:
Ссылка на гитхаб проект
Подписать фамилию и номер группы
*/

import org.example.sem1.Cat;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Создать класс Товар, имеющий переменные имя, цена, рейтинг.
        Product product1 = new Product("Тетрадь", 50.00, 1);
        Product product2 = new Product("Книга", 560.50, 2);
        Product product3 = new Product("Ручка", 10.00, 1);
        System.out.println(product1 + "\n" + product2 + "\n" + product3);

        // Создать класс Категория, имеющий переменные имя и массив товаров.
        Category category1 = new Category();
        category1.setName("Канцтовары");
        category1.setProducts(new String[] {product1.getName(),
                product2.getName(), product3.getName()});
        System.out.println();

        Category category2 = new Category();
        category2.setName("Бытовая техника");
        Category category3 = new Category();
        category3.setName("Одежда");

        System.out.println(category1.toString());
        System.out.println(category2.toString());
        System.out.println(category3.toString());

        // Создать класс Basket, содержащий массив купленных товаров.
        Basket basket1 = new Basket();
        Basket basket2 = new Basket();

        // Создать класс User, содержащий логин, пароль и объект класса Basket.
        User user1 = new User("Sasha", "12345", basket1);
        User user2 = new User("Masha", "67890", basket2);

        basket1.setProducts(new String[] {product1.getName(), product3.getName()});
        product1.setRating(product1.getRating() - 1);
        product3.setRating(product3.getRating() - 1);
        basket2.setProducts(new String[] {product2.getName()});
        product2.setRating(product2.getRating() - 1);
        System.out.println();

        System.out.println(product1 + "\n" + product2 + "\n" + product3);
        System.out.println();

        System.out.println(user1.getLogin() + "//" + user1.getBasket());
        System.out.println(user2.getLogin() + "//" + user2.getBasket());


    }

}

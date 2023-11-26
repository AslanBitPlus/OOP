package org.example.sem5;

public class Outer {
    class Inner{
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod(){
            System.out.println(innerValue);
            // innerMethod(); todo: закомментирован т.к. рекурсия
            System.out.println(outerValue);
            outerMethod();
            System.out.println("Hello!");
            // внутренний класс имеет доступ ко всем полям и методам внешнего класса
            //
            // Если class Inner объявить как static class, то к нему можно обратиться с любого места
            // и он потеряет доступ к внешним полям и методам
            //получается внутри одного класса создали другой класс, но они по логике не звязаны и
            // они равноправны. просто программист создал класс внутри другого класса
            // Такое создание классов только запутывает и часто на собеседованиях об этом
            // спрашивают. Так делать нельзя
            // К такой методике можно прибегнуть при разрастании дерева классов...
            //

        }
    }

    int outerValue;

    public void outerMethod(){
        System.out.println(outerValue);
        // outerMethod(); todo: закомментирован т.к. рекурсия
        // CTRL + Shift + F -- выделяем todo: и нажимаем ctrl+shift+f ...
        // System.out.println(innerValue);
        // innnerMethod();
        // внешний класс не имеет доступа к полям и методам внутренего класса
        // System.out.println(innerValue); ...... innnerMethod(); поэтому закомментированны
        System.out.println("outer Hello!");
    }

    public static void main(String[] args) {
        // Inner inner = new Inner(10); // нельзя создать внутренний класс без внешнего
        //
        // В случае создания внутреннего класса как static class, то не льзя создать
        // внутренний класс с созданием внешнего. Его можно создать сразу.
        Inner inner1 = new Outer().new Inner(10); // создали внутренний класс создав внешний

        // локальный класс (внутри метода)
        // используется для преобразования данных (JSON) и т.д.
        class Point{
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }
        Point p = new Point(2,4);
        System.out.println(p);

        Flyable flyable = new Flyable() {
            @Override
            public void fly() {
                System.out.println("Лечу!");
            }
        };
        // пишем new Flyable()
        // org.example.sem5.Outer$1 добавляется под капотом implements Flyable
        // происходит override методов (его видим)
        // создается объект Outer Flyable = new Outer();
        // поэтому при выводе org.example.sem5.Outer$1. Но первый, далее будет второй и т.д.
        System.out.println(flyable.getClass().getName());
    }
}

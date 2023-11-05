package org.example.sem2.hw;

public class Human extends Living{

    public Human(String name, int maxRunDistance, int maxJumpDistance) {
        super(name, maxRunDistance, maxJumpDistance);
    }

    @Override
    protected void run(int rundistance) {
        super.run(rundistance);
    }

    @Override
    protected void jump(int jumpdistance) {
        super.jump(jumpdistance);
    }

    @Override
    public String toString() {
        return "Команда{" +
                "Человек Имя: '" + name + '\'' +
                ", Бегать может: " + maxRunDistance +
                ", Прыгать может: " + maxJumpDistance +
                '}';
    }
}

package org.example.sem2.hw;

public abstract class Player {
    public static int count;
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpDistance;

    public Player(String name, int maxRunDistance, int maxJumpDistance) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpDistance = maxJumpDistance;
        count ++;
    }

    protected void run(int rundistance) {
        if (rundistance < maxRunDistance) {
            System.out.println(name + " пробежал " + rundistance + " метров");
        } else {
            System.out.println(name + " НЕ пробежал " + rundistance + " метров");
        }
    };
    protected void jump(int jumpdistance) {
        if (jumpdistance < maxJumpDistance) {
            System.out.println(name + " прыгнул " + jumpdistance + " метров");
        } else {
            System.out.println(name + " НЕ прыгнул " + jumpdistance + " метров");
        }

    };

    @Override
    public String toString() {
        return "Команда{" +
                "Имя: '" + name + '\'' +
                ", Бег макс.: " + maxRunDistance +
                ", Прыжок макс.: " + maxJumpDistance +
                '}';
    }

}

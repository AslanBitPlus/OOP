package org.example.sem2.hw;

public class Robot extends Player{
    public Robot(String name, int maxRunDistance, int maxJumpDistance) {
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
}

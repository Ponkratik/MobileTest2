package animal;

import animal.movement.Flyable;

public class Hummingbird extends BaseAnimal implements Flyable {
    public Hummingbird() {
        super("hummingbird");
    }

    @Override
    public void move() {
        fly();
        currentState = State.MOVING;
    }

    @Override
    public void fly() {
        System.out.println("I'm " + animalType + " and I'm flying");
    }
}

package animal;

import animal.movement.Flyable;
import animal.movement.Walkable;

public class Peacock extends BaseAnimal implements Walkable, Flyable {
    public Peacock() {
        super("peacock");
    }

    @Override
    public void move() {
        fly();
        walk();
        currentState = State.MOVING;
    }

    @Override
    public void fly() {
        System.out.println("I'm " + animalType + " and I'm flying");
    }

    @Override
    public void walk() {
        System.out.println("I'm " + animalType + " and I'm walking");
    }
}

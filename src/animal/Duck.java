package animal;

import animal.movement.Flyable;
import animal.movement.Swimmable;

public class Duck extends BaseAnimal implements Flyable, Swimmable {
    public Duck() {
        super("duck");
    }

    @Override
    public void move() {
        fly();
        swim();
        currentState = State.MOVING;
    }

    @Override
    public void fly() {
        System.out.println("I'm " + animalType + " and I'm flying");
    }

    @Override
    public void swim() {
        System.out.println("I'm duck and I'm swimming");
    }
}

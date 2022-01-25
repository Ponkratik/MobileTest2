package animal;

import animal.movement.Swimmable;
import animal.movement.Walkable;

public class Beaver extends BaseAnimal implements Walkable, Swimmable {
    public Beaver() {
        super("beaver");
    }

    @Override
    public void move() {
        swim();
        walk();
        currentState = State.MOVING;
    }

    @Override
    public void swim() {
        System.out.println("I'm " + animalType + " and I'm swimming");
    }

    @Override
    public void walk() {
        System.out.println("I'm " + animalType + " and I'm walking");
    }
}

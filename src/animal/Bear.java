package animal;

import animal.movement.Walkable;

public class Bear extends BaseAnimal implements Walkable {
    public Bear() {
        super("bear");
    }

    @Override
    public void move() {
        walk();
        currentState = State.MOVING;
    }

    @Override
    public void walk() {
        System.out.println("I'm " + animalType + " and I'm walking");
    }
}

package animal;

import animal.movement.Walkable;

public class Wolf extends BaseAnimal implements Walkable {
    public Wolf() {
        super("wolf");
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

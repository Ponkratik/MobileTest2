package animal;

public abstract class BaseAnimal {
    protected State currentState;
    protected String animalType;

    public BaseAnimal(String animalType) {
        this.animalType = animalType;
        sleep();
    }

    public String getCurrentState() {
        return "My current state is " + currentState.toString().toLowerCase();
    }

    public abstract void move();

    public void eat() {
        currentState = State.EATING;
        System.out.println("I'm " + animalType + " and I'm eating");
    }

    public void sleep() {
        currentState = State.SLEEPING;
        System.out.println("I'm " + animalType + " and I'm sleeping");
    }

    public void hunting() {
        currentState = State.HUNTING;
        System.out.println("I'm " + animalType + " and I'm hunting");
    }

    public void kill() {
        currentState = State.DEAD;
        System.out.println("I'm " + animalType + " and I'm dead");
    }
}

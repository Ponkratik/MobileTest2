import animal.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<BaseAnimal> animals = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            animals.add(new Bear());
        }

        for (int i = 0; i < 4; i++) {
            animals.add(new Duck());
        }

        for (int i = 0; i < 7; i++) {
            animals.add(new Hummingbird());
        }

        for (int i = 0; i < 5; i++) {
            animals.add(new Wolf());
        }

        for (int i = 0; i < 1; i++) {
            animals.add(new Peacock());
        }

        for (int i = 0; i < 2; i++) {
            animals.add(new Beaver());
        }

        System.out.println("\n");

        animals.get(10).kill();
        System.out.println(animals.get(10).getCurrentState());
    }
}

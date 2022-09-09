package circus;

import circus.animal.*;
import circus.stuff.Cannon;
import circus.stuff.Equipment;
import circus.stuff.Ladder;

import java.util.ArrayList;
import java.util.Arrays;

public class Circus {
    private static Animal[] animals = {
            new Duck("Drake"),
            new Parrot("Polly"),
            new Tiger("Tai Lung")
    };
    private static Equipment[] equipments = {
            new Ladder(50),
            new Cannon(5),
            new Cannon(100)
    };

    private static void makeAnimalsTalk() {
        for (Animal a : animals) {
            System.out.println(a);
            System.out.println(a.speak());
        }
    }

    private static int calculateAssetValue(Asset[] assets) {
        int total = 0;
        for (Asset a : assets) {
            if (a.getValue() <= 5) {
                System.out.println("Ignoring low value item: " + a.getValue());
                continue;
            }
            total += a.getValue();
            System.out.println("Adding item value: " + a.getValue());
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println("number of animals in in the circus: " + animals.length);

        //makeAnimalsTalk();
        //System.out.println("Total value of animals " + calculateAssetValue(animals));
        //System.out.println("Total value of equipments " + calculateAssetValue(equipments));

        ArrayList<Animal> animalArrayList = new ArrayList<>(Arrays.asList(animals));
        printAllAnimals(animalArrayList);
        animalArrayList.add(new Duck("Goose"));
        animalArrayList.add(new Parrot("Delly"));
        animalArrayList.add(new Tiger("Simba"));
        Animal Lourie = new Elephant("Lourie");
        animalArrayList.add(Lourie);
        System.out.println("number of animals in circus: " + animalArrayList.size());
        printAllAnimals(animalArrayList);
        System.out.println("index of Lourie is: " + animalArrayList.indexOf(Lourie));
        System.out.println("After sorting");
        animalArrayList.sort(Animal.AnimalNameComparator);
        printAllAnimals(animalArrayList);
        System.out.println("index of Lourie after sorting is: " + animalArrayList.indexOf(Lourie));

    }

    private static void printAllAnimals(ArrayList<Animal> animalArrayList) {
        for (Animal animal: animalArrayList) {
            System.out.println(animal);
        }
    }
}

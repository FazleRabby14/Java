
package animal;
import java.util.Scanner;

public class main {
    
public static void main(String[] args) {
        Animal[] animals = new Animal[5];
        animals[0] = new Duck("Duck1", "Yellow", 10.0, 2, "Male", false);
        animals[1] = new Fish("Fish1", 0.5, 5.0, 1, "Female", false);
        animals[2] = new Duck("Duck2", "White", 15.0, 3, "Female", false);
        animals[3] = new Fish("Fish2", 0.3, 3.0, 2, "Male", false);
        animals[4] = new Duck("Duck3", "Brown", 12.0, 1, "Male", false);

        double totalAnimalPrice = 0.0;
        int duckCount = 0;
        int fishCount = 0;

        for (Animal animal : animals) {
            totalAnimalPrice += getAnimalPrice(animal);

            if (animal instanceof Duck) {
                duckCount++;
            } else if (animal instanceof Fish) {
                fishCount++;
            }
        }

        System.out.println("Total price of animals: $" + totalAnimalPrice);
        System.out.println("Number of ducks: " + duckCount);
        System.out.println("Number of fish: " + fishCount);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the new price for ducks: $");
        double duckPrice = scanner.nextDouble();

        System.out.print("Enter the new price for fish: $");
        double fishPrice = scanner.nextDouble();

        double costChange = updateAnimalPrices(animals, duckPrice, fishPrice);

        System.out.println("Cost change: $" + costChange);

        scanner.close();
    }

    public static double getAnimalPrice(Animal animal) {
        if (animal instanceof Duck) {
            return ((Duck) animal).getPrice();
        } else if (animal instanceof Fish) {
            return ((Fish) animal).getPrice();
        }

        return 0.0;
    }

    public static double updateAnimalPrices(Animal[] animals, double duckPrice, double fishPrice) {
        double totalCostChange = 0.0;

        for (Animal animal : animals) {
            if (animal.getClass()==Duck.class) {
                Duck duck = (Duck) animal;
                totalCostChange += duckPrice - duck.getPrice();
                duck.setPrice(duckPrice);
            } else if (animal instanceof Fish) {
                Fish fish = (Fish) animal;
                totalCostChange += fishPrice - fish.getPrice();
                fish.setPrice(fishPrice);
            }
        }

        return totalCostChange;
    }
} 

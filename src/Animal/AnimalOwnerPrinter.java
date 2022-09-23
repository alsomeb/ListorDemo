package Animal;

public class AnimalOwnerPrinter <T extends Animal> {
    T thingToPrint;

    public AnimalOwnerPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printOwner() {
        if(thingToPrint.getAnimalOwner() == null) {
            System.out.println(thingToPrint.getName() + " has no owner currently");
        } else {
            System.out.println(thingToPrint.getName() + " has owner " + thingToPrint.animalOwner.getName());
        }
    }
}

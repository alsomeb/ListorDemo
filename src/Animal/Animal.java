package Animal;

public class Animal {
    protected String name;
    protected int age;
    protected AnimalOwner animalOwner;

    // Default no args Constructor
    public Animal() {
    }

    // Full Constructor
    public Animal(String name, int age, AnimalOwner animalOwner) {
        this.name = name;
        this.age = age;
        this.animalOwner = animalOwner;
    }

    // Getters & Setters & toString

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AnimalOwner getAnimalOwner() {
        return animalOwner;
    }

    public void setAnimalOwner(AnimalOwner animalOwner) {
        this.animalOwner = animalOwner;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", animalOwner=" + animalOwner +
                '}';
    }
}

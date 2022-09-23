package Animal;

public class Dog extends Animal{
    private String foodPreference;

    public Dog() {
    }

    public Dog(String name, int age, AnimalOwner animalOwner, String foodPreference) {
        super(name, age, animalOwner);
        this.foodPreference = foodPreference;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public String getDogInfo() {
        return "Name: " + getName() +
                "\nAge: " + getAge() +
                "\nOwner: " + animalOwner.getName() +
                "\nFood preference: " + getFoodPreference() + "\n";
    }

    @Override
    public String toString() {
        return "Dog{" +
                "foodPreference='" + foodPreference + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", animalOwner=" + animalOwner +
                '}';
    }
}

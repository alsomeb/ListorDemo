package Animal;

public class Cat extends Animal {
    private String foodPreference;


    public Cat() {
    }

    public Cat(String name, int age, AnimalOwner animalOwner, String foodPreference) {
        super(name, age, animalOwner);
        this.foodPreference = foodPreference;
    }

    public String getFoodPreference() {
        return foodPreference;
    }

    public void setFoodPreference(String foodPreference) {
        this.foodPreference = foodPreference;
    }

    public void catSold(){
        animalOwner = null;
    }

    public void newOwner(AnimalOwner newOwner){
        animalOwner = newOwner;
    }


    public void getCatInfo() {
        System.out.println("Name: " + getName() +
                "\nAge: " + getAge() +
                "\nOwner: " + animalOwner.getName() +
                "\nFood preference: " + getFoodPreference() + "\n");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "foodPreference='" + foodPreference + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", animalOwner=" + animalOwner +
                '}';
    }
}

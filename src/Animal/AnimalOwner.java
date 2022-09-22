package Animal;

public class AnimalOwner {
    String name;

    public AnimalOwner(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Owners name: " + name;
    }
}

package Animal;

public class AnimalOwner {
    private String name;

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
        return "AnimalOwner{" +
                "name='" + name + '\'' +
                '}';
    }
}

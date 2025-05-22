public class Cat extends Animal {
    public Cat(String name, int age, String typr, int position) {
        super(name, age, typr, position);
    }

    @Override
    public String animalSound() {
        return "Meow";
    }

    @Override
    public void move() {
        position += 5;
    }
}

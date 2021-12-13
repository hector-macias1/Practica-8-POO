public class Lion extends Animal {

    public Lion(String name, int age) {
        super(name, age);
    }

    public Lion() {
    }

    public void Roar() {
        System.out.println(getName() + " esta rugiendo");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " esta comiendo carne");
    }
}
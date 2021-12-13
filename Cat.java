public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    public Cat() {
    }

    public void Meow() {
        System.out.println(getName() + " esta maullando");
    }

    @Override
    public void eat() {
        System.out.println(getName() + " esta comiendo whiskas");
    }
}
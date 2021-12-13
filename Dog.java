public class Dog extends Animal {
    
    public Dog(String name, int age) {
        super(name, age);
    }

    public Dog() {
    }

    public void Barf() {
        System.out.println(getName() + " esta ladrando");
    }

    @Override

    public void eat() {
        System.out.println(getName() + " esta comiendo Pedegree");
    }

}
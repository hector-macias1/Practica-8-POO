public class Giraffe extends Animal {

    public Giraffe(String name, int edad) {
        super(name, edad);
    }

    public Giraffe() {
    }

    @Override
    public void eat() {
        System.out.println(getName() + " esta comiendo y regurgitando");
    }

}
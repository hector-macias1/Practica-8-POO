
public class Animal{
    private String name;
    private int age;
    private boolean vaccinated;

    public Animal(String name, int age){
        this.name = name;
        this.age = age;
    }

    public Animal(){
    }

    public void eat() {
        System.out.println(name + " esta comiendo");
    }

    public void sleep() {
        System.out.println(name + " esta durmiendo");
    }

    public boolean getVaccinated() {
        return vaccinated;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setVaccinated(boolean vaccinated) {
        this.vaccinated = vaccinated;
    }

}

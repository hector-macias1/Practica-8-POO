public class Veterinarian {
    String name;
    double salary;

    public Veterinarian(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public Veterinarian() {
    }

    public void vaccinate(Animal animal) {
        animal.setVaccinated(true);
        System.out.println(animal.getName() + " esta vacunado");
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
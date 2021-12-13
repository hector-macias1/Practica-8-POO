import java.util.ArrayList;
import java.util.Scanner;

public class Zoo {
    //Variables de la clase ListaAlumnos
    String name;
    int age;
    int opcion;
    double salary;

    String string = "";

    //Constructores
    Scanner sc = new Scanner(System.in);
    Veterinarian veterinarian = new Veterinarian();

    //ArrayList de objetos de Alumno
    ArrayList<Animal> animalArray = new ArrayList<Animal>();
    

    public void CapturarAnimales() {
        System.out.println("\nIngrese el nombre del animal: ");
        name = sc.nextLine();
        System.out.println("Ingrese la edad del animal: ");
        age = sc.nextInt();
        sc.nextLine();
        System.out.println("Seleccione la especie: (ingresar numero)");
        System.out.println("1. Perro");
        System.out.println("2. Gato");
        System.out.println("3. Leon");
        System.out.println("4. Jirafa");
        opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion) {
            case 1:
                Dog dog = new Dog(name, age);
                animalArray.add(dog);
                break;
            case 2:
                Cat cat = new Cat(name, age);
                animalArray.add(cat);
                break;
            case 3:
                Lion lion = new Lion(name, age);
                animalArray.add(lion);
                break;
            case 4:
                Giraffe giraffe = new Giraffe(name, age);
                animalArray.add(giraffe);
                break;
        }

        System.out.println(animalArray.size());
    }

    public void ImprimirAnimales() {
        System.out.println(animalArray);
        for(Animal a: animalArray){
            System.out.println("\nNombre: "+ a.getName());
            System.out.println("Edad: "+ a.getAge());
        }
    }

    public void Vacunar() {
        System.out.println("\nEscriba el nombre del animal: ");
        name = sc.nextLine();
        for(int i = 0; i < animalArray.size(); i++) {
            if(animalArray.get(i).getName() == name) {
                veterinarian.vaccinate(animalArray.get(i));
            }
        }
    }

    public void CapturarVeterinaro() {
        System.out.println("\nEscriba el nombre del veterinario: ");
        name = sc.nextLine();
        System.out.println("Escriba su salario: ");
        salary = sc.nextDouble();

        Veterinarian veterinario1 = new Veterinarian(name, salary);
    }

    public void Comer() {
        System.out.println("\nIngrese los animales a alimenatar: ");
        System.out.println("1. Perros");
        System.out.println("2. Gatos");
        System.out.println("3. Leones");
        System.out.println("4. Jirafas");
        opcion = sc.nextInt();
        sc.nextLine();

        switch(opcion) {
            case 1:
                for(Animal a: animalArray) {
                    if(a instanceof Dog){
                        a.eat();
                    }
                }
                break;
            case 2:
                for(Animal a: animalArray) {
                    if(a instanceof Cat){
                        a.eat();
                    }
                }
                break;
            case 3:
                for(Animal a: animalArray) {
                    if(a instanceof Lion){
                        a.eat();
                    }
                }
                break;
            case 4:
                for(Animal a: animalArray) {
                    if(a instanceof Giraffe){
                        a.eat();
                    }
                }
                break;
        }
    }
    
}
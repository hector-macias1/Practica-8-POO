import java.util.Scanner;

public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Zoo zoo = new Zoo();
        int opcion = 0;

        while(opcion != 6) {
            System.out.println("\nSeleccione una opcion: ");
            System.out.println("1. Registrar animal");
            System.out.println("2. Vacunar animal");
            System.out.println("3. Imprimir lista de animales");
            System.out.println("4. Registrar veterinario");
            System.out.println("5. Alimentar animales");
            System.out.println("6. Salir");

            opcion = sc.nextInt();

            switch(opcion) {
                case 1:
                    zoo.CapturarAnimales();
                    sc.nextLine();
                    break;
                case 2:
                    zoo.Vacunar();
                    sc.nextLine();
                    break;
                case 3:
                    zoo.ImprimirAnimales();
                    sc.nextLine();
                    break;
                case 4:
                    zoo.CapturarVeterinaro();
                    sc.nextLine();
                    break;
                case 5:
                    zoo.Comer();
                    sc.nextLine();
                    break;
                case 6:
                    break;
            }
        }
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class App { 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Object element;
        int option = 0;

        System.out.println("Bienvenido al menu!");
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Seleccione una opcion:" + "\n" + "I-   (1) Insertar un dato" + "\n" + "II-  (2) Mostrar lista" + "\n" +"III- (3) Salir");

                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Ingrese un dato: ");
                        element = input.next();
                        list.addNode(element);
                        System.out.println("Dato ingresado!");
                        break;
                    case 2:
                        System.out.println("Mostrando lista: ");
                        list.print();
                        System.out.println();
                        break;
                    case 3:
                        break;
                    default:
                        throw new InputMismatchException();
                }
            } catch (InputMismatchException e) {
                input.next();
                System.out.println("Por favor, ingrese una opcion valida.");
            }
        } while (option != 3);
        input.close();
    }
}

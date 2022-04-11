import java.util.InputMismatchException;
import java.util.Scanner;

public class App { 
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        int element;
        int option = 0;

        System.out.println("Bienvenido al menú!");
        Scanner input = new Scanner(System.in);
        do {
            try {
                System.out.println("Seleccione una opción:" + "\n" + "i.   (1) Insertar numero" + "\n" + "ii.  (2) Mostrar lista" + "\n" +"iii. (3) Salir");

                option = input.nextInt();
                switch (option) {
                    case 1:
                        System.out.print("Ingrese un número: ");
                        element = input.nextInt();
                        list.addNode(element);
                        System.out.println("Número ingresado!");
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
                System.out.println("Por favor, ingrese una opción válida.");
            }
        } while (option != 3);
        input.close();
    }
}

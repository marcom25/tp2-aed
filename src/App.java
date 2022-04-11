import java.util.Scanner;

public class App { 

    public static void main(String[] args) {

        LinkedList list = new LinkedList();
        int option = 0, element;
        
        Scanner input = new Scanner(System.in);
        
        do {
            try {
                System.out.println("Bienvenido al menú. Por favor, seleccione una opción:" + "\n" + "i.   (1) Insertar numero" + "\n" + "ii.  (2) Mostrar lista" + "\n" +"iii. (3) Salir");
            
                option = input.nextInt();
            
                switch (option) {
                    case 1:
                        try {
                            System.out.println("Ingrese un número");
                            element = input.nextInt();
                            list.addNode(element);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Mostrando lista: ");
                            list.showLinkedList();
                            System.out.println();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 3:
                        break;   
                }
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (option != 3);
        input.close();
    }
}

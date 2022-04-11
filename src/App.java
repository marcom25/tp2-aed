import java.util.Scanner;

public class App { 

    public static void main(String[] args) {

        LinkedList listita = new LinkedList();
        int opcion = 0, el;
        
        Scanner entrada = new Scanner(System.in);
        
        do {
            try {
            
                System.out.println("Bienvenido al menu, por favor seleccione una opcion:" + "\n" + "i.   (1) Insertar numero" + "\n" + "ii.  (2) Mostrar lista" + "\n" +"iii. (3) Salir");
            
                opcion = entrada.nextInt();
            
                switch (opcion) {
                    case 1:
                        try {
                            System.out.println("Ingrese un numero");
                            el = entrada.nextInt();
                            listita.agregarAlInicio(el);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Mostrando lista: ");
                            listita.mostrarLinkedList();
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
        } while (opcion != 3);
    }

}
